package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		
		//Criar scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(7 / sc.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.printf("Finally #01\n");
		}
		
		try {
			System.out.println(7 / sc.nextInt());
		} finally {
			System.out.printf("Finally #01\n");
			sc.close();
		}
		
		System.out.printf("Fim!\n");
	}
}
