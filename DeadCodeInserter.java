import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;

public class DeadCodeInserter {
    private static int dummyVarCount = 0;

    public void insert(CommonTree ast) {
        insertDeadCode(ast);
    }

    private void insertDeadCode(CommonTree node) {
        if (node == null) return;

        // تشخیص بلوک‌ها با توکن '{' (کد موجود)
        if (node.getType() == cp1Lexer.LBRACE) {
            CommonTree deadVar = createDeadCode();
            node.addChild(deadVar);
        }

        for (int i = 0; i < node.getChildCount(); i++) {
            insertDeadCode((CommonTree) node.getChild(i));
        }
    }

    private CommonTree createDeadCode() {
        // ساختار درخت برای: int unusedN = 1234;

        // 1. نوع داده (int)
        CommonTree typeNode = new CommonTree(new CommonToken(cp1Lexer.INT, "int"));

        // 2. شناسه (unusedX)
        CommonTree idNode = new CommonTree(new CommonToken(cp1Lexer.ID, "unused" + dummyVarCount++));

        // 3. عملگر انتساب (=)
        CommonTree assignNode = new CommonTree(new CommonToken(cp1Lexer.ASSIGN, "="));

        // 4. مقدار (1234)
        CommonTree valueNode = new CommonTree(new CommonToken(cp1Lexer.INT, "1234"));
        assignNode.addChild(valueNode);

        // 5. ساختار کامل متغیر
        CommonTree varDecl = new CommonTree(new CommonToken(cp1Lexer.ASSIGN, "="));
        varDecl.addChild(typeNode);
        varDecl.addChild(idNode);
        varDecl.addChild(assignNode);

        return varDecl;
    }
}