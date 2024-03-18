package org.expression;

import org.antlr.v4.runtime.*;
import org.expression.antlr4.calculadora.CalculadoraVisitor;
import org.expression.antlr4.calculadora.output.CalculadoraLexer;
import org.expression.antlr4.calculadora.output.CalculadoraParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Expressão:");
        CharStream entrada = CharStreams.fromString("a=3, b=4; a+b; a;");
        System.out.println(entrada);

        CalculadoraLexer calculadoraLexer = new CalculadoraLexer(entrada);
        CommonTokenStream commonTokenStream = new CommonTokenStream(calculadoraLexer);
        CalculadoraParser calculadoraParser = new CalculadoraParser(commonTokenStream);

        CalculadoraParser.ExpressaoContext expressaoContext = calculadoraParser.expressao();
        CalculadoraVisitor visitor = new CalculadoraVisitor();
        Double resultado = visitor.visit(expressaoContext);
        System.out.println("Resultado = " + resultado);

        CalculadoraParser.ImprimirContext imprimirContext = calculadoraParser.imprimir();
        System.out.println(2);
        visitor.visit(imprimirContext);

    }
}