import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;

public class ControlFlowFlattener {
    private int labelCounter = 0;

    // تغییر نام متد به flattenControlFlow
    public void flattenControlFlow(CommonTree ast) {
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
        return node.getText().equals("if") || node.getText().equals("while");
    }

    private CommonTree createFlattenedStructure(CommonTree original) {
        CommonTree switchNode = new CommonTree(new CommonToken(0, "switch"));
        String label = "L" + labelCounter++;

        CommonTree whileLoop = new CommonTree(new CommonToken(0, "while"));
        whileLoop.addChild(new CommonTree(new CommonToken(0, "1")));

        CommonTree case1 = new CommonTree(new CommonToken(0, "case"));
        case1.addChild(new CommonTree(new CommonToken(0, "1")));
        case1.addChild(original);

        switchNode.addChild(whileLoop);
        switchNode.addChild(case1);

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