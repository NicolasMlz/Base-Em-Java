package classe.desafioModulo;

public class Jantar {
	public static void main(String[] args) {
		
		//Instancias
		Pessoa p1 = new Pessoa("Nicolas", 69.5);
		Comida c1 = new Comida("Arroz", 0.5);
		Comida c2 = new Comida("Feijão", 0.2);
		
		//Jantar
		p1.comer(c1);
		p1.comer(c2);
		
		//Saida
		System.out.printf("O peso de %s antes de comer era de: %.1f\n", p1.nome, p1.pesoInicial);
		System.out.printf("O peso de %s após o jantar é de: %.1f\n", p1.nome, p1.pesoFinal);
		
	}
}
