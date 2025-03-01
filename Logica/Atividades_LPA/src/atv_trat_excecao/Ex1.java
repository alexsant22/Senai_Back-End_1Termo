package atv_trat_excecao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean cond = true;
		while (cond) {
		
			System.out.println("Divisão entre dois números");
			System.out.println("Digite o primeiro número: ");
			int n1 = scan.nextInt();
			
			System.out.println("Digite o segundo número número: ");
			int n2 = scan.nextInt();
			
			try {
				System.out.println("O resultado da divisão é: " + (n1 / n2));
				
				
			} catch (ArithmeticException e) {
				System.out.println("ERRO: " + e);
			}
			System.out.println("Digite novamente.");
		
		}
	}

}
