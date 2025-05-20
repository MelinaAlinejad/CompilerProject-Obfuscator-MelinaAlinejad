import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        cp1Lexer lex = new cp1Lexer(new ANTLRFileStream("C:\\Users\\aminnet\\Desktop\\p1\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        cp1Parser g = new cp1Parser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}