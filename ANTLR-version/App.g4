// Define grammar
grammar App;
s : comment   | EOF   ;
comment : COMMENT NEWLINE s;

// Lexer Rules
ARITH_OPERATORS : '+' | '-' | '*' | '/' | '%' | '^' ;
ASSIGN_OPERATORS : '='  | '+='  | '-=' | '*='   | '/='  | '^=' | '%='   ;
CONDITION: '<' | '<=' | '>' | '>='  | '==' | '!='    ;
COMMENT :    '#' ~('\n')*   ;
NEWLINE : ('\r'? '\n' | '\r')+   ;