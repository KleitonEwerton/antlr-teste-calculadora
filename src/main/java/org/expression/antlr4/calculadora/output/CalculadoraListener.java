// Generated from Calculadora.g4 by ANTLR 4.7.1
package org.expression.antlr4.calculadora.output;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CalculadoraParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CalculadoraParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listaDeVariaveis}
	 * labeled alternative in {@link CalculadoraParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void enterListaDeVariaveis(CalculadoraParser.ListaDeVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listaDeVariaveis}
	 * labeled alternative in {@link CalculadoraParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void exitListaDeVariaveis(CalculadoraParser.ListaDeVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variavel}
	 * labeled alternative in {@link CalculadoraParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(CalculadoraParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variavel}
	 * labeled alternative in {@link CalculadoraParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(CalculadoraParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(CalculadoraParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(CalculadoraParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CalculadoraParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CalculadoraParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menosUnario}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMenosUnario(CalculadoraParser.MenosUnarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menosUnario}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMenosUnario(CalculadoraParser.MenosUnarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorVariavel}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValorVariavel(CalculadoraParser.ValorVariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorVariavel}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValorVariavel(CalculadoraParser.ValorVariavelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somaSub}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSomaSub(CalculadoraParser.SomaSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somaSub}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSomaSub(CalculadoraParser.SomaSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenteses(CalculadoraParser.ParentesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenteses}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenteses(CalculadoraParser.ParentesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numero}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumero(CalculadoraParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumero(CalculadoraParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(CalculadoraParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(CalculadoraParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code potenciacao}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPotenciacao(CalculadoraParser.PotenciacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code potenciacao}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPotenciacao(CalculadoraParser.PotenciacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code error}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterError(CalculadoraParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code error}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitError(CalculadoraParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nenhum}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNenhum(CalculadoraParser.NenhumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nenhum}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNenhum(CalculadoraParser.NenhumContext ctx);
}