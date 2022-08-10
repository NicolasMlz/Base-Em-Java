package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		//Forma 1 de criar stream
		Stream<String> langs = Stream.of("Java, ", "C++, ", "JS\n");
		langs.forEach(print);
		
		//Forma 2
		String[] maisLangs = {"C, ", "Lisp, ", "Perl, ", "Go\n"};
		Stream.of(maisLangs).forEach(print);
		
		//Forma 3
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		//FORMA 4
		List<String> nomes = Arrays.asList("\nNicolas ", "Helo ", "Edu ", "Evelin\n");
		nomes.stream().forEach(print);

	}
}
