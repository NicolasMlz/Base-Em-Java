package estruturasDeControle;

public class DesafioFor {
	public static void main(String[] args) {
		
		//Desafio
		String valor;
		for(valor = "#"; !valor.equals("######"); valor += "#") {
			System.out.printf("%s\n", valor);
		}
	}
}
