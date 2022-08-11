package lambda;

@FunctionalInterface
public interface Calculo {
	
	double executar(double x, double y);
	
	default String legal() {
		return "Legal";
	}
	static String showDeBola() {
		return "Show de bola.";
	}
}
