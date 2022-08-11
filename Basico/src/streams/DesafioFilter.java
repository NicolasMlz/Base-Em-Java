package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Nerd n1 = new Nerd("Nicolas", true, 500);
		Nerd n2 = new Nerd("Helo", true, 30);
		Nerd n3 = new Nerd("Borba", false, 54);
		Nerd n4 = new Nerd("Thiago", true, 3);
		Nerd n5 = new Nerd("Enzo", false, 12);
		
		List<Nerd> nerds = Arrays.asList(n1, n2, n3, n4, n5);
		nerds.stream()
			.filter(n -> n.ehGamer == true)
			.filter(n -> n.animesVistos >= 50)
			.map(n -> "Que legal " + n.nome + "!\nVocê é um nerdx bonite!\n")
			.forEach(System.out::println);
	}
}
