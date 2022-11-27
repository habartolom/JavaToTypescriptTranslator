public class TranslatorListener extends JavaGrammarBaseListener {

    @Override public void enterClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx) {
        String classBodyDeclaration = "";

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

        String example = "";

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
}
