package classe.desafioModulo;

public class Pessoa {
	
	//Atributos
	String nome;
	double pesoInicial;
	double pesoFinal;
	
	//Construtor
	Pessoa(String nome, double pesoInicial) {
		this.nome = nome;
		this.pesoInicial = pesoInicial;
		this.pesoFinal = this.pesoInicial;
	}
	
	//Metodos
	void comer(Comida comida) {
		pesoFinal += comida.peso;
	}
}
