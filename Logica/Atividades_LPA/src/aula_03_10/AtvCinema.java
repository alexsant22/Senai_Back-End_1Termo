package aula_03_10;

import java.util.Scanner;

public class AtvCinema {
	/* Entrada (Duas variaveis int):
	 * int idade
	 * int idade2
	 * int valor
	 * 
	 * Tabela idade e preço:
	 * até 17 anos: 15pila
	 * 18 até 59 anos: 30pila
	 * 60 anos ou mais: 20pila
	 * 
	 * Restrição:
	 * 1 <= idade <= 100
	 * 
	 * Saída:
	 * Sair apenas uma linha mostrando um valor INT em reais para pagar os dois ingressos
	 */
	public static void main(String[] args) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//craindo while para condiçoes e restriçoes
		boolean cond = true;
		//variaveis
		int idade, idade2, valor1 = 0, valor2 = 0, vFinal;
		
		while(cond) {
			System.out.println("Digite a idade da Pessoa 1:");
			idade = scan.nextInt();
			System.out.println("Digite a idade da Pessoa 2:");
			idade2 = scan.nextInt();
			System.out.println("");
			
			//restrição
			 if(idade < 1 || idade > 100 ) {
				System.out.println("Pessoa 1 não permetido.");
				
			} else {
				System.out.println("Pessoa 1 permetido.");
				
				//cond valor
				if(idade <= 17) {
					valor1 = 15;
				} else if(idade >= 18 && idade <= 59) {
					valor1 = 30;
				} else if(idade > 59) {
					valor1 = 20;
				}
			}
			 if(idade2 >= 1 && idade2 <= 100) {
				 System.out.println("");
				System.out.println("Pessoa 2 Permetido.");
				
				//cond valor2
				if(idade2 <= 17) {
					valor2 = 15;
				} else if(idade2 >= 18 && idade2 <= 59) {
					valor2 = 30;
				} else if(idade2 > 59) {
					valor2 = 20;
				}
				
			} else {
				System.out.println("");
				System.out.println("Pessoa 2 não permetido.");
			}
			 System.out.println("");
			 //somando e imprimindo valores
			 vFinal = valor1 + valor2;
			 System.out.println("Valor total dos ingressos é: R$" + vFinal);
			 
			 break;
		}
		
		System.out.println("");
		System.out.println("Boa seção!!");

	}

}
