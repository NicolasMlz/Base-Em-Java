package br.com.cod3r.app.logging;

import br.com.cod3r.app.Calculadora;

public class CalculadoraImpl implements Calculadora{
	
	public double soma(double... nums) {
		Logger.infra("Somando...");
		return 2;
	}
}
