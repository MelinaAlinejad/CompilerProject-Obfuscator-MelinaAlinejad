import org.antlr.runtime.tree.CommonTree;
import java.util.Stack;

public class CodeGenerator {
    private final StringBuilder code = new StringBuilder();
    private final Stack<Integer> indentStack = new Stack<>();

    public String generate(CommonTree ast) {
        indentStack.push(0);
        generateNode(ast);
        return code.toString();
    }

    private void generateNode(CommonTree node) {
        if (node == null) return;

        String tokenText = node.getText();

        // تشخیص نوع گره بر اساس متن توکن
        if (tokenText.equals("{")) {
            handleBlock(node);
        } else if (tokenText.equals("int") || tokenText.equals("bool") || tokenText.equals("char")) {
            handleVarDecl(node);
        } else if (tokenText.equals("if")) {
            handleIfStatement(node);
        } else if (tokenText.equals("while")) {
            handleWhileLoop(node);
        } else {
            code.append(tokenText).append(" ");
        }

        for (int i = 0; i < node.getChildCount(); i++) {
            generateNode((CommonTree) node.getChild(i));
        }
    }

    private void handleBlock(CommonTree node) {
        code.append("{\n");
        indentStack.push(indentStack.peek() + 4);
        for (int i = 0; i < node.getChildCount(); i++) {
            indent();
            generateNode((CommonTree) node.getChild(i));
            code.append("\n");
        }
        indentStack.pop();
        indent();
        code.append("}\n");
    }

    private void handleVarDecl(CommonTree node) {
        code.append(node.getChild(0).getText())  // نوع داده
                .append(" ")
                .append(node.getChild(1).getText())  // نام متغیر
                .append(" = ")
                .append(node.getChild(2).getText())  // مقدار
                .append(";");
    }

    private void handleIfStatement(CommonTree node) {
        code.append("if (");
        generateNode((CommonTree) node.getChild(0)); // شرط
        code.append(") ");
        generateNode((CommonTree) node.getChild(1)); // بدنه
    }

    private void handleWhileLoop(CommonTree node) {
        code.append("while (");
        generateNode((CommonTree) node.getChild(0)); // شرط
        code.append(") ");
        generateNode((CommonTree) node.getChild(1)); // بدنه
    }

    private void indent() {
        code.append(" ".repeat(indentStack.peek()));
    }
}
