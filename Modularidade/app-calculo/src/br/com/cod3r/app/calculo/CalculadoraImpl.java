package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{
	
	private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.infra("Somando...");
		return operacoesAritmeticas.soma(nums);
	}
}
