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
func    :  funcPrototype funcbody NEWLINE*;
// Line comment is a comment that takes a whole line.
lineComment : generalComment NEWLINE;

// General comment is any comment after the header.
generalComment : INLINE_COMMENT_SYMBOL (commentWord)*;
commentWord : NAME;

funcPrototype : functionName ARG_TYPES typeSignature returnType NEWLINE ;

// A Haskell function definition takes a set of argument.
// This object represents the different haskell types.
typeSignature: (inputType TYPE_SEPARATOR)* ;

functionName : MAIN_FUNCTION
             | NAME;

// Last type is the return type which every haskell function has.
inputType: type;

// Last type is the return type which every haskell function has.
returnType: type;

// A parameter type can either be a type name or a function.
type: TYPE_NAME | typeFunction;

// A Function body conditions of one or more function statements
funcbody : (funcStatement)+;
// A function statement has a function name, arguments, and some expression.
funcStatement: NAME patternMatchingArguments EQUAL_SIGN patternMatchingExpression NEWLINE;

// Encapulates all pattern matching arguments
patternMatchingArguments : patternMatchingArgument*;

// Arguments passed to the function if any.
patternMatchingArgument : NAME
                          //Handle case here paremter is in parentheses.
                        |  LEFT_PAREN patternMatchingArgument RIGHT_PAREN 
                        ; 


// Currently only integer expressions.
patternMatchingExpression : patternMatchingTerm+;
patternMatchingTerm : INT_VAL 
                     | INT_OP 
                     | LEFT_PAREN patternMatchingExpression RIGHT_PAREN; 

// Format of function as a type.
typeFunction: '(' typeSignature ')';

// Integer operations
HEADER_COMMENT_OPEN : '{-';
HEADER_COMMENT_CLOSE : '-}';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
INLINE_COMMENT_SYMBOL : '--';
EQUAL_SIGN : '=';
INT_OP : '+' | '-' | '*' | '==' | '/=' | '>' | '<' | '<=' | '>=' ;
TYPE_NAME : '[Int]' | 'Int' | '[Char]' | 'Char' | 'Bool';
INT_VAL : [0-9]+;       // Integer values
NAME : ['a-zA-Z0-9.]+;  // Name of Something
MAIN_FUNCTION : 'main';
ARG_TYPES : '::';
TYPE_SEPARATOR : '->';  // Separates type in the function definition
NEWLINE : '\r'? '\n' ;  // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ;   // toss out whitespace
