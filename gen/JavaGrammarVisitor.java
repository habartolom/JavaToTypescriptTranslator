// Generated from C:/Users/kryuk/Documents/JavaToTypescript/grammar\JavaGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(JavaGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaGrammarParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JavaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaGrammarParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaGrammarParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JavaGrammarParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaGrammarParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaGrammarParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JavaGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(JavaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JavaGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JavaGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JavaGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(JavaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JavaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(JavaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCommonBodyDeclaration(JavaGrammarParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JavaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIList(JavaGrammarParser.LambdaLVTIListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIParameter(JavaGrammarParser.LambdaLVTIParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JavaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(JavaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(JavaGrammarParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaGrammarParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(JavaGrammarParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(JavaGrammarParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(JavaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(JavaGrammarParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(JavaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(JavaGrammarParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(JavaGrammarParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(JavaGrammarParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(JavaGrammarParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(JavaGrammarParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#recordHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordHeader(JavaGrammarParser.RecordHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#recordComponentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponentList(JavaGrammarParser.RecordComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#recordComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponent(JavaGrammarParser.RecordComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#recordBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordBody(JavaGrammarParser.RecordBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JavaGrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(JavaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaGrammarParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JavaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(JavaGrammarParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaGrammarParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JavaGrammarParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JavaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JavaGrammarParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaGrammarParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaGrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(JavaGrammarParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(JavaGrammarParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabeledRule(JavaGrammarParser.SwitchLabeledRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#guardedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedPattern(JavaGrammarParser.GuardedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRuleOutcome(JavaGrammarParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JavaGrammarParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JavaGrammarParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JavaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JavaGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JavaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JavaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JavaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JavaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(JavaGrammarParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JavaGrammarParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JavaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(JavaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaGrammarParser.ArgumentsContext ctx);
}