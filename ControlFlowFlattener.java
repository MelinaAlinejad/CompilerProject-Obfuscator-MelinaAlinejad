import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.CommonToken;

public class ControlFlowFlattener {
    private int labelCounter = 0;

    public void flatten(CommonTree ast) {
        processNodes(ast);
    }

    private void processNodes(CommonTree node) {
        if (node == null) return;

        if (isControlStatement(node)) {
            CommonTree flattened = createFlattenedStructure(node);
            replaceNode(node, flattened);
        }

        for (int i = 0; i < node.getChildCount(); i++) {
            processNodes((CommonTree) node.getChild(i));
        }
    }

    private boolean isControlStatement(CommonTree node) {
        return node.getText().equals("if") ||
                node.getText().equals("while");
    }

    private CommonTree createFlattenedStructure(CommonTree original) {
        // ساختار switch/goto
        CommonTree switchNode = new CommonTree(new CommonToken(cp1Lexer.ID, "switch"));

        // ایجاد label
        String label = "L" + labelCounter++;

        // افزودن ساختار کنترل
        switchNode.addChild(new CommonTree(new CommonToken(cp1Lexer.ID, label)));
        switchNode.addChild(original);

        return switchNode;
    }

    private void replaceNode(CommonTree oldNode, CommonTree newNode) {
        CommonTree parent = (CommonTree) oldNode.getParent();
        if (parent != null) {
            int index = findChildIndex(parent, oldNode);
            if (index != -1) {
                parent.setChild(index, newNode);
            }
        }
    }

    private int findChildIndex(CommonTree parent, CommonTree child) {
        for (int i = 0; i < parent.getChildCount(); i++) {
            if (parent.getChild(i) == child) {
                return i;
            }
        }
        return -1;
    }
}