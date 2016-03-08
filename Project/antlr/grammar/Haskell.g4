/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Haskell;

// May have exactly one header comment block.
program : headerComment? (NEWLINE* codeBlock)* NEWLINE*;

// A code block is a set of contiguous code.
codeBlock : func | lineComment;

// Placeholder for handling a header comment.
headerComment : HEADER_COMMENT_OPEN (NAME)* HEADER_COMMENT_CLOSE;
// Handle a function
func    :  funcPrototype funcbody NEWLINE*
        |  mainFunction NEWLINE* ; // This is for the main() Function
// Line comment is a comment that takes a whole line.
lineComment : generalComment NEWLINE;

// General comment is any comment after the header.
generalComment : INLINE_COMMENT_SYMBOL (commentWord)*;
commentWord : NAME;

mainFunction : mainPrototype NEWLINE mainHeader NEWLINE (mainStatement)+ NEWLINE; 


// Define the main block.
mainPrototype : MAIN_FUNCTION ARG_TYPE_SEPARATOR IO unitType;
mainHeader : MAIN_FUNCTION EQUAL_SIGN DO;
mainStatement: (patternMatchingTerm)+ NEWLINE;
// Main words can take many forms so allow for different levels of handling.
mainWords : haskellFunctionName  
          | parenMainWord
          | generalMainWord;
parenMainWord : LEFT_PAREN (mainWords)+ RIGHT_PAREN;
generalMainWord : NAME | INT_VAL;

// Basic Function (excluding main)
funcPrototype : functionName ARG_TYPE_SEPARATOR typeSignature returnType NEWLINE ;
// A standard function just has a name.
functionName : NAME;
// A Haskell function definition takes a set of argument.
// This object represents the different haskell types.
typeSignature: (inputType TYPE_SEPARATOR)* ;

// Last type is the return type which every haskell function has.
inputType: type;

// Last type is the return type which every haskell function has.
returnType: type;

// A parameter type can either be a type name or a function.
type: TYPE_NAME | typeFunction | unitType;
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
                        | generalMatchingArgument; 
generalMatchingArgument : NAME;
//Handle case here paremter is in parentheses.
patternMatchParentheses : LEFT_PAREN (patternMatchingArgument)+ RIGHT_PAREN;



// Currently only integer expressions.
patternMatchingExpression : patternMatchingTerm+;
patternMatchingTerm : dollarSignTerm
                    | generalFunctionCall
                    | functionToMethod
                    | haskellFunctionName 
                    | generalPatternMatchingTerm
                    | patternMatchArray 
                    | patternMatchParen;
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

patternMatchArray : LEFT_SQUARE_BRACKET patternMatchingExpression RIGHT_SQUARE_BRACKET;
patternMatchParen : LEFT_PAREN patternMatchingExpression RIGHT_PAREN;
generalPatternMatchingTerm : INT_VAL | INT_OP  | NAME;
generalFunctionCall : FUNC_ARGS_OPEN_PAREN patternMatchingExpression FUNC_ARGS_CLOSE_PAREN;

// Format of function as a type.
typeFunction: '(' typeSignature ')';

// Create a lexer for the Haskell function so I can attach a listener to it.
haskellFunctionName : HASKELL_FUNCTION_NAME;


//----------------------------------------------------------------------//
//                      Definition of Tokens                            //
//----------------------------------------------------------------------//

// Integer operations
LEFT_SQUARE_BRACKET : '[';
RIGHT_SQUARE_BRACKET : '[';
HEADER_COMMENT_OPEN : '{-';
HEADER_COMMENT_CLOSE : '-}';

// For embedded function calls in Haskell, use this to make the
// input parameters comma separated.
FUNC_ARGS_OPEN_PAREN : '((';
FUNC_ARGS_CLOSE_PAREN : '))';

HASKELL_FUNCTIONS_METHODS_IN_SCALA : 'show';

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
INLINE_COMMENT_SYMBOL : '--';
EQUAL_SIGN : '=';
RIGHT_ASSOC_DOLLAR_SIGN : '$';
IO : 'IO';
DO : 'do';
LET : 'let';
ARG_TYPE_SEPARATOR : '::';
TYPE_SEPARATOR : '->';  // Separates type in the function definition
MAIN_FUNCTION : 'main';
INT_VAL : [-]?[0-9]+;       // Integer values
INT_OP : '+' | '-' | '*' | '==' | '/=' | '>' | '<' | '<=' | '>=' ;
TYPE_NAME : '[Int]' | 'Int' | '[Char]' | 'Char' | 'Bool';

HASKELL_FUNCTION_NAME : 'putStrLn' | 'putStr';
UNIT_TYPE : '()';

NEWLINE : '\r'? '\n' ;  // return newlines to parser (is end-statement signal)

NAME : ['a-zA-Z0-9.]+;  // Name of Something

WS : [ \t]+ -> skip ;   // toss out whitespace
