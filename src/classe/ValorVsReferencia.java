package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		//Atribuicao por valor
		int a = 5;
		int b = a;
		a++;
		b--;
		System.out.printf("%d %d\n", a, b);
		
		//Atribuicao por referencia (objetos de forma geral)
		Data d1 = new Data(18, 05, 2003);
		//As 2 variaveis sao enderecos que apontarâo para o mesmo objeto
		Data d2 = d1;
		
		//Portanto modificam o mesmo objeto
		d1.dia = 17;
		d2.mes = 6;
		
		System.out.printf("%d/0%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/0%d/%d\n", d2.dia, d2.mes, d2.ano);
		
	}
}
