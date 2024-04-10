module app_financeiro {
	
	requires java.base;
	requires app_api_publica;
	uses app_api_publica.br.com.zhant.app.Calculadora;
}