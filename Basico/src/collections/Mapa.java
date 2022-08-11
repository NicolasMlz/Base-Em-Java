package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		//Instancias
		HashMap<String, Double> notas = new HashMap<>();
		
		//Adicionar
		notas.put("Nicolas", 10.0);
		notas.put("Helo", 9.9);
		notas.put("Gueiros", 8.9);
		notas.put("Thiago", 8.0);
		
		//Metodos padrao
		System.out.println(notas.size());
		System.out.println(notas.isEmpty() + "\n");
		
		//Acessar todos os dados
		System.out.println(notas.values());
		System.out.println(notas.keySet());
		System.out.println(notas.entrySet() + "\n");
		
		//Contem
		System.out.println(notas.containsKey("Nicolas"));
		System.out.println(notas.containsValue(7.5) + "\n");
		
		//Acessar pelo indice
		System.out.println(notas.get("Nicolas"));
		System.out.println(notas.get("Ola") + "\n");
		
		//Remover elemento
		notas.remove("Nicolas");
		
		//Percorrer map pelas chaves
		for(String aluno : notas.keySet()) {
			System.out.println(aluno);
		}
		System.out.printf("\n");
		
		//Percorrer map pelos valores
		for(Double nota : notas.values()) {
			System.out.println(nota);
		}
		System.out.printf("\n");
		
		//Percorrer map pelas chaves e valores
		for(Entry<String, Double> registro : notas.entrySet()) {
			System.out.print(registro.getKey() + "==> ");
			System.out.println(registro.getValue());
		}

	}
}
