import java.util.Collections;

public class TranslatorListener extends JavaGrammarBaseListener {

    @Override public void enterClassBody(JavaGrammarParser.ClassBodyContext ctx) {
        TranslateHelper.startIndentation();
    }
    
    @Override public void exitClassBody(JavaGrammarParser.ClassBodyContext ctx) {
        TranslateHelper.finishIndentation();
    }

    @Override public void enterClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx) {
        String classBodyDeclaration = TranslateHelper.getStringIndentation();

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
        String typeDeclaration = TranslateHelper.getStringIndentation();
        typeDeclaration += TranslateHelper.getTypeScriptTypeDeclaration(ctx);
        System.out.print(typeDeclaration);
    }
}
