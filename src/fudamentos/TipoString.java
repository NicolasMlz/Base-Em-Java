package fudamentos;

public class TipoString {
	public static void main(String[] args) {
		
		String s = "Nicolas fod�stico";
		s = s + "!!!";
		
		//Funcionalidades
		System.out.println(s);
		System.out.println(s.charAt(3));
		System.out.println(s.startsWith("Nicolas"));
		System.out.println(s.toLowerCase().startsWith("nicolas"));
		System.out.println(s.length());
		System.out.println(s.equals("nicolas fod�stico!!!"));
		System.out.println(s.equalsIgnoreCase("nicolas fod�stico!!!"));
		System.out.println(s.contains("fod�"));
		System.out.println(s.substring(3, 7));
		
		
	}
}
