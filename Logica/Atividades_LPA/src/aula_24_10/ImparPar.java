package aula_24_10;

import java.util.Scanner;

public class ImparPar {
	/*
	 * P, indica quem escolher a opção par ou impar
	 * P == 0, Alice é par
	 * P == 1, Bob é par
	 * 
	 * d1 e d2 seria o valor dos dedos levantados
	 * 
	 * saída:
	 * uma linha indicando quem exibindo quem ganhou
	 */

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quem é par?");
		int p = scan.nextInt();
			 
		if(p == 0) {
			System.out.println("Alice é par");
		} else if(p == 1) {
			System.out.println("Bob é par");
		}
		
		System.out.println("");
		System.out.println("Digite o primeiro número de 0 a 5: ");
		int d1 = scan.nextInt();
		System.out.println("Digite o segundo número 0 a 5:");
		int d2 = scan.nextInt();
		
		boolean isPar = (d1 + d2)%2 == 0 ? true : false;
		
		System.out.println("");
		
		if (p == 0 && isPar == true) {
			System.out.println(p);
		} else if(p == 1 && isPar == true) {
			System.out.println(p);
		} else if(p == 0 && isPar == false) {
			System.out.println("1");
		} else if(p == 1 && isPar == false) {
			System.out.println("0");
		}

	}

}
