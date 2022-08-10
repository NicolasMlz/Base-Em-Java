package generics;

import java.util.Arrays;
import java.util.List;

public class LIstaUtilTeste {
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLang = (String) ListaUltil.getUltimoElemento(langs);
		System.out.println(ultimaLang);
		
		Integer ultimaNum = (Integer) ListaUltil.getUltimoElemento(nums);
		System.out.println(ultimaNum);
		
		String ultimaLang2 = ListaUltil.getUltimoElemento2(langs);
		System.out.println(ultimaLang2);
		
		Integer ultimaNum2 = ListaUltil.getUltimoElemento2(nums);
		System.out.println(ultimaNum2);
		
	}
}
