package padroes.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		
		Namorada namo = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObs(namo);
		porteiro.monitorar();
	}
}
