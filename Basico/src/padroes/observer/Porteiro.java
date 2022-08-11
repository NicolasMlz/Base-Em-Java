package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registrarObs(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner sc = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equals(valor)) {
			System.out.println("Aniversariante chegou?");
			valor = sc.nextLine();
			
			if("sim".equals(valor)) {
				
				//Criar o evento
				EventoChegadaAniversariante e = new EventoChegadaAniversariante(new Date());
				
				//Notificar
				observadores.stream().forEach(o -> o.chegou(e));
				valor = "sair";
				
			}
			else
				System.out.println("Alarme falso...");
		}
		
		sc.close();
	}
	
}
