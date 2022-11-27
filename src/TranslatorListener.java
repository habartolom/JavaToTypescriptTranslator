import java.util.Collections;

public class TranslatorListener extends JavaGrammarBaseListener {

    @Override public void enterClassBody(JavaGrammarParser.ClassBodyContext ctx) {
        TranslateHelper.startIndentation();
    }
    @Override public void exitClassBody(JavaGrammarParser.ClassBodyContext ctx) {
        TranslateHelper.finishIndentation();
    }

    @Override public void enterClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx) {
        String classBodyDeclaration = String.join("", Collections.nCopies(TranslateHelper.indentation * 2, " "));

        if(ctx.modifier().size() > 0){
            classBodyDeclaration += TranslateHelper.getTypescriptModifier(ctx.modifier().get(0)) + " ";
        }

        if(ctx.memberDeclaration() != null){
            classBodyDeclaration += TranslateHelper.getTypeScriptMemberDeclaration(ctx.memberDeclaration());
        }

        System.out.println(classBodyDeclaration);
    }

    @Override
    public void enterTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx) {

        String example = String.join("", Collections.nCopies(TranslateHelper.indentation * 2, " "));;

        if(ctx.classDeclaration() != null){
            example += "class ";
            String nameClass = TranslateHelper.getTypeScriptIdentifier(ctx.classDeclaration().identifier());
            example += nameClass;

            System.out.println(example);
        }

        if (ctx.interfaceDeclaration() != null) {
            example += "interface ";
            String nameClass = TranslateHelper.getTypeScriptIdentifier(ctx.classDeclaration().identifier());
            example += nameClass;

            System.out.println(example);
        }
    }

    @Override public void enterBlock(JavaGrammarParser.BlockContext ctx) {
        TranslateHelper.startIndentation();

        for(int i = 0; i < ctx.blockStatement().size(); i++){
            String blockStatement = String.join("", Collections.nCopies(TranslateHelper.indentation * 2, " "));
            blockStatement += TranslateHelper.getTypeScriptBlockStatement(ctx.blockStatement().get(i));
            System.out.println(blockStatement);
        }
    }

    @Override public void exitBlock(JavaGrammarParser.BlockContext ctx) {
        TranslateHelper.finishIndentation();
    }
}
