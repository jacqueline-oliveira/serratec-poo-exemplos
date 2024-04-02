package org.serratec.poo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		String continua = "S";
		
		Scanner leitura = new Scanner(System.in);
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Digite o primeiro número:");
			numero1 = leitura.nextInt(); 
			
			System.out.println("Digite o segundo número:");
			numero2 = leitura.nextInt();
			
			leitura.nextLine();		
					
			System.out.println("Soma: " + (numero1 + numero2));
			
			if (numero2 > numero1) {
		       System.out.println("Não posso subtrair!");		
			} else {
				System.out.println("Subtração: " + (numero1 - numero2));
			}
			
			System.out.println("Multiplicação: " + (numero1 * numero2));
			
			if (numero2 == 0) {
				System.out.println("Não posso divividr por zero.");
			} else {
				System.out.println("Divisão: " + (numero1 / numero2));
			}
			
			System.out.println("Deseja continuar? (S/N)");
			continua = leitura.nextLine();
		}
		
		leitura.close();
	}
}
