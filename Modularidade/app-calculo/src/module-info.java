module app.calculadora {
	
	exports br.com.cod3r.app.calculo;
	
	exports br.com.cod3r.app.calculo.interno
	to app.financeiro;
	
	requires app.logging;
	requires app.api;
	
	provides br.com.cod3r.app.Calculadora
	with br.com.cod3r.app.calculo.CalculadoraImpl;
}