package aula_19_09;

import java.util.Scanner;

public class Q2_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean condicao = true;
		int menNum = 0;
		int num = teclado.nextInt();
		
		if (num != 0) {
			menNum = num;
		}
		while (condicao) {
			num = teclado.nextInt();
			
			if(num != 0 & num < menNum) {
				menNum = num;
			} else if(num == 0) {
				System.out.println("Menor número é: " + menNum);
				break;
			}
		}

	}

}
