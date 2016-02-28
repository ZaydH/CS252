/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar haskell;

prog:   func;

func:   FUNCNAME ARG_TYPES typesignature NEWLINE
    ;

typesignature: TYPE_PARAM 
             | TYPE_PARAM '->' typesignature 
             | '(' typesignature ')'
             ;

FUNCNAME : [()'a-zA-Z]+;
ARG_TYPES : '::';
TYPE_SEPARATOR : '->';
TYPE_PARAM : [a-zA-Z]+;
NEWLINE : '\r'? '\n' ;  //Returns a newline
WS : [ \t]+ -> skip ; // toss out whitespace