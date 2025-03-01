package aula4;

import java.util.Scanner;

public class SemExcecao {

	public static void main(String[] args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número diferente de 0: ");
		n = scan.nextInt();
		
		if (n != 0) {
			if (n > 0) {
				System.out.println(n +" é um número positivo.");
			} else {
				System.out.println(n + " é um número negativo.");
			}
		} else {
			System.out.println("O número n pode ser 0.");
		}

	}

}
