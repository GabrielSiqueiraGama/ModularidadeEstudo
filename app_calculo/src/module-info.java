import app_calculo.br.com.zhant.app.calculo.CalculadoraIpml;

open module app_calculo {
	requires transitive app_logging;
	exports app_calculo.br.com.zhant.app.calculo;
	exports app_calculo.br.com.zhant.app.calculo.interno
		to app_financeiro;
	
	requires app_api_publica;
	provides app_api_publica.br.com.zhant.app.Calculadora
		with CalculadoraIpml;
}