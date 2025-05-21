import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;

public class Obfuscator {

    public static void main(String[] args) {
        try {
            // خواندن فایل ورودی
            ANTLRFileStream input = new ANTLRFileStream("C:\\Users\\aminnet\\Desktop\\p1\\input\\input.mc", "UTF8");

            // ساخت Lexer و TokenStream
            cp1Lexer lexer = new cp1Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // ساخت Parser و گرفتن AST
            cp1Parser parser = new cp1Parser(tokens);
            cp1Parser.program_return result = parser.program();
            CommonTree ast = (CommonTree) result.getTree();

            // چاپ AST اولیه
            System.out.println("AST اولیه:");
            System.out.println(ast.toStringTree());

            // اجرای تکنیک تغییر نام متغیرها
            VariableRenamer renamer = new VariableRenamer();
            renamer.rename(ast);

            // چاپ نگاشت متغیرها
            renamer.printMappings();

            // چاپ AST نهایی
            System.out.println("AST نهایی:");
            System.out.println(ast.toStringTree());

            // ذخیره خروجی به فایل
            String outputPath = "C:\\Users\\aminnet\\Desktop\\p1\\output\\mc.output";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write(ast.toStringTree());
                System.out.println("✅ خروجی در فایل ذخیره شد: " + outputPath);
            } catch (IOException e) {
                System.err.println("❌ خطا در نوشتن فایل خروجی:");
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.err.println("❌ خطا در اجرای برنامه:");
            e.printStackTrace();
        }

    }
}
