package app_calculo.br.com.zhant.app.calculo;

import app_calculo.br.com.zhant.app.calculo.interno.OperacoesAritmeticas;
import app_logging.br.com.zhant.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
}
