// Generated from Calculadora.g4 by ANTLR 4.7.1
package org.expression.antlr4.calculadora.output;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(CalculadoraParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listaDeVariaveis}
	 * labeled alternative in {@link CalculadoraParser#listaVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeVariaveis(CalculadoraParser.ListaDeVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variavel}
	 * labeled alternative in {@link CalculadoraParser#listaVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(CalculadoraParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(CalculadoraParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(CalculadoraParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menosUnario}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenosUnario(CalculadoraParser.MenosUnarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valorVariavel}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorVariavel(CalculadoraParser.ValorVariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somaSub}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomaSub(CalculadoraParser.SomaSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenteses(CalculadoraParser.ParentesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(CalculadoraParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(CalculadoraParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potenciacao}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciacao(CalculadoraParser.PotenciacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code error}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(CalculadoraParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nenhum}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNenhum(CalculadoraParser.NenhumContext ctx);
}