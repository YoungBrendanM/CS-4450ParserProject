// Define grammar
grammar App;
s : comment (s)? | if_loop (s)? | definition (s)? | NEWLINE (s)? | while_loop (s)? | function (s)? | EOF  ;

while_loop: WHILE ('(')? conditional_statement (')')? ':' s END;
if_loop : IF ('(')? conditional_statement (')')? ':' s END (ELIF ('(')? conditional_statement (')')? ':' s END)? (ELSE ':' s END)?;
function : ID ('(') (SPEC_CHAR | equation | function)* ARITH_OPERATORS* (SPEC_CHAR | equation | function)* ARITH_OPERATORS* (SPEC_CHAR | equation | function)* ARITH_OPERATORS* (')');

comment : COMMENT;
definition : ID ASSIGN_OPERATORS equation;
conditional_statement: equation CONDITION equation (CONJOIN_CONDITION conditional_statement)?;

value : ID | NUMBER | STRING | BOOLEAN;
equation : value | value ARITH_OPERATORS equation;

// Lexer Rules
END: 'END';
IF : 'if';
ELIF: 'elif';
ELSE: 'else';
WHILE: 'while';

BOOLEAN: 'True' | 'False';
CONJOIN_CONDITION: 'and' | 'or';
STRING: '"' ~('"')* '"';
CONDITION: '<' | '<=' | '>' | '>='  | '==' | '!='    ;
ASSIGN_OPERATORS : '=' | '+=' | '-=' | '*=' | '/=' | '^=' | '%='    ;
ARITH_OPERATORS : '+' | '-' | '*' | '/' | '%' | '^' ;

COMMENT :    '#' ~('\n')*   ;

ID : [a-zA-Z_] [a-zA-Z_0-9]*;
MINUS : '-';
NUMBER : (MINUS)? ('0'..'9')+;

NEWLINE : ('\r'? '\n')+ | '\r';
WHITESPACE : [ \t\r\n]+ -> skip;

SPEC_CHAR : '!' | '@' | '$' | '%' | '(' | ')' | ',' | '\'';