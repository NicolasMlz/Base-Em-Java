package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa convidado = 	new Pessoa(70.3);
		
		//Fazer jantar
		Comida ingrediente1 = new Arroz(0.2);
		Comida ingrediente2 = new Feijao(0.1);
		Comida sobremesa = new Sorvete(0.4);
		System.out.println(convidado.getPeso());
		
		//Comer
		convidado.comer(ingrediente1);
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
	}
}
