package atv_trat_excecao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		String num = s.next();
		
		try {
			Integer.parseInt(num);
			System.out.println("Seu número é: " + num);
		} catch (NumberFormatException e) {
			System.out.println("ERRO: Digite um número.");
		}
	}
}
