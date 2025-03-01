package aula_19_09;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int valor = (int)(Math.random() * 31);
		//int n = t.nextInt();
		
		boolean escolha = true;
		
		while (escolha) {
			System.out.println("Tente adivinhar o número:");
			int n = t.nextInt();
			
			if (n < valor) {
				System.out.println("Digite um número maior");
			} 
			else if (n > valor) {
				System.out.println("Digite um número menor");
			}
			else if (n == valor) {
				System.out.println("Parabéns você acertou!! :)");
				break;
			}
			
		}//while
		

	}//main

}//classe
