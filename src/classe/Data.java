package classe;

public class Data {
	
	//Atributos
	int dia;
	int mes;
	int ano;
	
	//Construtores
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	Data(int diaObj, int mesObj, int anoObj) {
		dia = diaObj;
		mes = mesObj;
		ano = anoObj;
	}
	
	//Metodos
	String obterDataFormatada() {
		
		//Variaveis
		String dataFormatada = Integer.toString(dia) + "/" +
				Integer.toString(mes) + "/" + Integer.toString(ano);
		
		return dataFormatada;
	}
}
