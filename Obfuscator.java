import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;
import java.nio.file.*;

public class Obfuscator {

    public static void main(String[] args) {
        try {
            String inputPath = "C:\\Users\\aminnet\\Desktop\\p1\\input\\input.mc";
            String inputCode = Files.readString(Paths.get(inputPath));

            CommonTree ast = parse(inputCode);

            applyObfuscations(ast);

            String outputCode = generateCode(ast);

            String outputPath = "C:\\Users\\aminnet\\Desktop\\p1\\output\\output.mc";
            Files.write(Paths.get(outputPath), outputCode.getBytes());

            System.out.println("✅ مبهم‌سازی با موفقیت انجام شد!");

        } catch (Exception e) {
            System.err.println("❌ خطا در اجرای برنامه:");
            e.printStackTrace();
        }
    }

    private static CommonTree parse(String input) throws Exception {
        ANTLRStringStream stream = new ANTLRStringStream(input);
        cp1Lexer lexer = new cp1Lexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        cp1Parser parser = new cp1Parser(tokens);
        return (CommonTree) parser.program().getTree();
    }

    private static void applyObfuscations(CommonTree ast) {
        VariableRenamer renamer = new VariableRenamer();
        renamer.rename(ast);
        renamer.printMappings();

        DeadCodeInserter deadCodeInserter = new DeadCodeInserter();
        deadCodeInserter.insertDeadCode(ast);

        ControlFlowFlattener flattener = new ControlFlowFlattener();
        flattener.flatten(ast);
    }

    private static String generateCode(CommonTree ast) {
        CodeGenerator generator = new CodeGenerator();
        return generator.generate(ast);
    }
}
