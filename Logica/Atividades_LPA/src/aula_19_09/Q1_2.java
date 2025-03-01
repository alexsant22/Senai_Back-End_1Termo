package aula_19_09;

import java.util.Scanner;

public class Q1_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0, num;
		boolean condicao = true;
		
		while(condicao) {//verdadeira
			num =  entrada.nextInt();//num = 0
			//condição pq ele tem q para se for 0
			if(num <= 0) {
				System.out.println("digitou '0' ...saindo");
				break;
			} else if(num > 0) {
				soma = soma + num;
			}
		} System.out.println("Resultado é: " + soma);
		

	}

}
