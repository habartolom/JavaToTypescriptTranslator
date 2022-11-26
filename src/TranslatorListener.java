public class TranslatorListener extends JavaGrammarBaseListener {


    @Override
    public void enterTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx) {
        String example = "";

        if(ctx.classDeclaration() != null){
            example += "class ";
            String nameClass = ctx.classDeclaration().identifier().getText();
            example += nameClass;

            System.out.println(example);
        }

        if (ctx.interfaceDeclaration() != null) {
            example += "interface ";
            String nameClass = ctx.interfaceDeclaration().identifier().getText();
            example += nameClass;

            System.out.println(example);
        }
    }
}
