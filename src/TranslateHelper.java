import java.util.Arrays;
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


    public static String getTypeScriptTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx){
        String typeDeclaration = "";
        if(ctx.classDeclaration() != null)
            typeDeclaration += getTypeScriptClassDeclaration(ctx.classDeclaration());
        if(ctx.interfaceDeclaration() != null)
            typeDeclaration += getTypeScriptInterfaceDeclaration(ctx.interfaceDeclaration());
        if(ctx.enumDeclaration() != null)
            typeDeclaration += getTypeScriptEnumDeclaration(ctx.enumDeclaration());
        return typeDeclaration;
    }

    public static String getTypeScriptClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx){
        String classDeclaration = "class ";
        classDeclaration += ctx.identifier().getText() + " ";
        if(ctx.typeParameters() != null)
            classDeclaration += getTypeScriptTypeParameters(ctx.typeParameters());
        if(ctx.EXTENDS() != null)
            classDeclaration += "extends " + getTypeScriptTypeType(ctx.typeType());
        if(ctx.IMPLEMENTS() != null)
            classDeclaration += "implements " + getTypeScriptTypeList(ctx.typeList());
        return classDeclaration;
    }

    public static String getTypeScriptTypeParameters(JavaGrammarParser.TypeParametersContext ctx){
        String typeParameters = "<" + getTypeScriptTypeParameter(ctx.typeParameter().get(0));
        if(ctx.typeParameter().size() > 1)
            for (int i = 1; i < ctx.typeParameter().size(); i++)
                typeParameters += "| " + getTypeScriptTypeParameter(ctx.typeParameter().get(i));
        typeParameters += "> ";
        return typeParameters;
    }

    public static String getTypeScriptTypeParameter(JavaGrammarParser.TypeParameterContext ctx){
        String typeParameter = ctx.identifier().getText() + " ";
        if(ctx.EXTENDS() != null)
            typeParameter += "extends " + getTypeScriptTypeType(ctx.typeBound().typeType().get(0));
            if(ctx.typeBound().typeType().size() > 1)
                for (int i = 1; 1 < ctx.typeBound().typeType().size(); i++)
                    typeParameter += ", " + getTypeScriptTypeType(ctx.typeBound().typeType().get(i));
        return  typeParameter;
    }

    public static String getTypeScriptTypeList(JavaGrammarParser.TypeListContext ctx){
        String typeList = getTypeScriptTypeType(ctx.typeType().get(0));
        if(ctx.typeType().size() > 1) {
            for (int i = 1; i < ctx.typeType().size(); i++)
                typeList += ", " + getTypeScriptTypeType(ctx.typeType().get(i));
        }
        return typeList;
    }

    public static String getTypeScriptInterfaceDeclaration(JavaGrammarParser.InterfaceDeclarationContext ctx){
        String interfaceDeclaration = "interface ";
        interfaceDeclaration += ctx.identifier().getText() + " ";
        if(ctx.typeParameters() != null)
            interfaceDeclaration += getTypeScriptTypeParameters(ctx.typeParameters());
        return interfaceDeclaration;
    }

    public static String getTypeScriptEnumDeclaration(JavaGrammarParser.EnumDeclarationContext ctx){
        String enumDeclaration = "";
        return enumDeclaration;
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
        methodDeclaration += " : " + getTypeScriptTypeTypeOrVoid(ctx.typeTypeOrVoid()) + "\n";
        methodDeclaration += getTypeScriptMethodBody(ctx.methodBody());

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

        for(int i = 0; i < ctx.LBRACK().size(); i++)
            typeType += "[]";

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

        if(ctx.IDENTIFIER() != null){

            if(ctx.IDENTIFIER().getText().equals("String"))
                identifier = "string";
            else
                identifier = ctx.IDENTIFIER().getText();

        }

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

    public static String getTypeScriptMethodBody(JavaGrammarParser.MethodBodyContext ctx){
        String methodBody = "";

        if(ctx.block() != null)
            methodBody += getTypeScriptBlock(ctx.block());

        return methodBody;
    }

    public static String getTypeScriptBlock(JavaGrammarParser.BlockContext ctx){
        String block = getStringIndentation() + "{\n";
        indentation++;

        for(int i = 0; i < ctx.blockStatement().size(); i++){
            block += getTypeScriptBlockStatement(ctx.blockStatement(i));
        }

        indentation--;
        block += getStringIndentation() + "}\n";

        return block;
    }

    public static String getTypeScriptBlockStatement(JavaGrammarParser.BlockStatementContext ctx){
        String blockStatement = "";

        if(ctx.localVariableDeclaration() != null)
            blockStatement += getTypeScriptLocalVariableDeclaration(ctx.localVariableDeclaration());
        else if(ctx.statement() != null){
            blockStatement += getTypeScriptStatement(ctx.statement());
        }

        return blockStatement;
    }

    public static String getTypeScriptLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx){
        String localVariableDeclaration = getStringIndentation();
        localVariableDeclaration += "let ";

        String typeType = getTypeScriptTypeType(ctx.typeType());

        for (int i = 0; i < ctx.variableDeclarators().variableDeclarator().size(); i++){
            String variableDeclaration = "";

            variableDeclaration += getTypeScriptIdentifier(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().identifier()) + " : ";
            variableDeclaration += typeType;
            variableDeclaration += getTypeScriptBracketsVariableDeclaratorId(ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId());

            if(ctx.variableDeclarators().variableDeclarator(i).variableInitializer() != null)
                variableDeclaration += " = " + getTypeScriptVariableInitializer(ctx.variableDeclarators().variableDeclarator(i).variableInitializer());

            localVariableDeclaration += variableDeclaration + ", ";
        }

        return localVariableDeclaration.substring(0, localVariableDeclaration.length() - 2) + ";\n";
    }

    public static String getTypeScriptStatement(JavaGrammarParser.StatementContext ctx){
        String statement = getStringIndentation();

        if (ctx.block() != null){
            statement += getTypeScriptBlock(ctx.block());
        }

        else if (ctx.ASSERT() != null) {
            statement += "assert" + "(" + getTypeScriptExpression(ctx.expression(0));
            if(ctx.expression().size() > 1)
                statement += ": "+getTypeScriptExpression(ctx.expression(1));
            statement += ")";
        }

        else if (ctx.IF() != null){
            statement += "if (";
            statement += getTypeScriptExpression(ctx.parExpression().expression());
            statement += ")\n";
            statement += getTypeScriptStatement(ctx.statement(0));

            if(ctx.ELSE() != null){
                statement += getStringIndentation() + "else ";
                statement += getTypeScriptStatement(ctx.statement(1)).trim();
            }
        }

        else if (ctx.RETURN() != null) {
            statement += "return";
            if (ctx.expression() != null)
                statement += " " + getTypeScriptExpression(ctx.expression(0)) + ";";
        }

        else if (ctx.THROW() != null) {
            statement += "throw " + getTypeScriptExpression(ctx.expression(0));
        }

        else if (ctx.FOR() != null){
            statement += "for (";
            statement += getTypeScriptForControl(ctx.forControl());
            statement += ")\n";
            statement += getTypeScriptStatement(ctx.statement(0));
        }

        else if (ctx.DO() == null && ctx.WHILE() != null){
            statement += "while (";
            statement += getTypeScriptExpression(ctx.parExpression().expression());
            statement += ")\n";
            statement += getTypeScriptStatement(ctx.statement(0));
        }

        else if (ctx.DO() != null && ctx.WHILE() != null){
            statement += "do ";
            statement += getTypeScriptStatement(ctx.statement(0)).trim();
            statement += " while (";
            statement += getTypeScriptExpression(ctx.parExpression().expression());
            statement += ");\n";
        }

        else if (ctx.TRY() != null){
            statement += "try ";
            statement += getTypeScriptTryComplement(ctx.tryComplement()).trim();
        }

        else if(ctx.statementExpression != null){
            if(ctx.statementExpression.getText().contains("System.out.println") || ctx.statementExpression.getText().contains("System.out.print") || ctx.statementExpression.getText().contains("System.out.printf")){
                statement += "console.log(";
                statement += getTypeScriptExpressionList(ctx.statementExpression.methodCall().expressionList());
                statement += ");";
            }
            else
                statement += getTypeScriptExpression(ctx.statementExpression) + ";";
        }

        return statement + "\n";
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

    public static String getTypeScriptVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx){
        String variableInitializer = "";

        if(ctx.expression() != null)
            variableInitializer += getTypeScriptExpression(ctx.expression());

        if(ctx.arrayInitializer() != null)
            variableInitializer += getTypeScriptArrayInitializer(ctx.arrayInitializer());

        return  variableInitializer;
    }

    public static String getTypeScriptArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx){
        String arrayInitializer = "[";

        String variableInitializer = "";
        for(int i = 0; i < ctx.variableInitializer().size(); i++){
            variableInitializer += getTypeScriptVariableInitializer(ctx.variableInitializer(i)) + ", ";
        }

        arrayInitializer += variableInitializer.substring(0, variableInitializer.length() - 2);
        arrayInitializer += "]";
        return arrayInitializer;
    }

    public static String getTypeScriptExpressionList(JavaGrammarParser.ExpressionListContext ctx){
        String expressionList = getTypeScriptExpression(ctx.expression(0));

        for(int i = 1; i < ctx.expression().size(); i++){
            expressionList += ", " + getTypeScriptExpression(ctx.expression(i));
        }

        return expressionList;
    }

    public static String getTypeScriptExpression(JavaGrammarParser.ExpressionContext ctx){

        String expression = "";

        if(ctx.primary() != null)
            expression += getTypeScriptPrimary(ctx.primary());

        if(ctx.bop != null){
            expression += getTypeScriptExpression(ctx.expression(0));

            if(ctx.expression().size() > 1){
                expression += " " + ctx.bop.getText() + " ";
                expression += getTypeScriptExpression(ctx.expression(1));
            }
        }

        if(ctx.LBRACK() != null){
            expression += getTypeScriptExpression(ctx.expression(0));
            expression += "[";
            expression += getTypeScriptExpression(ctx.expression(1));
            expression += "]";
        }

        if(ctx.methodCall() != null){
            expression += getTypeScriptMethodCall(ctx.methodCall());
        }

        if(ctx.prefix != null){
            expression += ctx.prefix.getText();
            expression += getTypeScriptExpression(ctx.expression(0));
        }

        if(ctx.postfix != null){
            expression += getTypeScriptExpression(ctx.expression(0));
            expression += ctx.postfix.getText();
        }

        if(ctx.NEW() != null){
            expression += getTypeScriptCreator(ctx.creator());
        }

        return expression;
    }

    public static String getTypeScriptPrimary(JavaGrammarParser.PrimaryContext ctx){
        String primary = "";

        if(ctx.identifier() != null)
            primary += getTypeScriptIdentifier(ctx.identifier());

        if(ctx.literal() != null)
            primary += getTypeScriptLiteral(ctx.literal());

        return primary;
    }

    public static String getTypeScriptMethodCall(JavaGrammarParser.MethodCallContext ctx){
        String methodCall = "";

        methodCall += getTypeScriptIdentifier(ctx.identifier());
        methodCall += "(";

        if(ctx.expressionList() != null)
            methodCall += getTypeScriptExpressionList(ctx.expressionList());

        methodCall += ")";

        return methodCall;
    }

    public static String getTypeScriptLiteral(JavaGrammarParser.LiteralContext ctx){
        String literal = "";
        literal += ctx.getText();

        return literal;
    }

    public static String getTypeScriptCreator(JavaGrammarParser.CreatorContext ctx){
        String creator = "";

        if(ctx.classCreatorRest() != null){
            creator += "new ";
            creator += getTypeScriptCreatedName(ctx.createdName());
            creator += getTypeScriptClassCreatorRest(ctx.classCreatorRest());
        }

        if(ctx.arrayCreatorRest() != null)
            creator += getTypeScriptArrayCreatorRest(ctx.arrayCreatorRest());

        return creator;
    }

    public static String getTypeScriptCreatedName(JavaGrammarParser.CreatedNameContext ctx){
        String createdName = "";

        if(!ctx.identifier().isEmpty())
            createdName += getTypeScriptIdentifier(ctx.identifier(0));

        return createdName;
    }

    public static String getTypeScriptClassCreatorRest(JavaGrammarParser.ClassCreatorRestContext ctx){
        String classCreatorRest = "";

        classCreatorRest += getTypeScriptArguments(ctx.arguments());

        return classCreatorRest;
    }

    public static String getTypeScriptArrayCreatorRest(JavaGrammarParser.ArrayCreatorRestContext ctx){
        String arrayCreatorRest = "";

        if(ctx.arrayInitializer() != null)
            arrayCreatorRest += getTypeScriptArrayInitializer(ctx.arrayInitializer());

        if(ctx.expression().size() == 1){
            arrayCreatorRest += "new Array(";
            arrayCreatorRest += getTypeScriptExpression(ctx.expression(0));
            arrayCreatorRest += ")";
        }

        if(ctx.expression().size() > 1){
            boolean allDimensionsAreDefined = ctx.expression().size() == ctx.LBRACK().size()
                    && ctx.expression().stream().allMatch(x -> x.primary() != null
                        && x.primary().literal() != null
                        && x.primary().literal().integerLiteral() != null
                        && x.primary().literal().integerLiteral().DECIMAL_LITERAL() != null);

            if(allDimensionsAreDefined){
                int dimensions = ctx.expression().size();
                arrayCreatorRest += "new Array(" + Integer.parseInt(ctx.expression(dimensions - 1).getText()) + ")";

                for(int i = dimensions - 2; i >= 0; i--){
                    arrayCreatorRest = String.join(", ", Collections.nCopies(Integer.parseInt(ctx.expression(i).getText()), arrayCreatorRest));
                    arrayCreatorRest = "[" + arrayCreatorRest + "]";
                }
            }
            else{
                arrayCreatorRest = "[]";
            }
        }

        return arrayCreatorRest;
    }

    public static String getTypeScriptArguments(JavaGrammarParser.ArgumentsContext ctx){
        String arguments = "(";
        arguments += getTypeScriptExpressionList(ctx.expressionList());
        arguments += ")";

        return arguments;
    }


    public static String getTypeScriptForControl(JavaGrammarParser.ForControlContext ctx){
        String forControl = "";

        if(ctx.enhancedForControl() == null){
            if(ctx.forInit() != null)
                forControl += getTypeScriptForInit(ctx.forInit());

            if(ctx.expression() != null)
                forControl += " " + getTypeScriptExpression(ctx.expression()) + " ; ";

            if(ctx.expressionList() != null)
                forControl += getTypeScriptExpressionList(ctx.expressionList());
        }

        return forControl;
    }
    public static String getTypeScriptForInit(JavaGrammarParser.ForInitContext ctx){
        String forInit = "";

        if(ctx.localVariableDeclaration() != null){
            String localVariableDeclaration = getTypeScriptLocalVariableDeclaration(ctx.localVariableDeclaration()).trim();
            forInit += localVariableDeclaration.substring(0, localVariableDeclaration.length() - 1) + " ;";
        }

        return forInit;
    }

    public static String getTypeScriptTryComplement(JavaGrammarParser.TryComplementContext ctx){
        String tryComplement = "";

        if(ctx.block() != null){
            tryComplement += getTypeScriptBlock(ctx.block());
        }

        if(ctx.catchClause() != null){
            for(int i = 0; i < ctx.catchClause().size(); i++){
                tryComplement += getTypeScriptCatchClause(ctx.catchClause(i));
            }
        }

        if(ctx.finallyBlock() != null)
            tryComplement += getTypeScriptFinallyBlock(ctx.finallyBlock());

        return tryComplement;
    }

    public static String getTypeScriptCatchClause(JavaGrammarParser.CatchClauseContext ctx){
        String catchClause = getStringIndentation();
        catchClause += ctx.CATCH().getText() + "(" +ctx.catchType().getText() +" "+ ctx.identifier().getText()+")";
        catchClause += getTypeScriptBlock(ctx.block()).trim() + "\n";
        return catchClause;
    }

    public static String getTypeScriptFinallyBlock(JavaGrammarParser.FinallyBlockContext ctx){
        String finallyBlock = getStringIndentation();
        finallyBlock += "finally ";
        finallyBlock += getTypeScriptBlock(ctx.block()).trim() + "\n";
        return finallyBlock;
    }
}
