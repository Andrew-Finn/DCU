grammar ccal;

program
    :   decl_list function_list MAIN
    ;

decl_list
    :   decl SemiColon decl_list
    |   epsilon
    ;

decl
    :   var_decl
    |   const_decl
    ;

var_decl
    :   VARIABLE ID Colon type
    ;

const_decl
    :   CONSTANT ID Colon type ASSIGNMENT expression
    ;

function_list
    :   function function_list
    |   epsilon
    ;

epsilon // TIL thats what that symbol is called, also null is a reserved keyword in Antlr.
    :   // Also Antlr variables need to be made of ASCII charachters ε -> As variable name causing some serious funkiness
    ;

function
    :   type ID StartParen parameter_list EndParen
        StartBrace
        decl_list
        statement_block
        RETURN StartParen ( expression | epsilon ) EndParen SemiColon
        EndBrace
    ;

type
    :   INTEGER
    |   BOOLEAN
    |   VOID
    ;

parameter_list
    :   nemp_paramerter_list
    |   epsilon
    ;

nemp_paramerter_list
    :   ID Colon type
    |   ID Colon type Comma nemp_paramerter_list
    ;

main
    :   MAIN StartBrace decl_list statement_block EndBrace
    ;

statement_block
    :   statement statement_block | epsilon
    ;

statement
    :   ID ASSIGNMENT expression SemiColon
    |   ID EndParen arg_list StartParen SemiColon
    |   StartBrace statement_block EndBrace
    |   IF condition StartBrace statement_block EndBrace ELSE StartBrace statement_block EndBrace
    |   WHILE condition StartBrace statement_block EndBrace
    |   SKIP_ SemiColon
    ;

expression
    :   fragment_ binary_arith_op fragment_
    |   StartParen expression EndParen
    |   ID StartParen arg_list EndParen
    |   fragment_
    ;

binary_arith_op
    :   PLUS
    |   MINUS
    ;

fragment_
    :   ID
    |   MINUS ID
    |   INT
    |   TRUE
    |   FALSE
    |   StartParen expression EndParen
    ;

condition
    :   TILDE condition
    |   StartParen condition EndParen
    |   expression comparison_op expression
    |   condition ( OR | AND ) condition
    ;

comparison_op
    :   OR
    |   EQUAL
    |   NEQUAL
    |   LT
    |   LE
    |   GT
    |   GE
    ;

arg_list
    :   nemp_arg_list
    |   epsilon
    ;

nemp_arg_list
    :   ID
    |   ID Comma nemp_arg_list
    ;

fragment Digit:            [0-9];
fragment Letter:        [a-zA-Z];
fragment Underscore:         '_';

// 'language is case insensitive' -> Therefor we need to use fragments for each letter used
fragment A:		        'a' | 'A';
fragment B:		        'b' | 'B';
fragment C:		        'c' | 'C';
fragment D:		        'd' | 'D';
fragment E:		        'e' | 'E';
fragment F:		        'f' | 'F';
fragment G:		        'g' | 'G';
fragment H:		        'h' | 'H';
fragment I:		        'i' | 'I';
fragment K:		        'k' | 'K';
fragment L:		        'l' | 'L';
fragment M:		        'm' | 'M';
fragment N:		        'n' | 'N';
fragment O:		        'o' | 'O';
fragment P:		        'p' | 'P';
fragment R:		        'r' | 'R';
fragment S:		        's' | 'S';
fragment T:		        't' | 'T';
fragment U:		        'u' | 'U';
fragment V:		        'v' | 'V';
fragment W:		        'w' | 'W';

// The reserved words in the language are var, const, return, integer, boolean,
// void, main, if, else, true, false, while and skip
VARIABLE:          V A R;
CONSTANT:      C O N S T;
RETURN:      R E T U R N;
INTEGER:   I N T E G E R;
BOOLEAN:   B O O L E A N;
VOID:            V O I D;
MAIN:            M A I N;
IF:                  I F;
ELSE:            E L S E;
TRUE:            T R U E;
FALSE:         F A L S E;
WHILE:         W H I L E;
SKIP_:           S K I P; //skip is reserved -> skip_

// The following are tokens in the language: , ; : = {}( ) + - ∼ || &&
// == != < <= > >
StartParen:      '(';
EndParen:        ')';
StartBrace:      '{';
EndBrace:        '}';
SemiColon:       ';';
Comma:           ',';
Colon:           ':';

ASSIGNMENT:      '=';
MINUS:           '-'; // In spec `-` sign a funky non standard charachter converted to standard. (PDF OCR being funky)
PLUS:            '+';
TILDE:           '~'; // Logical negation (Never seen this syntax)
OR:             '||';
AND:            '&&';
EQUAL:          '==';
NEQUAL:         '!=';
GT:              '>';
LT:              '<';
LE:             '<=';
GE:             '>=';
INT:            '0' | MINUS?[1-9]Digit*; // More complex than need to avoid 09 etc. Assuming -0 is an invalid option.
                                         // However to add support prefixing "MINUS?" would add  -0 support
ID:             Letter (Letter | Digit | Underscore)*; // Must be atleast 1 Char starting with a letter

WHITESPACE:      [ \t\r\n\f]+ -> skip; // Generic
LINE_COMMENT:   '//' ~[\r\n]* -> skip; // Generic
INLINE_COMMENT: '/*' ('/'*? INLINE_COMMENT | ('/'* | '*'*) ~[/*])*? '*'*? '*/' -> skip; // Ref: https://stackoverflow.com/questions/27539351/how-to-handling-nested-comments-in-antlr-lexer
                                                                                        // Spend far to long trying to create a reg ex myself.
