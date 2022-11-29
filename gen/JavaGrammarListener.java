// Generated from C:/Users/Andrés/Downloads/ProyectoLP_v3/JavaToTypescriptTranslator/grammar\JavaGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JavaGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JavaGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaGrammarParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaGrammarParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JavaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JavaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaGrammarParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaGrammarParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JavaGrammarParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JavaGrammarParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaGrammarParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaGrammarParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JavaGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JavaGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JavaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JavaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JavaGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JavaGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JavaGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JavaGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JavaGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JavaGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JavaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JavaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JavaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JavaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JavaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JavaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(JavaGrammarParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(JavaGrammarParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(JavaGrammarParser.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(JavaGrammarParser.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(JavaGrammarParser.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(JavaGrammarParser.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JavaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JavaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(JavaGrammarParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(JavaGrammarParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaGrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaGrammarParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JavaGrammarParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JavaGrammarParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(JavaGrammarParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(JavaGrammarParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(JavaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(JavaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JavaGrammarParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JavaGrammarParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JavaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JavaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(JavaGrammarParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(JavaGrammarParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(JavaGrammarParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(JavaGrammarParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(JavaGrammarParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(JavaGrammarParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(JavaGrammarParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(JavaGrammarParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(JavaGrammarParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(JavaGrammarParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(JavaGrammarParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(JavaGrammarParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(JavaGrammarParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(JavaGrammarParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(JavaGrammarParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(JavaGrammarParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(JavaGrammarParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(JavaGrammarParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JavaGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JavaGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JavaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JavaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#tryComplement}.
	 * @param ctx the parse tree
	 */
	void enterTryComplement(JavaGrammarParser.TryComplementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#tryComplement}.
	 * @param ctx the parse tree
	 */
	void exitTryComplement(JavaGrammarParser.TryComplementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaGrammarParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaGrammarParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JavaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JavaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JavaGrammarParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JavaGrammarParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaGrammarParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaGrammarParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JavaGrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JavaGrammarParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JavaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JavaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JavaGrammarParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JavaGrammarParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(JavaGrammarParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(JavaGrammarParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(JavaGrammarParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(JavaGrammarParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(JavaGrammarParser.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(JavaGrammarParser.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(JavaGrammarParser.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(JavaGrammarParser.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(JavaGrammarParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(JavaGrammarParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JavaGrammarParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JavaGrammarParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JavaGrammarParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JavaGrammarParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JavaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JavaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JavaGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JavaGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JavaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JavaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JavaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JavaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JavaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JavaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JavaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JavaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JavaGrammarParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JavaGrammarParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JavaGrammarParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JavaGrammarParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JavaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JavaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JavaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JavaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaGrammarParser.ArgumentsContext ctx);
}