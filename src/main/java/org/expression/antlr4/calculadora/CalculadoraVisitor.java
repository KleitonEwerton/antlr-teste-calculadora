package org.expression.antlr4.calculadora;

import org.expression.antlr4.calculadora.output.CalculadoraBaseVisitor;
import org.expression.antlr4.calculadora.output.CalculadoraParser.*;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraVisitor extends CalculadoraBaseVisitor<Double> {

    private Map<String, Double> variaveis;

    public CalculadoraVisitor() {
        this.variaveis = new HashMap<>();
    }

    @Override
    public Double visitExpressao(ExpressaoContext ctx) {

        System.out.println("visitExpressao " + ctx);

        if (ctx.listaVar() != null) {
            visit(ctx.listaVar());
        }

        return visit(ctx.expr());
    }

    @Override
    public Double visitMultDiv(MultDivContext ctx) {

        System.out.println("visitMultDiv " + ctx);

        Double expr1 = visit(ctx.expr1);
        Double expr2 = visit(ctx.expr2);

        if (ctx.op.getText().equals("*")) {
            return expr1 * expr2;
        } else if (ctx.op.getText().equals("/")) {
            return expr1 / expr2;
        } else {
            throw new RuntimeException("Operador invalido");
        }
    }

    @Override
    public Double visitNumero(NumeroContext ctx) {

        System.out.println("visitNumero " + ctx);

        return Double.valueOf(ctx.getText());
    }

    @Override
    public Double visitParenteses(ParentesesContext ctx) {

        System.out.println("visitParenteses " + ctx);

        return super.visit(ctx.expr());
    }

    @Override
    public Double visitSomaSub(SomaSubContext ctx) {

        System.out.println("visitSomaSub " + ctx);


        Double expr1 = visit(ctx.expr1);
        Double expr2 = visit(ctx.expr2);

        if (ctx.op.getText().equals("+")) {
            return expr1 + expr2;
        } else if (ctx.op.getText().equals("-")) {
            return expr1 - expr2;
        } else {
            throw new RuntimeException("Operador invalido");
        }

    }

    @Override
    public Double visitError(ErrorContext ctx) {

        System.out.println("visitError " + ctx);
        throw new RuntimeException("Expressão incorreta");
    }

    @Override
    public Double visitAtribuicao(AtribuicaoContext ctx) {

        System.out.println("visitAtribuicao " + ctx);

        String nome = ctx.nome.getText();

        Double valor = visit(ctx.expr());

        if (variaveis.get(nome) != null) {
            throw new RuntimeException("Erro nas variaveis");
        }

        variaveis.put(nome, valor);

        return null;
    }

    @Override
    public Double visitVariavel(VariavelContext ctx) {

        System.out.println("visitVariavel " + ctx);
        visit(ctx.atribuicao());

        return null;
    }

    @Override
    public Double visitListaDeVariaveis(ListaDeVariaveisContext ctx) {

        System.out.println("visitListaDeVariaveis " + ctx);
        visit(ctx.atribuicao());

        return visit(ctx.listaVar());
    }

    @Override
    public Double visitValorVariavel(ValorVariavelContext ctx) {

        System.out.println("visitValorVariavel " + ctx);
        Double valor = variaveis.get(ctx.getText());
        if( valor == null){
            throw new RuntimeException("Variavel " + ctx.getText() + " nao foi definida!");
        }

        return valor;
    }

    @Override
    public Double visitPotenciacao(PotenciacaoContext ctx) {

        System.out.println("visitPotenciacao " + ctx);
        return  Math.pow(visit(ctx.expr1), visit(ctx.expr2));
    }

    @Override
    public Double visitMenosUnario(MenosUnarioContext ctx) {

        System.out.println("visitMenosUnario " + ctx);
        return -visit(ctx.expr()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Double visitImprimir(ImprimirContext ctx) {
        System.out.println("visitImprimir " + ctx.getText());
        // Faça o que precisar com a expressão a ser impressa
        return visitChildren(ctx);
    }


}
