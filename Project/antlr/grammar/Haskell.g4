/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Haskell;

program : (func NEWLINE*)*;

func:   FUNC_NAME ARG_TYPES typesignature NEWLINE funcbody NEWLINE;

typesignature: type (TYPE_SEPARATOR type)*
            ;

// A Function body conditions of one or more function statements
funcbody : (func_statement)+;
// A function statement has a function name, arguments, and some expression.
func_statement: FUNC_NAME func_arguments EQUAL_SIGN expr NEWLINE;

// A parameter type can either be a type name or a function.
type: TYPE_NAME 
    | type_function
    ;

// Arguments passed to the function if any.
func_arguments : VAR_NAME*;

// Function expressions.
expr : INT_VAL (INT_OP INT_VAL)*; // Integer expression



// Format of function as a type.
type_function: '(' typesignature ')';

// Integer operations
EQUAL_SIGN : '=';
INT_OP : '+' | '-' | '*' | '==' | '/=' | '>' | '<' | '<=' | '>=' ;
TYPE_NAME : '[Int]' | 'Int' | '[Char]' | 'Char' | 'Bool';
INT_VAL : [0-9]+;       // Integer values
FUNC_NAME : ['a-zA-Z0-9]+;  // Names of functions
VAR_NAME : ['a-zA-Z0-9]+;  // Names of functions
ARG_TYPES : '::';
TYPE_SEPARATOR : '->';  // Separates type in the function definition
NEWLINE : '\r'? '\n' ;  // return newlines to parser (is end-statement signal)
WS : [ \t]+ -> skip ;   // toss out whitespace