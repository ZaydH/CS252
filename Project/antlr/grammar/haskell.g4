/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar haskell;

prog : haskell_program;

haskell_program : func haskell_program
                | NEWLINE haskell_program;

func:   NAME ARG_TYPES typesignature NEWLINE funcbody
    ;

typesignature: type (TYPE_SEPARATOR type)*
            ;

funcbody : NAME func_arguments '=' expr NEWLINE funcbody 
         | NEWLINE
         ;

// A type object can either be a type name or a function.
type: TYPE_NAME 
    | type_function
    ;

// Arguments passed to the function if any.
func_arguments : NAME*;

// Function expressions.
expr : INT_VAL (INT_OP INT_VAL)*; // Integer expression



// Format of function as a type.
type_function: '(' typesignature ')'
             ;

// Integer operations
INT_OP : '+' | '-' | '*' | '==' | '/=' | '>' | '<' | '<=' | '>=' ;
TYPE_NAME : '[Int]' | 'Int' | '[Char]' | 'Char';
INT_VAL : [0-9]+;       // Integer values
NAME : ['a-zA-Z0-9]+;  // Names of functions
ARG_TYPES : '::';
TYPE_SEPARATOR : '->';


NEWLINE : '\r'? '\n' ;  //Returns a newline
WS : [ \t]+ -> skip ; // toss out whitespace