package app_financeiro.br.com.zhant.app.financeiro;

import java.lang.reflect.Field;

import app_calculo.br.com.zhant.app.calculo.Calculadora;
import app_calculo.br.com.zhant.app.calculo.interno.OperacoesAritmeticas;

public class Teste {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2,3, 5));
	
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(1,2,3));
		
		System.out.println(Calculadora.class.getName());
		System.out.println(Calculadora.class.getDeclaredFields()[0].getName());
	
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			fieldId.setAccessible(false);

			System.out.println(calc.getId());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
