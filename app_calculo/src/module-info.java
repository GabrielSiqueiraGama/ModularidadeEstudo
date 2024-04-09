module app_calculo {
	requires transitive app_logging;
	exports app_calculo.br.com.zhant.app.calculo;
	exports app_calculo.br.com.zhant.app.calculo.interno
		to app_financeiro;
}