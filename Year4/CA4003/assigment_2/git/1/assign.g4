grammar assign;

prog:  			decl_lst func_lst main;
stm: 			ID ASSIGN expr SEMI														#AssignStm
				| ID LBR arglst RBR SEMI												#ArgStm
				| Begin stmblock End													#BlockStm
				| If cond Begin stmblock End Else Begin stmblock End 					#IfStm
				| While cond Begin stmblock End 										#WhileStm
				| Skipping SEMI															#Skip
				;
expr:			frag bin_arith_op frag													#BinOp
				| LBR expr RBR															#ExprOp
				| ID LBR arglst RBR														#ArgOp
				| frag																	#FragOp
				;
cond: 			NEG cond 																#NegCond
				| LBR cond RBR															#LRCond
				| expr comp_op expr 													#CompOpCond
				| cond (OR | AND) cond   												#OrAndCond
				;

var_decl:		Variable ID COLON type SEMI;

stmblock:		stm* | ;

const_decl:		Constant ID COLON type ASSIGN expr SEMI;

decl:			var_decl | const_decl;

func:			type ID LBR para_lst RBR Is decl_lst Begin stmblock Return LBR expr? RBR SEMI End?;

decl_lst:		decl* | ;

main:			Main Begin decl_lst stmblock End;

func_lst:		func* | ;

para_lst:		nemp_paralst?;

nemp_paralst:	ID COLON type (',' ID COLON type)*;

nemp_arglst:	ID (',' ID)*;

arglst: 		nemp_arglst?;

type:			Integer | Boolean | Void;

comp_op: 		EQL | NEQL | LESS | LESSEQ | GREATER | GREATEREQ;

frag:			ID | MINUS ID | NUMBER | BOOL | LBR expr RBR | ID LBR arglst RBR;

bin_arith_op:	ADD | MINUS;

fragment Letter: 		[a-zA-Z];
fragment Digit: 		[0-9];
fragment Underscore:	'_';

/* CASE INSENSITIVE */

fragment A:		'a' | 'A';
fragment B:		'b' | 'B';
fragment C:		'c' | 'C';
fragment D:		'd' | 'D';
fragment E:		'e' | 'E';
fragment F:		'f' | 'F';
fragment G:		'g' | 'G';
fragment H:		'h' | 'H';
fragment I:		'i' | 'I';
fragment J:		'j' | 'J';
fragment K:		'k' | 'K';
fragment L:		'l' | 'L';
fragment M:		'm' | 'M';
fragment N:		'n' | 'N';
fragment O:		'o' | 'O';
fragment P:		'p' | 'P';
fragment Q:		'q' | 'Q';
fragment R:		'r' | 'R';
fragment S:		's' | 'S';
fragment T:		't' | 'T';
fragment U:		'u' | 'U';
fragment V:		'v' | 'V';
fragment W:		'w' | 'W';
fragment X:		'x' | 'X';
fragment Y:		'y' | 'Y';
fragment Z:		'z' | 'Z';

/*RESERVED WORDS*/

Variable: 		V A R I A B L E;
Constant:		C O N S T A N T;
Return:			R E T U R N;
Void:			V O I D;
Main:			M A I N;
If:				I F;
Else:			E L S E;
While:			W H I L E;
Begin:			B E G I N;
End:			E N D;
Is:				I S;
Integer:		I N T E G E R;
Boolean:		B O O L E A N;
Skipping:		S K I P;

/*OPERATORS*/

NEG:			'~';
ASSIGN: 		':=';
ADD:			'+';
SEMI:			';';
MINUS: 			'-';
OR:				'|';
AND:			'&';
LBR:			'(';
RBR:			')';
EQL:			'=';
NEQL:			'!=';
LESS:			'<';
LESSEQ:			'<=';
GREATER:		'>';
GREATEREQ:		'>=';
COLON:			':';
COMMA:			',';

ID:				Letter(Letter | NUMBER | Underscore)*;
BOOL: 			'true' | 'false' ;
NUMBER:			Digit Digit* | MINUS Digit Digit*;
COMMENT:		'/*' (COMMENT|.)*? '*/' -> skip;
LINE_COMMENT:	'//' ~[\r\n]* -> skip;
WS:				[ \t\n\r]+ -> skip;