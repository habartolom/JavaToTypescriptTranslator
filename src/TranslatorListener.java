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

        String modifiers = "";
        if(!ctx.modifier().isEmpty()){
            for(int i = 0; i < ctx.modifier().size(); i++)
                modifiers += TranslateHelper.getTypescriptModifier(ctx.modifier().get(i)) + " ";
        }

        if(ctx.memberDeclaration() != null){
            classBodyDeclaration += TranslateHelper.getTypeScriptMemberDeclaration(ctx.memberDeclaration(), modifiers);
        }

        System.out.print(classBodyDeclaration);

    }

    @Override
    public void enterTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx) {
        String typeDeclaration = TranslateHelper.getStringIndentation();
        typeDeclaration += TranslateHelper.getTypeScriptTypeDeclaration(ctx);
        System.out.print(typeDeclaration);
    }

    @Override
    public void enterInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx) {
        TranslateHelper.startIndentation();
    }

    @Override
    public void exitInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx) {
        TranslateHelper.finishIndentation();
    }

    @Override public void enterInterfaceBodyDeclaration(JavaGrammarParser.InterfaceBodyDeclarationContext ctx) {
        String classBodyDeclaration = TranslateHelper.getStringIndentation();

        if(!ctx.modifier().isEmpty()){
            for(int i = 0; i < ctx.modifier().size(); i++)
                classBodyDeclaration += TranslateHelper.getTypescriptModifier(ctx.modifier().get(i)) + " ";
        }

        if(ctx.interfaceMemberDeclaration() != null){
            classBodyDeclaration += TranslateHelper.getTypeScriptInterfaceMemberDeclaration(ctx.interfaceMemberDeclaration());
        }

        System.out.print(classBodyDeclaration);
    }
}
