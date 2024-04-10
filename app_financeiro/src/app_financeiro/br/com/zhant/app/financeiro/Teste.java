package app_financeiro.br.com.zhant.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import app_api_publica.br.com.zhant.app.Calculadora;
import app_calculo.br.com.zhant.app.calculo.CalculadoraIpml;
import app_calculo.br.com.zhant.app.calculo.interno.OperacoesAritmeticas;

public class Teste {
	
	public static void main(String[] args) {

		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		System.out.println(calc.soma(1,2,34));
		//		CalculadoraIpml calc = new CalculadoraIpml();
//		System.out.println(calc.soma(2,3, 5));
//	
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(1,2,3));
//		
//		System.out.println(CalculadoraIpml.class.getName());
//		System.out.println(CalculadoraIpml.class.getDeclaredFields()[0].getName());
//	
//		try {
//			Field fieldId = calc.getClass().getDeclaredFields()[0];
//			fieldId.setAccessible(true);
//			fieldId.set(calc, "def");
//			System.out.println(fieldId.get(calc));
//			fieldId.setAccessible(false);
//
//			System.out.println(calc.getId());
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
		
	}
}
