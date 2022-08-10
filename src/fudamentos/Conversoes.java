package fudamentos;

import javax.swing.JOptionPane;

public class Conversoes {
	public static void main(String[] args) {
		
		//Int para String
		int e = 35;
		String f = Integer.toString(e);
		System.out.println(f);
		
		//String para double
		String num1 = JOptionPane.showInputDialog(
				"Digite o primeiro número:");
		String num2 = JOptionPane.showInputDialog(
				"Digite o segundo número:");
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		System.out.printf("%.2f e %.2f\n", numero1, numero2);
		
		//String para int
		String int1 = JOptionPane.showInputDialog("Digite seu numero mana: ");
		int n = Integer.parseInt(int1);
		System.out.printf("Seu numero é: %d\n", n);
	}
}
