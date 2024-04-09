package app_financeiro.br.com.zhant.app.financeiro;

import app_calculo.br.com.zhant.app.calculo.Calculadora;
import app_calculo.br.com.zhant.app.calculo.interno.OperacoesAritmeticas;

public class Teste {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2,3, 5));
	
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(1,2,3));
	}
}
