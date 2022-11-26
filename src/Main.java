import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        try{
            // create a CharStream that reads from standard input / file
            // create a lexer that feeds off of input CharStream
            JavaGrammarLexer lexer;

            if (args.length>0)
                lexer = new JavaGrammarLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new JavaGrammarLexer(CharStreams.fromStream(System.in));

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            JavaGrammarParser parser = new JavaGrammarParser(tokens);
            ParseTree tree = parser.prog(); // begin parsing at init rule

            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();

            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new TranslatorListener(), tree);
            System.out.println(); // print a \n after translation
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }

    }
}