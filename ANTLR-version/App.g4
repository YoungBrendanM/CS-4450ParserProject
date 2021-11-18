// Define grammar
grammar App;
r : s   | EOF   ;
s : COMMENT NEWLINE r;

// Lexer Rules
COMMENT :    '#' ~('\n')*;
NEWLINE : ('\r'? '\n' | '\r')+   ;