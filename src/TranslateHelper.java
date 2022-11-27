import java.util.Collections;
import java.util.List;

public class TranslateHelper {
    public static int indentation = 0;
    public static int spaces = 2;
    public static void startIndentation(){
        System.out.println(getStringIndentation() + "{");
        ++indentation;
    }
    public static void finishIndentation(){
        --indentation;
        System.out.println(getStringIndentation() + "}");
    }

    public static String getStringIndentation(){
        return String.join("", Collections.nCopies(TranslateHelper.indentation * TranslateHelper.spaces, " "));
    }

    public static String getTypescriptModifier(JavaGrammarParser.ModifierContext ctx){

        String modifier = "";

        if(ctx.classOrInterfaceModifier() != null)
            modifier = getTypeScriptClassOrInterfaceModifier(ctx.classOrInterfaceModifier());

        return modifier;
    }

    public static String getTypeScriptClassOrInterfaceModifier(JavaGrammarParser.ClassOrInterfaceModifierContext ctx){

        String typeScriptModifier = "";

        if(ctx.PUBLIC() != null)
            typeScriptModifier = ctx.PUBLIC().getText();

        else if(ctx.PROTECTED() != null)
            typeScriptModifier = ctx.PROTECTED().getText();

        else if(ctx.PRIVATE() != null)
            typeScriptModifier = ctx.PRIVATE().getText();

        return typeScriptModifier;
    }

    public static String getTypeScriptMemberDeclaration(JavaGrammarParser.MemberDeclarationContext ctx){
        String memberDeclaration = "";

        if(ctx.methodDeclaration() != null)
            memberDeclaration = getTypeScriptMethodDeclaration(ctx.methodDeclaration());

        return memberDeclaration;
    }

    public static String getTypeScriptMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx){
        String methodDeclaration = "";

        methodDeclaration += getTypeScriptIdentifier(ctx.identifier()) + " ";
        methodDeclaration += getTypeScriptFormalParameters(ctx.formalParameters());
        methodDeclaration += " : " + getTypeScriptTypeTypeOrVoid(ctx.typeTypeOrVoid());

        return methodDeclaration;
    }

    public static String getTypeScriptTypeTypeOrVoid(JavaGrammarParser.TypeTypeOrVoidContext ctx){
        String typeOrVoid = "void";

        if (ctx.typeType() != null)
            typeOrVoid = getTypeScriptTypeType(ctx.typeType());

        return  typeOrVoid;
    }

    public static String getTypeScriptTypeType(JavaGrammarParser.TypeTypeContext ctx){
        String typeType = "";

        if(ctx.primitiveType() != null)
            typeType +=  getTypeScriptPrimitiveType(ctx.primitiveType());

        if(ctx.classOrInterfaceType() != null)
            typeType += getTypeScriptClassOrInterfaceType(ctx.classOrInterfaceType());

        return typeType;
    }

    public static String getTypeScriptClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx){
        String classOrInterfaceType = "";

        if(ctx.identifier().size() > 0){
            classOrInterfaceType += getTypeScriptIdentifier(ctx.identifier().get(0));
        }
        return classOrInterfaceType;
    }

    public static String getTypeScriptIdentifier(JavaGrammarParser.IdentifierContext ctx){
        String identifier = "";

        if(ctx.IDENTIFIER() != null)
            identifier = ctx.IDENTIFIER().getText();

        return  identifier;
    }

    public static String getTypeScriptPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx){
        String primitiveType = "";

        if(ctx.BOOLEAN() != null)
            primitiveType = ctx.BOOLEAN().getText();

        else if(ctx.CHAR() != null)
            primitiveType = "string";

        else
            primitiveType = "number";

        return primitiveType;
    }

    public static String getTypeScriptFormalParameters(JavaGrammarParser.FormalParametersContext ctx){
        String formalParameters = "(";

        if(ctx.formalParameterList() != null){
            formalParameters += getTypeScriptFormalParameterList(ctx.formalParameterList());
        }

        formalParameters += ")";

        return formalParameters;
    }

    public static String getTypeScriptFormalParameterList(JavaGrammarParser.FormalParameterListContext ctx){
        String formalParameterList = "";

        formalParameterList += getTypeScriptFormalParameter(ctx.formalParameter().get(0));
        for (int i = 1; i < ctx.formalParameter().size(); i++){
            formalParameterList += ", " + getTypeScriptFormalParameter(ctx.formalParameter().get(i));
        }

        return formalParameterList;
    }

    public static String getTypeScriptFormalParameter(JavaGrammarParser.FormalParameterContext ctx){
        String formalParameter = "";

        formalParameter += getTypeScriptIdentifier(ctx.variableDeclaratorId().identifier()) + " : ";
        formalParameter += getTypeScriptTypeType(ctx.typeType());
        formalParameter += getTypeScriptBracketsVariableDeclaratorId(ctx.variableDeclaratorId());

        return formalParameter;
    }

    public static String getTypeScriptBlockStatement(JavaGrammarParser.BlockStatementContext ctx){
        String blockStatement = "";

        if(ctx.localVariableDeclaration() != null)
            blockStatement += geTypeScriptLocalVariableDeclaration(ctx.localVariableDeclaration());
        else if(ctx.statement() != null)
            blockStatement += getTypeScriptStatement(ctx.statement());
        else
            blockStatement += getTypeScriptLocalTypeDeclaration(ctx.localTypeDeclaration());

        return blockStatement;
    }

    public static String geTypeScriptLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx){
        String localVariableDeclaration = "";

        String typeType = getTypeScriptTypeType(ctx.typeType());

        for (int i = 0; i < ctx.variableDeclarators().variableDeclarator().size(); i++){
            String variableDeclaration = getStringIndentation();

            variableDeclaration += getTypeScriptIdentifier(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().identifier()) + " : ";
            variableDeclaration += typeType;
            variableDeclaration += getTypeScriptBracketsVariableDeclaratorId(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId());

            localVariableDeclaration += variableDeclaration + ";\n";
        }

        return localVariableDeclaration;
    }
    public static String getTypeScriptStatement(JavaGrammarParser.StatementContext ctx){
        String statement = "statement";
        return statement;
    }
    public static String getTypeScriptLocalTypeDeclaration(JavaGrammarParser.LocalTypeDeclarationContext ctx){
        String localTypeDeclaration = "localTypeDeclaration";
        return localTypeDeclaration;
    }

    public static String getTypeScriptBracketsVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx){
        String bracketsVariableDeclaratorId = "";

        if(ctx.children.size() > 1){
            for (int i = 1; i < ctx.children.size(); i++){
                bracketsVariableDeclaratorId += ctx.children.get(i).getText();
            }
        }

        return bracketsVariableDeclaratorId;
    }

}
