package aula02;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
			int numero;
			do {
				System.out.println("Digite um número: ");
				numero = teclado.nextInt();
			} while (numero <= 10);
				System.out.println("Você digitou " + numero);
				teclado.close();
		}
	}
