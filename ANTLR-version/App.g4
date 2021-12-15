// Define grammar
grammar App;
s : comment | definition | NEWLINE s | EOF  ;

comment : COMMENT NEWLINE s;
definition : ID ASSIGN_OPERATORS equation s ;
conditional_statement: equation CONDITION equation;

value : ID | NUMBER | '"' ~('"')* '"' | 'True' | 'False';
equation : value | value ARITH_OPERATORS equation ;

while_loop: WHILE ('(')? conditional_statement (')')? ':' s END;

// Lexer Rules
WHILE: 'while';
END: 'END';

CONDITION: '<' | '<=' | '>' | '>='  | '==' | '!='    ;
COMMENT :    '#' ~('\n')*   ;
ASSIGN_OPERATORS : '=' | '+=' | '-=' | '*=' | '/=' | '^=' | '%='    ;
ARITH_OPERATORS : '+' | '-' | '*' | '/' | '%' | '^' ;

ID : [a-zA-Z_] [a-zA-Z_0-9]* ;
MINUS : '-' ;
NUMBER : (MINUS)? ('0'..'9')+;

NEWLINE : ('\r'? '\n')+ | '\r'  ;
WHITESPACE : [ \t\r\n]+ -> skip;