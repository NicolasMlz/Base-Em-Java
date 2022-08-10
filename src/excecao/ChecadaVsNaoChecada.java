package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.printf("Fimm :)");	
	}
	
	public static void geraErro1() {
		RuntimeException e1 = new RuntimeException("Ocorreu um erro SINISTRO #1");
		throw e1; 
	}
	public static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro SINISTRO #2");
	}
}
