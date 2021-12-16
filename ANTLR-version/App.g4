// Define grammar
grammar App;
s : comment | definition | NEWLINE s | FOR |EOF  ;

comment : COMMENT NEWLINE s;
definition : ID ASSIGN_OPERATORS equation s ;
conditional_statement: equation CONDITION equation;

value : ID | NUMBER | '"' ~('"')* '"' | 'True' | 'False';
equation : value | value ARITH_OPERATORS equation ;

while_loop: WHILE ('(')? conditional_statement (')')? ':' s END;
if_loop : IF ('(')? conditional_statement (')')? ':' s END (ELIF ('(')? conditional_statement (')')? ':' s END)? (ELSE ':' s END)?;
for_loop: FOR () IN value ':' s END;

// Lexer Rules
IF : 'if';
ELIF: 'elif';
ELSE: 'else';

WHILE: 'while';
FOR:'for';
IN:'in';
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