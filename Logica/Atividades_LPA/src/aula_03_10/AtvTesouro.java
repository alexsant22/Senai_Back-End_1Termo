package aula_03_10;

import java.util.Scanner;

public class AtvTesouro {
	/*
	 * Condições:
	 * cada marinheiro ganha exatamente o mesmo valor dividido entre os outros marinheiros
	 * o capitao recebe oq um marinheiro recebe e o dobro 
	 * ou seja: se 1 marinheiro recebe 10, o capitao recebe: 20.
	 * 
	 * Entrada:
	 * int a; numero de moedas da arca
	 * int n; numero de marinheiros (excluindo o cap)
	 * int cap; numero de moedas do cap
	 * 
	 * Saida:
	 * numero de moedas q o cap recebe
	 * 
	 * Restrição:
	 * 3 <= A <= 10000
	 * 1 <= N <= 1000
	 */
	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//criando boolean - while para restriçoes
		boolean cond = true;

		//variaveis
		int a, n, cap, tMoedas;

		while (cond) {
			System.out.println("Digite o número de moedas na arca:");
			a = scan.nextInt();
			System.err.println("Digite o número de marinheiros da tripulação:");
			n = scan.nextInt();

			//restrição //perguntar o professor sobre esse parte da restrição.
			if(3 >= a && a <= 10000) {
				System.out.println("Inválido.");
				break;
			} else if(1 >= n && n <= 1000) {
				System.out.println("Inválido.");
				break;
			}
			
			//soma e divisão das moedas
			tMoedas = a / n;
			System.out.println("Cada marinheiro recebe: " + tMoedas + " moedas.");
			cap = tMoedas * 2;
			System.out.println("O Capitão recebe: " + cap + " moedas.");
			break;
		}

	}

}
