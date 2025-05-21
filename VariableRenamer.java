import org.antlr.runtime.tree.CommonTree;
import java.util.HashMap;
import java.util.Map;

public class VariableRenamer {
    private int counter = 1;
    private Map<String, String> varMap = new HashMap<>();

    public void rename(CommonTree tree) {
        if (tree == null) return;

        // اگر گره فعلی یک شناسه (ID) باشد
        if (tree.getType() == cp1Parser.ID) { // بهتر از cp1Lexer.ID برای AST
            String originalName = tree.getText();

            // اگر قبلاً تغییر داده نشده، نام جدید بساز
            if (!varMap.containsKey(originalName)) {
                String newName = "v" + counter++;
                varMap.put(originalName, newName);
            }

            // اعمال تغییر نام روی توکن
            tree.token.setText(varMap.get(originalName));
        }

        // بازگشتی روی فرزندان درخت
        for (int i = 0; i < tree.getChildCount(); i++) {
            rename((CommonTree) tree.getChild(i));
        }
    }

    public void printMappings() {
        System.out.println("Variable Mappings:");
        for (Map.Entry<String, String> entry : varMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
