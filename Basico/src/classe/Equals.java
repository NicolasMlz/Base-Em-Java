package classe;

public class Equals {
	public static void main(String[] args) {
		
		//Instancias
		Pessoa p1 = new Pessoa();
		p1.nome = "Nicolas";
		p1.sobrenome = "Gostoso";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Nicolas";
		p2.sobrenome = "Gostoso";
		
		//Comparacoes
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		
		
	}
}
