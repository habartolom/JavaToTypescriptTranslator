grammar JavaGrammar;

    prog: compilationUnit;

    compilationUnit
        : packageDeclaration? importDeclaration* typeDeclaration* EOF
        | moduleDeclaration EOF
        ;

    packageDeclaration
        : annotation* PACKAGE qualifiedName ';'
        ;

    importDeclaration
        : IMPORT STATIC? qualifiedName ('.' '*')? ';'
        ;

    typeDeclaration
        : classOrInterfaceModifier*
          (classDeclaration | enumDeclaration | interfaceDeclaration | annotationTypeDeclaration | recordDeclaration)
        | ';'
        ;

    modifier
        : classOrInterfaceModifier
        | NATIVE
        | SYNCHRONIZED
        | TRANSIENT
        | VOLATILE
        ;

    classOrInterfaceModifier
        : annotation
        | PUBLIC
        | PROTECTED
        | PRIVATE
        | STATIC
        | ABSTRACT
        | FINAL    // FINAL for class only -- does not apply to interfaces
        | STRICTFP
        | SEALED // Java17
        | NON_SEALED // Java17
        ;

    variableModifier
        : FINAL
        | annotation
        ;

    classDeclaration
        : CLASS identifier typeParameters?
          (EXTENDS typeType)?
          (IMPLEMENTS typeList)?
          (PERMITS typeList)? // Java17
          classBody
        ;

    typeParameters              // Mateo Genericos
        : '<' typeParameter (',' typeParameter)* '>'
        ;

    typeParameter
        : annotation* identifier (EXTENDS annotation* typeBound)?
        ;

    typeBound
        : typeType ('&' typeType)*
        ;

    enumDeclaration
        : ENUM identifier (IMPLEMENTS typeList)? '{' enumConstants? ','? enumBodyDeclarations? '}'
        ;

    enumConstants
        : enumConstant (',' enumConstant)*
        ;

    enumConstant
        : annotation* identifier arguments? classBody?
        ;

    enumBodyDeclarations
        : ';' classBodyDeclaration*
        ;

    interfaceDeclaration
        : INTERFACE identifier typeParameters? (EXTENDS typeList)? interfaceBody
        ;

    classBody
        : '{' classBodyDeclaration* '}'
        ;

    interfaceBody
        : '{' interfaceBodyDeclaration* '}'
        ;

    classBodyDeclaration
        : ';'
        | STATIC? block
        | modifier* memberDeclaration
        ;

    memberDeclaration
        : methodDeclaration
        | genericMethodDeclaration
        | fieldDeclaration
        | constructorDeclaration
        | genericConstructorDeclaration
        | interfaceDeclaration
        | annotationTypeDeclaration
        | classDeclaration
        | enumDeclaration
        | recordDeclaration //Java17
        ;

    /* We use rule this even for void methods which cannot have [] after parameters.
       This simplifies grammar and we can consider void to be a type, which
       renders the [] matching as a context-sensitive issue or a semantic check
       for invalid return type after parsing.
     */
    methodDeclaration
        : typeTypeOrVoid identifier formalParameters ('[' ']')*
          (THROWS qualifiedNameList)?
          methodBody
        ;

    methodBody
        : block
        | ';'
        ;

    typeTypeOrVoid
        : typeType
        | VOID
        ;

    genericMethodDeclaration
        : typeParameters methodDeclaration
        ;

    genericConstructorDeclaration
        : typeParameters constructorDeclaration
        ;

    constructorDeclaration
        : identifier formalParameters (THROWS qualifiedNameList)? constructorBody=block
        ;

    fieldDeclaration
        : typeType variableDeclarators ';'
        ;

    interfaceBodyDeclaration
        : modifier* interfaceMemberDeclaration
        | ';'
        ;

    interfaceMemberDeclaration
        : constDeclaration
        | interfaceMethodDeclaration
        | genericInterfaceMethodDeclaration
        | interfaceDeclaration
        | annotationTypeDeclaration
        | classDeclaration
        | enumDeclaration
        | recordDeclaration // Java17
        ;

    constDeclaration
        : typeType constantDeclarator (',' constantDeclarator)* ';'
        ;

    constantDeclarator
        : identifier ('[' ']')* '=' variableInitializer
        ;

    // Early versions of Java allows brackets after the method name, eg.
    // public int[] return2DArray() [] { ... }
    // is the same as
    // public int[][] return2DArray() { ... }
    interfaceMethodDeclaration
        : interfaceMethodModifier* interfaceCommonBodyDeclaration
        ;

    // Java8
    interfaceMethodModifier
        : annotation
        | PUBLIC
        | ABSTRACT
        | DEFAULT
        | STATIC
        | STRICTFP
        ;

    genericInterfaceMethodDeclaration
        : interfaceMethodModifier* typeParameters interfaceCommonBodyDeclaration
        ;

    interfaceCommonBodyDeclaration
        : annotation* typeTypeOrVoid identifier formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody
        ;

    variableDeclarators
        : variableDeclarator (',' variableDeclarator)*
        ;

    variableDeclarator
        : variableDeclaratorId ('=' variableInitializer)?
        ;

    variableDeclaratorId
        : identifier ('[' ']')*
        ;

    variableInitializer
        : arrayInitializer
        | expression
        ;

    arrayInitializer
        : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
        ;

    classOrInterfaceType
        : identifier typeArguments? ('.' identifier typeArguments?)*
        ;

    typeArgument
        : typeType
        | annotation* '?' ((EXTENDS | SUPER) typeType)?
        ;

    qualifiedNameList
        : qualifiedName (',' qualifiedName)*
        ;

    formalParameters
        : '(' ( receiverParameter?
              | receiverParameter (',' formalParameterList)?
              | formalParameterList?
              ) ')'
        ;

    receiverParameter
        : typeType (identifier '.')* THIS
        ;

    formalParameterList
        : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
        | lastFormalParameter
        ;

    formalParameter
        : variableModifier* typeType variableDeclaratorId
        ;

    lastFormalParameter
        : variableModifier* typeType annotation* '...' variableDeclaratorId
        ;

    // local variable type inference
    lambdaLVTIList
        : lambdaLVTIParameter (',' lambdaLVTIParameter)*
        ;

    lambdaLVTIParameter
        : variableModifier* VAR identifier
        ;

    qualifiedName
        : identifier ('.' identifier)*
        ;

    literal
        : integerLiteral
        | floatLiteral
        | CHAR_LITERAL
        | STRING_LITERAL
        | BOOL_LITERAL
        | NULL_LITERAL
        | TEXT_BLOCK // Java17
        ;

    integerLiteral
        : DECIMAL_LITERAL
        | HEX_LITERAL
        | OCT_LITERAL
        | BINARY_LITERAL
        ;

    floatLiteral
        : FLOAT_LITERAL
        | HEX_FLOAT_LITERAL
        ;

    // ANNOTATIONS
    altAnnotationQualifiedName
        : (identifier DOT)* '@' identifier
        ;

    annotation
        : ('@' qualifiedName | altAnnotationQualifiedName) ('(' ( elementValuePairs | elementValue )? ')')?
        ;

    elementValuePairs
        : elementValuePair (',' elementValuePair)*
        ;

    elementValuePair
        : identifier '=' elementValue
        ;

    elementValue
        : expression
        | annotation
        | elementValueArrayInitializer
        ;

    elementValueArrayInitializer
        : '{' (elementValue (',' elementValue)*)? (',')? '}'
        ;

    annotationTypeDeclaration
        : '@' INTERFACE identifier annotationTypeBody
        ;

    annotationTypeBody
        : '{' (annotationTypeElementDeclaration)* '}'
        ;

    annotationTypeElementDeclaration
        : modifier* annotationTypeElementRest
        | ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
        ;

    annotationTypeElementRest
        : typeType annotationMethodOrConstantRest ';'
        | classDeclaration ';'?
        | interfaceDeclaration ';'?
        | enumDeclaration ';'?
        | annotationTypeDeclaration ';'?
        | recordDeclaration ';'? // Java17
        ;

    annotationMethodOrConstantRest
        : annotationMethodRest
        | annotationConstantRest
        ;

    annotationMethodRest
        : identifier '(' ')' defaultValue?
        ;

    annotationConstantRest
        : variableDeclarators
        ;

    defaultValue
        : DEFAULT elementValue
        ;

    // MODULES - Java9

    moduleDeclaration
        : OPEN? MODULE qualifiedName moduleBody
        ;

    moduleBody
        : '{' moduleDirective* '}'
        ;

    moduleDirective
        : REQUIRES requiresModifier* qualifiedName ';'
        | EXPORTS qualifiedName (TO qualifiedName)? ';'
        | OPENS qualifiedName (TO qualifiedName)? ';'
        | USES qualifiedName ';'
        | PROVIDES qualifiedName WITH qualifiedName ';'
        ;

    requiresModifier
        : TRANSITIVE
        | STATIC
        ;

    // RECORDS - Java 17

    recordDeclaration
        : RECORD identifier typeParameters? recordHeader
          (IMPLEMENTS typeList)?
          recordBody
        ;

    recordHeader
        : '(' recordComponentList? ')'
        ;

    recordComponentList
        : recordComponent (',' recordComponent)*
        ;

    recordComponent
        : typeType identifier
        ;

    recordBody
        : '{' classBodyDeclaration* '}'
        ;

    // STATEMENTS / BLOCKS

    block
        : '{' blockStatement* '}'
        ;

    blockStatement
        : localVariableDeclaration ';'
        | statement
        | localTypeDeclaration
        ;

    localVariableDeclaration
        : variableModifier* typeType variableDeclarators
        ;

    identifier
        : IDENTIFIER
        | MODULE
        | OPEN
        | REQUIRES
        | EXPORTS
        | OPENS
        | TO
        | USES
        | PROVIDES
        | WITH
        | TRANSITIVE
        | YIELD
        | SEALED
        | PERMITS
        | RECORD
        | VAR
        ;

    localTypeDeclaration
        : classOrInterfaceModifier*
          (classDeclaration | interfaceDeclaration | recordDeclaration)
        | ';'
        ;

    statement
        : blockLabel=block
        | ASSERT expression (':' expression)? ';'                   // Mateo
        | IF parExpression statement (ELSE statement)?              // Kevin
        | FOR '(' forControl ')' statement                          //Harold
        | WHILE parExpression statement                                 //Harold
        | DO statement WHILE parExpression ';'                          //Harold
        | TRY block (catchClause+ finallyBlock? | finallyBlock)         // Kevin
        | TRY resourceSpecification block catchClause* finallyBlock?         // Kevin
        | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'          // Kevin
        | SYNCHRONIZED parExpression block
        | RETURN expression? ';'         // Mateo
        | THROW expression ';'         // Mateo
        | BREAK identifier? ';'         // Harold y Kevin
        | CONTINUE identifier? ';'         // Harold
        | YIELD expression ';' // Java17
        | SEMI
        | statementExpression=expression ';'
        | switchExpression ';'? // Java17
        | identifierLabel=identifier ':' statement
        ;

    catchClause
        : CATCH '(' variableModifier* catchType identifier ')' block
        ;

    catchType
        : qualifiedName ('|' qualifiedName)*
        ;

    finallyBlock
        : FINALLY block
        ;

    resourceSpecification
        : '(' resources ';'? ')'
        ;

    resources
        : resource (';' resource)*
        ;

    resource
        : variableModifier* ( classOrInterfaceType variableDeclaratorId | VAR identifier ) '=' expression
        | identifier
        ;

    /** Matches cases then statements, both of which are mandatory.
     *  To handle empty cases at the end, we add switchLabel* to statement.
     */
    switchBlockStatementGroup
        : switchLabel+ blockStatement+
        ;

    switchLabel
        : CASE (constantExpression=expression | enumConstantName=IDENTIFIER | typeType varName=identifier) ':'
        | DEFAULT ':'
        ;

    forControl
        : enhancedForControl
        | forInit? ';' expression? ';' forUpdate=expressionList?
        ;

    forInit
        : localVariableDeclaration
        | expressionList
        ;

    enhancedForControl
        : variableModifier* (typeType | VAR) variableDeclaratorId ':' expression
        ;

    // EXPRESSIONS

    parExpression
        : '(' expression ')'
        ;

    expressionList
        : expression (',' expression)*
        ;

    methodCall
        : identifier '(' expressionList? ')'
        | THIS '(' expressionList? ')'
        | SUPER '(' expressionList? ')'
        ;

    expression
        : primary
        | expression bop='.'
          (
             identifier
           | methodCall
           | THIS
           | NEW nonWildcardTypeArguments? innerCreator
           | SUPER superSuffix
           | explicitGenericInvocation
          )
        | expression '[' expression ']'
        | methodCall
        | NEW creator
        | '(' annotation* typeType ('&' typeType)* ')' expression
        | expression postfix=('++' | '--')
        | prefix=('+'|'-'|'++'|'--') expression
        | prefix=('~'|'!') expression
        | expression bop=('*'|'/'|'%') expression
        | expression bop=('+'|'-') expression
        | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
        | expression bop=('<=' | '>=' | '>' | '<') expression
        | expression bop=INSTANCEOF (typeType | pattern)
        | expression bop=('==' | '!=') expression
        | expression bop='&' expression
        | expression bop='^' expression
        | expression bop='|' expression
        | expression bop='&&' expression
        | expression bop='||' expression
        | <assoc=right> expression bop='?' expression ':' expression
        | <assoc=right> expression
          bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
          expression
        | lambdaExpression // Java8
        | switchExpression // Java17

        // Java 8 methodReference
        | expression '::' typeArguments? identifier
        | typeType '::' (typeArguments? identifier | NEW)
        | classType '::' typeArguments? NEW
        ;

    // Java17
    pattern
        : variableModifier* typeType annotation* identifier
        ;

    // Java8
    lambdaExpression
        : lambdaParameters '->' lambdaBody
        ;

    // Java8
    lambdaParameters
        : identifier
        | '(' formalParameterList? ')'
        | '(' identifier (',' identifier)* ')'
        | '(' lambdaLVTIList? ')'
        ;

    // Java8
    lambdaBody
        : expression
        | block
        ;

    primary
        : '(' expression ')'
        | THIS
        | SUPER
        | literal
        | identifier
        | typeTypeOrVoid '.' CLASS
        | nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments)
        ;

    // Java17
    switchExpression
        : SWITCH parExpression '{' switchLabeledRule* '}'
        ;

    // Java17
    switchLabeledRule
        : CASE (expressionList | NULL_LITERAL | guardedPattern) (ARROW | COLON) switchRuleOutcome
        | DEFAULT (ARROW | COLON) switchRuleOutcome
        ;

    // Java17
    guardedPattern
        : '(' guardedPattern ')'
        | variableModifier* typeType annotation* identifier ('&&' expression)*
        | guardedPattern '&&' expression
        ;

    // Java17
    switchRuleOutcome
        : block
        | blockStatement*
        ;

    classType
        : (classOrInterfaceType '.')? annotation* identifier typeArguments?
        ;

    creator
        : nonWildcardTypeArguments createdName classCreatorRest
        | createdName (arrayCreatorRest | classCreatorRest)
        ;

    createdName
        : identifier typeArgumentsOrDiamond? ('.' identifier typeArgumentsOrDiamond?)*
        | primitiveType
        ;

    innerCreator
        : identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
        ;

    arrayCreatorRest
        : '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
        ;

    classCreatorRest
        : arguments classBody?
        ;

    explicitGenericInvocation
        : nonWildcardTypeArguments explicitGenericInvocationSuffix
        ;

    typeArgumentsOrDiamond
        : '<' '>'
        | typeArguments
        ;

    nonWildcardTypeArgumentsOrDiamond
        : '<' '>'
        | nonWildcardTypeArguments
        ;

    nonWildcardTypeArguments
        : '<' typeList '>'
        ;

    typeList
        : typeType (',' typeType)*
        ;

    typeType
        : annotation* (classOrInterfaceType | primitiveType) (annotation* '[' ']')*
        ;

    primitiveType
        : BOOLEAN
        | CHAR
        | BYTE
        | SHORT
        | INT
        | LONG
        | FLOAT
        | DOUBLE
        ;

    typeArguments
        : '<' typeArgument (',' typeArgument)* '>'
        ;

    superSuffix
        : arguments
        | '.' typeArguments? identifier arguments?
        ;

    explicitGenericInvocationSuffix
        : SUPER superSuffix
        | identifier arguments
        ;

    arguments
        : '(' expressionList? ')'
        ;


    // Keywords

    ABSTRACT:           'abstract';
    ASSERT:             'assert';
    BOOLEAN:            'boolean';
    BREAK:              'break';
    BYTE:               'byte';
    CASE:               'case';
    CATCH:              'catch';
    CHAR:               'char';
    CLASS:              'class';
    CONST:              'const';
    CONTINUE:           'continue';
    DEFAULT:            'default';
    DO:                 'do';
    DOUBLE:             'double';
    ELSE:               'else';
    ENUM:               'enum';
    EXTENDS:            'extends';
    FINAL:              'final';
    FINALLY:            'finally';
    FLOAT:              'float';
    FOR:                'for';
    IF:                 'if';
    GOTO:               'goto';
    IMPLEMENTS:         'implements';
    IMPORT:             'import';
    INSTANCEOF:         'instanceof';
    INT:                'int';
    INTERFACE:          'interface';
    LONG:               'long';
    NATIVE:             'native';
    NEW:                'new';
    PACKAGE:            'package';
    PRIVATE:            'private';
    PROTECTED:          'protected';
    PUBLIC:             'public';
    RETURN:             'return';
    SHORT:              'short';
    STATIC:             'static';
    STRICTFP:           'strictfp';
    SUPER:              'super';
    SWITCH:             'switch';
    SYNCHRONIZED:       'synchronized';
    THIS:               'this';
    THROW:              'throw';
    THROWS:             'throws';
    TRANSIENT:          'transient';
    TRY:                'try';
    VOID:               'void';
    VOLATILE:           'volatile';
    WHILE:              'while';

    // Module related keywords
    MODULE:             'module';
    OPEN:               'open';
    REQUIRES:           'requires';
    EXPORTS:            'exports';
    OPENS:              'opens';
    TO:                 'to';
    USES:               'uses';
    PROVIDES:           'provides';
    WITH:               'with';
    TRANSITIVE:         'transitive';

    // Local Variable Type Inference
    VAR:                'var'; // reserved type name

    // Switch Expressions
    YIELD:              'yield';

    // Records
    RECORD:             'record';

    // Sealed Classes
    SEALED:             'sealed';
    PERMITS:            'permits';
    NON_SEALED:         'non-sealed';

    // Literals

    DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
    HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
    OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
    BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

    FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
                 |       Digits (ExponentPart [fFdD]? | [fFdD])
                 ;

    HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

    BOOL_LITERAL:       'true'
                |       'false'
                ;

    CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

    STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
    TEXT_BLOCK:         '"""' [ \t]* [\r\n] (. | EscapeSequence)*? '"""';
    NULL_LITERAL:       'null';
    // Separators
    LPAREN:             '(';
    RPAREN:             ')';
    LBRACE:             '{';
    RBRACE:             '}';
    LBRACK:             '[';
    RBRACK:             ']';
    SEMI:               ';';
    COMMA:              ',';
    DOT:                '.';
    // Operators
    ASSIGN:             '=';
    GT:                 '>';
    LT:                 '<';
    BANG:               '!';
    TILDE:              '~';
    QUESTION:           '?';
    COLON:              ':';
    EQUAL:              '==';
    LE:                 '<=';
    GE:                 '>=';
    NOTEQUAL:           '!=';
    AND:                '&&';
    OR:                 '||';
    INC:                '++';
    DEC:                '--';
    ADD:                '+';
    SUB:                '-';
    MUL:                '*';
    DIV:                '/';
    BITAND:             '&';
    BITOR:              '|';
    CARET:              '^';
    MOD:                '%';
    ADD_ASSIGN:         '+=';
    SUB_ASSIGN:         '-=';
    MUL_ASSIGN:         '*=';
    DIV_ASSIGN:         '/=';
    AND_ASSIGN:         '&=';
    OR_ASSIGN:          '|=';
    XOR_ASSIGN:         '^=';
    MOD_ASSIGN:         '%=';
    LSHIFT_ASSIGN:      '<<=';
    RSHIFT_ASSIGN:      '>>=';
    URSHIFT_ASSIGN:     '>>>=';
    // Java 8 tokens
    ARROW:              '->';
    COLONCOLON:         '::';
    // Additional symbols not defined in the lexical specification
    AT:                 '@';
    ELLIPSIS:           '...';
    // Whitespace and comments
    WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
    COMMENT:            '/*' .*? '*/'    -> channel(HIDDEN);
    LINE_COMMENT:       '//' ~[\r\n]*    -> channel(HIDDEN);

    // Identifiers

    IDENTIFIER:         Letter LetterOrDigit*;

    // Fragment rules

    fragment ExponentPart
        : [eE] [+-]? Digits
        ;

    fragment EscapeSequence
        : '\\' [btnfr"'\\]
        | '\\' ([0-3]? [0-7])? [0-7]
        | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
        ;
    fragment HexDigits
        : HexDigit ((HexDigit | '_')* HexDigit)?
        ;
    fragment HexDigit
        : [0-9a-fA-F]
        ;
    fragment Digits
        : [0-9] ([0-9_]* [0-9])?
        ;
    fragment LetterOrDigit
        : Letter
        | [0-9]
        ;
    fragment Letter
        : [a-zA-Z$_] // these are the "java letters" below 0x7F
        | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
        | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        ;