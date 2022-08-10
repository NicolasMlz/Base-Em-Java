package excecaoPersonalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoException extends Exception{
	
	private String nomeAtributo;
	
	public NumeroNegativoException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo.", nomeAtributo);
	}
}
