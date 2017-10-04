package ascci;


import static ascci.Token.*;
%%
%class Lexer
%type Token
L=[a-z_A-Z_]
D=[0-9]
S=[* + / - ( ) { } ? ¿ ¡ ! ]


WHITE=[" " \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/* ignore */}


alt64 {lexeme=yytext();return ARROB;}
alt34 {lexeme=yytext();return COMILLA;}
alt37 {lexeme=yytext();return PORCIENTO;}
alt44 {lexeme=yytext();return APOSTROFO;}
alt38 {lexeme=yytext();return AMPERSON;}

{L}* {lexeme=yytext();return LETRAS;}
{D}* {lexeme=yytext();return NUMEROS;}




