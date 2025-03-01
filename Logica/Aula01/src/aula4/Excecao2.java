package aula4;

import java.util.Scanner;

public class Excecao2 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Digite N1: ");
			n1 = scan.nextInt();
			System.out.println("Digite N2: ");
			n2 = scan.nextInt();
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			
		} catch (Exception e) {
			System.out.println("ERRO: digite um número inteiro.");
		}
		
		scan.close();
	}

}
