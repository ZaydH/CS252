/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Haskell;

// May have exactly one header comment block.
program : headerComment? moduleDefinition? (NEWLINE* codeBlock)* NEWLINE*;

// A code block is a set of contiguous code.
codeBlock : func | lineComment;

// Placeholder for handling a header comment.
headerComment : HEADER_COMMENT_OPEN (NAME)* HEADER_COMMENT_CLOSE;
// Line comment is a comment that takes a whole line.
lineComment : generalComment NEWLINE;
// General comment is any comment after the header.
generalComment : INLINE_COMMENT_SYMBOL (commentWord)*;
commentWord : NAME;

// Define a "module" block in Haskell.
moduleDefinition : moduleOpen moduleName
                   moduleFunctionList moduleClose ;
moduleOpen : MODULE_STRING NEWLINE*;
moduleFunctionList : NEWLINE* LEFT_PAREN
                     moduleFunctionName
                     (COMMA moduleFunctionName )* RIGHT_PAREN NEWLINE*;
moduleClose :  NEWLINE* WHERE_STRING;
moduleName : NAME NEWLINE*;
moduleFunctionName : NEWLINE* NAME NEWLINE*;


// Handle a function
func    :  funcPrototype funcbody NEWLINE*
        |  mainFunction NEWLINE* ; // This is for the main() Function


// Define the main block.
mainFunction : mainPrototype NEWLINE? mainHeader NEWLINE? (mainStatement)+ NEWLINE?; 
mainPrototype : MAIN_FUNCTION ARG_TYPE_SEPARATOR IO unitType;
mainHeader : MAIN_FUNCTION EQUAL_SIGN DO?;
mainStatement: monadExpression+ NEWLINE | patternMatchingTerm+ NEWLINE;
// Main words can take many forms so allow for different levels of handling.
mainWords : haskellFunctionName  
          | parenMainWord
          | generalMainWord;
parenMainWord : LEFT_PAREN (mainWords)+ RIGHT_PAREN;
generalMainWord : NAME | INT_VAL;
// Monad expressions have a specific format.  This is handled here.
monadExpression : immutableValueName MONAD_ARROW patternMatchingExpression ;
immutableValueName : NAME;

// Basic Function (excluding main)
funcPrototype : functionName ARG_TYPE_SEPARATOR typeSignature returnType NEWLINE* ;
// A standard function just has a name.
functionName : NAME;
// A Haskell function definition takes a set of argument.
// This object represents the different haskell types.
typeSignature: (inputType TYPE_SEPARATOR)* ;
// Format of function as a type.
typeFunction: '(' (type typeFunctionSeparator)*  type ')';
typeFunctionSeparator : TYPE_SEPARATOR;
// Parse the input types
inputType: type ;
// Last type is the return type which every haskell function has.
returnType: type;

// A parameter type can either be a type name or a function.
type: primitiveTypeName | typeFunction | unitType;
primitiveTypeName : TYPE_NAME;
// Make unitType a lexer so I can put a listener on it.
unitType : UNIT_TYPE;

// A Function body conditions of one or more function statements
funcbody : (funcStatement)+;
// A function statement has a function name, arguments, and some expression.
funcStatement: NAME patternMatchingArguments EQUAL_SIGN patternMatchingExpression NEWLINE;

// Encapulates all pattern matching arguments
patternMatchingArguments : patternMatchingArgument*;

// Arguments passed to the function if any.
patternMatchingArgument : patternMatchParentheses 
                        | concatenatedList 
                        | emptyList 
                        | underScoreTerm
                        | generalMatchingArgument;  // Most general so should be last
generalMatchingArgument : NAME;
//Handle case here paremter is in parentheses.
patternMatchParentheses : LEFT_PAREN (patternMatchingArgument)+ RIGHT_PAREN;
underScoreArgument : underScoreTerm;

// Currently only integer expressions.
patternMatchingExpression : patternMatchingTerm+;
patternMatchingTerm : dollarSignTerm
                    | generalFunctionCall
                    | functionToMethod
                    | haskellFunctionName 
                    | prependTerm
                    | generalPatternMatchingTerm
                    | patternMatchArray 
                    | patternMatchParen
                    | ifStatementPattern
                    | recursiveMain
                    | returnUnitType
                    | concatenatedList 
                    | emptyList 
                    | populatedList
                    | lambdaFunction
                    | NAME ; //Name should always berun last since it the most general.
// Handle an if then else statement
ifStatementPattern : ifTerm  ifStatementExpression
                     thenTerm ifStatementExpression
                     elseTerm ifStatementExpression;
// Handle if-else in Scala
ifStatementExpression : NEWLINE* LEFT_PAREN NEWLINE* patternMatchingExpression NEWLINE* RIGHT_PAREN NEWLINE*;
ifTerm : IF;
thenTerm : THEN;
elseTerm : ELSE;
//Handle Prepend
prependTerm : patternMatchParen colonTerm patternMatchParen;
// Anonymous Function
lambdaFunction : LEFT_PAREN BACKSLASH allLambdaArguments
                 lamdaArgumentsBodySeparator patternMatchingExpression RIGHT_PAREN;
