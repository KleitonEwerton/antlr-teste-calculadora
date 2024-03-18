grammar Calculadora;

expressao:
    listaVar';' expr ';' imprimir ';' EOF;

listaVar :
      atribuicao ',' listaVar #listaDeVariaveis
    | atribuicao              #variavel
    ;

imprimir:
    IDENTIFICADOR;

atribuicao:
    nome=IDENTIFICADOR '=' expr;

expr:
     '(' expr ')'                               #parenteses
    | '-' <assoc=right> expr                    #menosUnario
    | expr1=expr '^' <assoc=right> expr2=expr   #potenciacao
    | expr1=expr op=('*' | '/') expr2=expr      #multDiv
    | expr1=expr op=('+' | '-') expr2=expr      #somaSub
    | NUM                                       #numero
    | IDENTIFICADOR                             #valorVariavel
    | ERROR_CHARACTER                           #error
    |                                           #nenhum
    ;



NUM : [0-9]+;

IDENTIFICADOR : Letra LetraOuDigito*;

fragment Letra: [a-zA-Z$_];

fragment LetraOuDigito
    : Letra
    | [0-9];

WHITESPACE          : ' ' -> skip;

ERROR_CHARACTER : . ;