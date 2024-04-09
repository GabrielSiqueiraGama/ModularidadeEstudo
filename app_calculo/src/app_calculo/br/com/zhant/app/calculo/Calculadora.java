package app_calculo.br.com.zhant.app.calculo;

import app_calculo.br.com.zhant.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return opAritmeticas.soma(nums);
	}
	
}
