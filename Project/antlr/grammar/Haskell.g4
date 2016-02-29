/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Haskell;

program : (NEWLINE* func)*;

func    :  funcPrototype funcbody NEWLINE*;

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
funcStatement: NAME patterMatchingArguments EQUAL_SIGN patternMatchingExpression NEWLINE;

// Encapulates all pattern matching arguments
patterMatchingArguments : patternMatchingArgument*;

// Arguments passed to the function if any.
patternMatchingArgument : NAME
                          //Handle case here paremter is in parentheses.
                        |  LEFT_PARENTHESES patternMatchingArgument RIGHT_PARENTHESES 
                        ; 


// Function expressions.
patternMatchingExpression : INT_VAL (INT_OP INT_VAL)*; // Integer expression

// Format of function as a type.
typeFunction: '(' typeSignature ')';

// Integer operations
LEFT_PARENTHESES : '(';
RIGHT_PARENTHESES : ')';
EQUAL_SIGN : '=';
INT_OP : '+' | '-' | '*' | '==' | '/=' | '>' | '<' | '<=' | '>=' ;
TYPE_NAME : '[Int]' | 'Int' | '[Char]' | 'Char' | 'Bool';
INT_VAL : [0-9]+;       // Integer values
NAME : ['a-zA-Z0-9]+;  // Names of functions
MAIN_FUNCTION : 'main';
ARG_TYPES : '::';
TYPE_SEPARATOR : '->';  // Separates type in the function definition
NEWLINE : '\r'? '\n' ;  // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ;   // toss out whitespace
