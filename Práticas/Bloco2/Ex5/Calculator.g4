grammar Calculator;
@header {import java.util.;}
@members {protected Map<String,Double> symbolTable = new HashMap<String,Double>();}

program: ( stat {System.out.println($atat.v);} NEWLINE) * EOF;

stat returns[double v]
    : expr       { $v = $expr.v; }
    | assignment { $v = $assignment.v; } ;

assignment returns[double v]
    : ID '=' expr { $v = $expr.v; symbolTable.put($ID.text,$v);};

expr returns[double v]
    : left = expr op = ('*' | '/') right = expr {if($op.text.equals("*"))
                                        }











NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;