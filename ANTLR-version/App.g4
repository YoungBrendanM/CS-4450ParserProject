// Define grammar
grammar App;
r : s   | EOF   ;
s : COMMENT NEWLINE r;

// Lexer Rules
ARITH_OPERATORS : '+' | '-' | '*' | '/' | '%' | '^' ;
ASSIGN_OPERATORS : '='  | '+='  | '-=' | '*='   | '/='  | '^=' | '%='   ;
CONDITION: '<' | '<=' | '>' | '>='  | '==' | '!='    ;
COMMENT :    '#' ~('\n')*   ;
NEWLINE : ('\r'? '\n' | '\r')+   ;