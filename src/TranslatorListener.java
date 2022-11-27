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

        String example = TranslateHelper.getStringIndentation();

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

        String typeDeclaration = String.join("", Collections.nCopies(TranslateHelper.indentation * 2, " "));;
        typeDeclaration = TranslateHelper.getTypeScriptTypeDeclaration(ctx);
        System.out.print(typeDeclaration);
    }

    @Override public void enterBlock(JavaGrammarParser.BlockContext ctx) {
        TranslateHelper.startIndentation();

        for(int i = 0; i < ctx.blockStatement().size(); i++){
            String blockStatement = "";
            blockStatement += TranslateHelper.getTypeScriptBlockStatement(ctx.blockStatement().get(i));
            System.out.println(blockStatement);
        }
    }

    @Override public void exitBlock(JavaGrammarParser.BlockContext ctx) {
        TranslateHelper.finishIndentation();
    }

    @Override
    public void enterStatement(JavaGrammarParser.StatementContext ctx) {
    }

    @Override
    public void exitStatement(JavaGrammarParser.StatementContext ctx) {
    }
}
