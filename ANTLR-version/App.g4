// Define grammar
grammar App;
s : comment | definition | if_loop |function | NEWLINE s | EOF;
if_loop : IF ('(')? conditional_statement (')')? ':' s END (ELIF ('(')? conditional_statement (')')? ':' s END)? (ELSE ':' s END)?;
function : ID ('(') (SPEC_CHAR | equation | function)* ARITH_OPERATORS* (SPEC_CHAR | equation | function)* ARITH_OPERATORS* (SPEC_CHAR | equation | function)* ARITH_OPERATORS* (')');

comment : COMMENT NEWLINE s;
definition : ID ASSIGN_OPERATORS equation s;
conditional_statement: equation CONDITION equation;

value : ID | NUMBER | '"' ~('"')* '"' | 'True' | 'False';
equation : value | value ARITH_OPERATORS equation;

// Lexer Rules
END: 'END';
IF : 'if';
ELIF: 'elif';
ELSE: 'else';
CONDITION : '<' | '<=' | '>' | '>='  | '==' | '!=';
COMMENT :    '#' ~('\n')*;
ASSIGN_OPERATORS : '=' | '+=' | '-=' | '*=' | '/=' | '^=' | '%=';
ARITH_OPERATORS : '+' | '-' | '*' | '/' | '%' | '^';

ID : [a-zA-Z_] [a-zA-Z_0-9]*;
MINUS : '-';
NUMBER : (MINUS)? ('0'..'9')+;

NEWLINE : ('\r'? '\n')+ | '\r';
WHITESPACE : [ \t\r\n]+ -> skip;

SPEC_CHAR : '!' | '@' | '$' | '%' | '(' | ')' | ',';