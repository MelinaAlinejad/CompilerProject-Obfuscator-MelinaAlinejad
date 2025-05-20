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

            // چاپ اولیه AST برای تست
            System.out.println("AST اولیه:");
            System.out.println(ast.toStringTree());

            // TODO: اینجا تکنیک‌های Obfuscation را اعمال کن

            // چاپ AST نهایی (در صورت تغییر)
            System.out.println("AST نهایی:");
            System.out.println(ast.toStringTree());

            // TODO: تولید کد خروجی از AST و ذخیره در mc.output

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
