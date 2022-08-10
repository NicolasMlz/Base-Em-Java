package oo.polimorfismo;

public abstract class Comida {
	
	//Atributos
	private double peso;
	
	//Construtores
	Comida(double peso) {
		setPeso(peso);
	}
	
	//Getter and Setters
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso > 0) {			
			this.peso = peso;
		}
	}
}
