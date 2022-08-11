package generics;

import java.util.List;

public class ListaUltil {	
	
	public static Object getUltimoElemento(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimoElemento2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static<A, B, C> B teste(A parametroA, C parametroC) {
		B teste = null;
		return teste;
	}
}
