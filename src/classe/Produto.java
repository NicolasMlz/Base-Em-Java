package classe;

public class Produto {
	
	//Atributos
	String nome;
	double valor;
	static double desconto = 0.25;
	
	//Construtor
	Produto() {
	}
	Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	//Metodos
	double precoComDesconto() {
		
		//Variaveis
		double precoComDesconto;
		
		//Calcular com desconto
		precoComDesconto = valor - (valor*(1-desconto));
		
		//Retorno
		return precoComDesconto;
	}
}
