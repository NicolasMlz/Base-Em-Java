package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		
		CaixaNumero<Double> c1 = new CaixaNumero<>(); 
		c1.guardar(2.4);
		System.out.println(c1.abrir());
		
		
		CaixaNumero<Integer> c2 = new CaixaNumero<>(); 
		c2.guardar(2);
		System.out.println(c2.abrir());
	}
}
