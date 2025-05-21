import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.CommonToken;

public class DeadCodeInserter {
    private static int dummyVarCount = 0;

    // تغییر نام متد به insert و اصلاح دسترسی
    public void insert(CommonTree ast) {
        insertDeadCode(ast);
    }

    private void insertDeadCode(CommonTree node) {
        if (node == null) return;

        // تشخیص بلوک‌ها با متن توکن '{'
        if (node.getText().equals("{")) {
            CommonTree deadVar = createDeadCode();
            node.addChild(deadVar);
        }

        for (int i = 0; i < node.getChildCount(); i++) {
            insertDeadCode((CommonTree) node.getChild(i));
        }
    }

    private CommonTree createDeadCode() {
        CommonTree typeNode = new CommonTree(new CommonToken(0, "int"));
        CommonTree idNode = new CommonTree(new CommonToken(0, "unused" + dummyVarCount++));
        CommonTree assignNode = new CommonTree(new CommonToken(0, "="));
        CommonTree valueNode = new CommonTree(new CommonToken(0, "1234"));

        CommonTree varDecl = new CommonTree(new CommonToken(0, "VARDECL"));
        varDecl.addChild(typeNode);
        varDecl.addChild(idNode);
        varDecl.addChild(assignNode);
        assignNode.addChild(valueNode);

        return varDecl;
    }
}