allLambdaArguments : (singleLamdaArgument)+;
singleLamdaArgument : underscoreLambdaArgument | typedLamdaArgument;
underscoreLambdaArgument : underScoreTerm;
lamdaArgumentsBodySeparator : TYPE_SEPARATOR;
typedLamdaArgument : NAME;
lambdaBody : patternMatchingExpression;
// Define lists for pattern matching.
concatenatedList : LEFT_PAREN headList colonTerm tailList RIGHT_PAREN;
headList : patternMatchingTerm;
colonTerm : COLON;
underScoreTerm : UNDERSCORE;
tailList : patternMatchingTerm;
emptyList : LEFT_SQUARE_BRACKET RIGHT_SQUARE_BRACKET;
populatedList : LEFT_SQUARE_BRACKET (listElement COMMA)* listElement RIGHT_SQUARE_BRACKET;
listElement : patternMatchingTerm;
// Handle an array in the expression
dollarSignTerm : RIGHT_ASSOC_DOLLAR_SIGN patternMatchingExpression;
functionToMethod : functionToMethodDollarSign
                 | functionToMethodParen
                 | functionToMethodTerm;
// Some Haskell Functions are actually methods in Scala.
// These are different cases where this may occur.  This is handled
// by the parser.
haskellFunctionToScalaMethodName : HASKELL_FUNCTIONS_METHODS_IN_SCALA;
functionToMethodDollarSign : haskellFunctionToScalaMethodName dollarSignTerm;
functionToMethodParen : haskellFunctionToScalaMethodName patternMatchParen;
functionToMethodTerm : haskellFunctionToScalaMethodName generalPatternMatchingTerm;
recursiveMain : RECURSIVE_MAIN;
returnUnitType : RETURN UNIT_TYPE;

patternMatchArray : LEFT_SQUARE_BRACKET patternMatchingExpression RIGHT_SQUARE_BRACKET;
patternMatchParen : LEFT_PAREN patternMatchingExpression RIGHT_PAREN;
generalPatternMatchingTerm : INT_VAL | INT_OP  | NAME;
generalFunctionCall : FUNC_ARGS_OPEN_PAREN functionCallFunctionName
                      functionArgument* FUNC_ARGS_CLOSE_PAREN;
functionArgument : patternMatchingTerm ;
functionCallFunctionName : NAME | HASKELL_FUNCTION_NAME;

// Create a lexer for the Haskell function so I can attach a listener to it.
haskellFunctionName : HASKELL_FUNCTION_NAME;


//----------------------------------------------------------------------//
//                      Definition of Tokens                            //
//----------------------------------------------------------------------//

// Integer operations
LEFT_SQUARE_BRACKET : '[';
RIGHT_SQUARE_BRACKET : ']';
HEADER_COMMENT_OPEN : '{-';
HEADER_COMMENT_CLOSE : '-}';

// Tokens for a "module" block.
MODULE_STRING : 'module' ;
WHERE_STRING : 'where' ;
COMMA : ',';

// For embedded function calls in Haskell, use this to make the
// input parameters comma separated.
FUNC_ARGS_OPEN_PAREN : '((';
FUNC_ARGS_CLOSE_PAREN : '))';

HASKELL_FUNCTIONS_METHODS_IN_SCALA : 'show' | 'length' ;

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
COLON : ':';
INLINE_COMMENT_SYMBOL : '--';
EQUAL_SIGN : '=';
RIGHT_ASSOC_DOLLAR_SIGN : '$';
UNDERSCORE : '_';
BACKSLASH : '\\';
IO : 'IO';
DO : 'do';
LET : 'let';
IF : 'if';
THEN : 'then';
ELSE : 'else';
RETURN : 'return';
ARG_TYPE_SEPARATOR : '::';
MONAD_ARROW : '<-';
TYPE_SEPARATOR : '->';  // Separates type in the function definition
RECURSIVE_MAIN : '((main))';
MAIN_FUNCTION : 'main';
INT_VAL : [-]?[0-9]+;       // Integer values
INT_OP : '+' | '-' | '*' | '==' | '/=' | '>' | '<' | '<=' | '>=' ;
TYPE_NAME : '[Int]' | 'Int' | '[Char]' | 'Char' | 'Bool';

HASKELL_FUNCTION_NAME : 'putStrLn' | 'putStr' | 'getLine';
UNIT_TYPE : '()';

NEWLINE : '\r'? '\n' ;  // return newlines to parser (is end-statement signal)

NAME : ['a-zA-Z0-9._]+;  // Name of Something

WS : [ \t]+ -> skip ;   // toss out whitespace
