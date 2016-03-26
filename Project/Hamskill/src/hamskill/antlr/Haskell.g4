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
func    : funcPrototype funcbody NEWLINE*
        | mainFunction NEWLINE*  // This is for the main() Function
        | singleLinePartiallyAppliedFunction NEWLINE*;

// Handles an assignment expression.
singleLinePartiallyAppliedFunction : partiallyAppliedFunctionName assignmentOperator 
                                     assignmentExpression NEWLINE*;
partiallyAppliedFunctionName : NAME ;
assignmentOperator : EQUAL_SIGN;
assignmentExpression : patternMatchingExpression;

// Define the main block.
mainFunction : mainPrototype NEWLINE? mainHeader NEWLINE? (mainStatement)+ NEWLINE?; 
mainPrototype : MAIN_FUNCTION ARG_TYPE_SEPARATOR IO unitType;
mainHeader : MAIN_FUNCTION EQUAL_SIGN DO?;
mainStatement: monadExpression+ NEWLINE | patternMatchingExpression NEWLINE;
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
typeMaybeMonad : LEFT_PAREN MAYBE type RIGHT_PAREN;
typeFunction : LEFT_PAREN (type typeFunctionSeparator)*  type RIGHT_PAREN;
typeFunctionSeparator : TYPE_SEPARATOR;
// Parse the input types
inputType: type ;
// Last type is the return type which every haskell function has.
returnType: type;

// A parameter type can either be a type name or a function.
type: typeMaybeMonad | primitiveTypeName | typeFunction | unitType ;
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
                        | justArgument      // Handle the "Just" argument
                        | nothingArgument   // Handle the "Nothing" argument.
                        | generalMatchingArgument;  // Most general so should be last
generalMatchingArgument : NAME;
//Handle case here paremter is in parentheses.
patternMatchParentheses : LEFT_PAREN (patternMatchingArgument)+ RIGHT_PAREN;
underScoreArgument : underScoreTerm;
// Just argument 
justArgument : JUST patternMatchingArgument;
nothingArgument : NOTHING;

// Currently only integer expressions.
patternMatchingExpression : patternMatchingTerm+;
patternMatchingTerm : dollarSignTerm
                    | lambdaFunction
                    | bindExpression
                    | generalFunctionCall
                    | patternMatchParen
                    | functionToMethod
                    | haskellFunctionName 
                    | prependTerm
                    | generalPatternMatchingTerm
                    | patternMatchArray 
                    | ifStatementPattern
                    | recursiveMain
                    | returnUnitType
                    | concatenatedList 
                    | emptyList 
                    | populatedList
                    | caseTerm
                    | stringTerm
                    | returnStatement
                    | monadUnboxOperator
                    | justStatement
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

//Handle Prepend Operator
prependTerm : patternMatchParen colonTerm patternMatchParen;

// Lambda/Anonymous Function
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

// Handles a "case" statement.
caseTerm : caseStatementAndVariable caseConditions;
caseStatementAndVariable : caseStatement LEFT_PAREN caseVariable RIGHT_PAREN OF NEWLINE;
caseStatement : CASE;
caseVariable : patternMatchingExpression;
caseConditions : (caseGeneralStatement)* caseOtherwiseStatement;
caseGeneralStatement : caseValueCompare caseValueImplementationSeparator caseImplementation;
caseValueCompare : patternMatchingExpression;
caseOtherwiseStatement : otherwiseTerm caseValueImplementationSeparator caseImplementation;
caseImplementation : patternMatchingExpression NEWLINE;
caseValueImplementationSeparator : TYPE_SEPARATOR;
otherwiseTerm : OTHERWISE;

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
recursiveMain : FUNC_ARGS_OPEN_PAREN MAIN_FUNCTION FUNC_ARGS_CLOSE_PAREN;
returnUnitType : RETURN UNIT_TYPE;

patternMatchArray : LEFT_SQUARE_BRACKET patternMatchingExpression RIGHT_SQUARE_BRACKET;
patternMatchParen : LEFT_PAREN patternMatchingExpression RIGHT_PAREN;
generalPatternMatchingTerm : INT_VAL | INT_OP  | NAME;
generalFunctionCall : FUNC_ARGS_OPEN_PAREN functionCallFunctionName
                      functionArgument* FUNC_ARGS_CLOSE_PAREN;
functionArgument : patternMatchingTerm ;
functionCallFunctionName : haskellFunctionName | nonHaskellReservedFunctionName;
nonHaskellReservedFunctionName : NAME;

// Create a lexer for the Haskell function so I can attach a listener to it.
haskellFunctionName : HASKELL_FUNCTION_NAME;
stringTerm : QUOTATION_MARK word* QUOTATION_MARK;
word : NAME;
//stringWords : NAME;

// Integer Monad
monadUnboxing : monadVariableName monadUnboxOperator monadEvaluationExpression;
monadVariableName : NAME;
monadUnboxOperator : MONAD_ARROW;
monadEvaluationExpression : patternMatchingExpression;
// Box an Option Monad
justStatement : JUST patternMatchingExpression;
// Box a Monad generally
returnStatement : RETURN patternMatchingExpression;
// Handle monad chaining via bind.
bindExpression : patternMatchParen (bindFunction)+;
bindFunction : (BIND_OPERATOR patternMatchingExpression);

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
FUNC_ARGS_OPEN_PAREN : '(((';
FUNC_ARGS_CLOSE_PAREN : ')))';

HASKELL_FUNCTIONS_METHODS_IN_SCALA : 'show' | 'length' ;

QUOTATION_MARK : '"';
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
CASE : 'case';
OF : 'of';
IF : 'if';
THEN : 'then';
ELSE : 'else';
RETURN : 'return';
OTHERWISE : 'otherwise';
MAYBE : 'Maybe';
ARG_TYPE_SEPARATOR : '::';
MONAD_ARROW : '<-';
TYPE_SEPARATOR : '->';  // Separates type in the function definition
//RECURSIVE_MAIN : '((main))';
MAIN_FUNCTION : 'main';
INT_VAL : [-]?[0-9]+;       // Integer values
INT_OP : '+' | '-' | '*' | '==' | '>' | '<' | '<=' | '>=' ;
TYPE_NAME : '[Int]' | 'Int' | '[Char]' | 'Char' | 'Bool' | 'String';

HASKELL_FUNCTION_NAME : 'putStrLn' | 'error' | 'putStr' | 'getLine' 
                      | '`div`' | '`mod`' | '/=' | NOTHING;
UNIT_TYPE : '()';

BIND_OPERATOR : '>>=';
JUST : 'Just';
NOTHING : 'Nothing';

NEWLINE : '\r'? '\n' ;  // return newlines to parser (is end-statement signal)

NAME : ['a-zA-Z0-9._]+;  // Name of Something
//ANY_CHAR : ['a-zA-Z0-9._-0-9?*=><+:{}()|!@#$%^&*]+;

WS : [ \t]+ -> skip ;   // toss out whitespace
