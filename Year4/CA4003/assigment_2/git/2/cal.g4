grammar cal;


/* Statements */


prog
    :   decl_list function_list main                                            # progStm
    ;

decl_list
    :   ( decl SemiColon decl_list | )                                          # declListStm
    ;

decl
    :   var_decl                                                                # varDeclRef
    |   const_decl                                                              # constDeclRef
    ;

var_decl
    :   Variable ID Colon type                                                  # varDeclStm
    ;

const_decl
    :   <assoc=right> Constant ID Colon type ASSIGNMENT expression              # constDeclStm
    ;

function_list
    :   ( function function_list | )                                            # funcListStm
    ;

function
    :   type ID O_Paren parameter_list C_Paren Is
        decl_list
        Begin
        statement_block
        Return O_Paren ( expression | empty_statment ) C_Paren SemiColon End    # funcDeclStm
    ;

type
    :   Integer
    |   Boolean
    |   Void
    ;

parameter_list
    :   ( nemp_paramerter_list | )                                              # nonEmptyParamRef
    ;

nemp_paramerter_list
    :   ID Colon type                                                           # singleParamStm
    |   ID Colon type Comma nemp_paramerter_list                                # multipleParamStm
    ;

main
    :   Main Begin decl_list statement_block End                                # mainStm
    ;

statement_block
    :   statement statement_block                                               # stmBlockRef
    |   empty_statment                                                          # emptyStatment
    ;

statement
    :   <assoc=right> ID ASSIGNMENT expression SemiColon                        # assignStm
    |   ID O_Paren argument_list C_Paren SemiColon                              # funcCallStm
    |   Begin statement_block End                                               # beginStm
    |   If condition Begin statement_block End Else Begin statement_block End   # conditionalStm
    |   While condition Begin statement_block End                               # whileStm
    |   Skip SemiColon                                                          # skipStm
    ;

expression
    :   expression binary_arith_op expression                                   # fragBinArithStm
    |   binary_arith_op fragm                                                   # fragUnaArithStm
    |   O_Paren expression C_Paren                                              # parenExpreStm
    |   ID O_Paren argument_list C_Paren                                        # funcCallExpr
    |   fragm                                                                   # fragRef
    ;

condition
    :   <assoc=right> NOT condition                                             # boolNegStm
    |   O_Paren condition C_Paren                                               # parenConditionalStm
    |   expression comp_operators expression                                    # boolArithStm
    |   condition ( OR | AND ) condition                                        # boolEvalStm
    ;

fragm
    :   ID                                                                      # idFrag
    |   MINUS ID                                                                # negationStm
    |   NUMBER                                                                  # intStm
    |   True                                                                    # trueStm
    |   False                                                                   # falseStm
    ;

argument_list
    :   ( nemp_argument_list | )                                                # nonEmptyArgListRef
    ;

nemp_argument_list
    :   ID                                                                      # idArgRef
    |   ID Comma nemp_argument_list                                             # multIdArgRef
    ;

empty_statment
    :                                                                           # emptyStm
    ;

binary_arith_op
    :   PLUS                                                                    # additionStm
    |   <assoc=right> MINUS                                                     # subtractionStm
    ;

comp_operators
    :   OR                                                                      # logOr
    |   EQUAL                                                                   # logEq
    |   NOTEQUAL                                                                # logNEq
    |   LT                                                                      # logLT
    |   LTE                                                                     # logLTE
    |   GT                                                                      # logGT
    |   GTE                                                                     # logGTE
    ;

Variable:               V A R I A B L E;
Constant:               C O N S T A N T;
Return:                 R E T U R N;
Integer:                I N T E G E R;
Boolean:                B O O L E A N;
Void:                   V O I D;
Main:                   M A I N;
If:                     I F;
Else:                   E L S E;
True:                   T R U E;
False:                  F A L S E;
While:                  W H I L E;
Begin:                  B E G I N;
End:                    E N D;
Is:                     I S;
Skip:                   S K I P;

SemiColon:              ';';
Colon:                  ':';
Comma:                  ',';

ID:                     Letter (Letter | Digit | UnderScore)*;
NUMBER:                 MINUS? ( Digit |  NonZero Digit+ );
REAL_N:                 NUMBER Dot NUMBER;

/* Syntax Tokens*/

O_Brace:                '{';
C_Brace:                '}';
O_Bracket:              '[';
C_Bracket:              ']';
O_Paren:                '(';
C_Paren:                ')';

/* Aritmetic Opperators */

MINUS:                  '-';
PLUS:                   '+';

/* Logical Operators */

ASSIGNMENT:             ':=';
NOT:                    '~';
OR:                     '|';
AND:                    '&';
EQUAL:                  '=';
NOTEQUAL:               '!=';
LT:                     '<';
LTE:                    '<=';
GT:                     '>';
GTE:                    '>=';

/* Fragments */

fragment A:             'a'  |  'A';
fragment B:             'b'  |  'B';
fragment C:             'c'  |  'C';
fragment D:             'd'  |  'D';
fragment E:             'e'  |  'E';
fragment F:             'f'  |  'F';
fragment G:             'g'  |  'G';
fragment H:             'h'  |  'H';
fragment I:             'i'  |  'I';
fragment K:             'k'  |  'K';
fragment L:             'l'  |  'L';
fragment M:             'm'  |  'M';
fragment N:             'n'  |  'N';
fragment O:             'o'  |  'O';
fragment P:             'p'  |  'P';
fragment R:             'r'  |  'R';
fragment S:             's'  |  'S';
fragment T:             't'  |  'T';
fragment U:             'u'  |  'U';
fragment V:             'v'  |  'V';
fragment W:             'w'  |  'W';

fragment Letter:        [a-zA-Z];
fragment Digit:         [0-9];
fragment NonZero:       [1-9];
fragment UnderScore:    '_';
fragment Dot:           '.';

/* Skips */
COMMENT_ML:             '/*' (COMMENT_ML|.)*? '*/' -> skip;
COMMENT_SL:             '//' .*? '\n' -> skip;
WS:                     [ \t\n\r]+ -> skip;
