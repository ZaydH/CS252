/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar ScalaOutput;

// Highest level of the parser.
reformat : spaceSeparatedTerm*;
spaceSeparatedTerm : singleTerm;
singleTerm : parenthesesTerm 
           | list 
           | normalWord 
           | monadReformatter 
           | newLineTerm;
            
// Handle a newline
newLineTerm: NEWLINE;

//Parentheses Reformatter
parenthesesTerm : LEFT_PAREN reformat RIGHT_PAREN;

// Monad reformatting
monadReformatter : none | somePhrase ;
none : NONE;            
somePhrase : SOME '(' singleTerm* ')';
               
// Arrays and lists in Scala have different formats that in Haskell so
// they need special reformatting.
list : (LIST_KEYWORD | ARRAY_KEYWORD) '(' (listTerm COMMA)* listTerm? ')';
listTerm : singleTerm;

// This is any non-reserved word.
normalWord : GENERAL_WORD;  


//--------------------- Define the Tokens ---------------------------//
NONE : 'None';
SOME : 'Some';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
COMMA : ',';
ARRAY_KEYWORD : 'Array';
LIST_KEYWORD : 'List';

GENERAL_WORD : ['a-zA-Z0-9._]+;  // Name of Something

NEWLINE : '\r'? '\n' ;  // return newlines to parser (is end-statement signal)

WS : [ \t]+ -> skip ;   // toss out whitespace
