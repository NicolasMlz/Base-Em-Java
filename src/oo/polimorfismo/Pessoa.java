package oo.polimorfismo;

public class Pessoa {

	//Atributos
	private double peso;
	
	//Construtores
	Pessoa(double peso) {
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
	
	//Metodos
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

}
