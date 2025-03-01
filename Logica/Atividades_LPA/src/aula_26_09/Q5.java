package aula_26_09;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner escolha = new Scanner(System.in);
		
		//menu
		System.out.println("Selecione a opção que você deseja.");
		System.out.println("Adição = 1");
		System.out.println("Subtração = 2");
		System.out.println("Multiplicação = 3");
		System.out.println("Divisão = 4");
		System.out.println("Sair = 0");
		
		//variavel
		int num = escolha.nextInt();
		int resu;
		
		//metodos
		boolean esc = true;
		while (esc) {
		if (num == 1) {
			System.out.println("");
			System.out.println("Adição.");
			System.out.println("Digite um número:");
			int n1 = escolha.nextInt();
			System.out.println("Digite o segundo número:");
			int n2 = escolha.nextInt();
			resu = n1 + n2;
			System.out.println("Rsultado: " + resu);
		} else if(num == 2) {
			System.out.println("");
			System.out.println("Subtração.");
			System.out.println("Digite um número:");
			int n1 = escolha.nextInt();
			System.out.println("Digite o segundo número:");
			int n2 = escolha.nextInt();
			resu = n1 - n2;
			System.out.println("Resultado: " + resu);
		} else if(num == 3) {
			System.out.println("");
			System.out.println("Multiplicação");
			System.out.println("Digite um número:");
			int n1 = escolha.nextInt();
			System.out.println("Digite o segundo número:");
			int n2 = escolha.nextInt();
			resu = n1 * n2;
			System.out.println("Resultado: " + resu);
		} else if(num == 4) {
			System.out.println("");
			System.out.println("Divisão.");
			System.out.println("Digite um número:");
			int n1 = escolha.nextInt();
			System.out.println("Digite o segundo número:");
			int n2 = escolha.nextInt();
			resu = n1 / n2;
			System.out.println("Resultado: " + resu);
		} else if(num == 0) {
			System.out.println("Encerrando...");
			break;
		}
		
		
		}
	}

}
