package atv_trat_excecao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número:");
			String num = scan.next();
			Double.parseDouble(num);
			System.out.println("Pagamento no valor de R$" + num);
			scan.close();
		} catch (NumberFormatException e) {
			System.out.println("ERRO: " + e);
		}

	}

}
