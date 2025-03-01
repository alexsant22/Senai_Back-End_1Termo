package aula_03_10;

import java.util.Scanner;

public class AtvVar {

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//criando boolean cond
		boolean cond = true;
		//variaveis
		int x;
		int y;
		
		while(cond) {
			//pedindo valores
			System.out.println("Digite o valor de X:");
			x = scan.nextInt();
			System.out.println("Digite o valor de Y:");
			y = scan.nextInt();
			
			//restrição
			if(-100 >= x && x <= 100) {
				System.out.println("Valor inválido X.");
			} else if(-100 >= y && y <= 100) {
				System.out.println("Valor inválido Y.");
			} 

			//condiçoes bola no eixo x
			if(x > 8 || x < -8) {
				System.out.println("Bola fora da quadra.");
			} else if(x <= 8 && x >= 8) {
				System.out.println("Bola dentro da quadra.");
			}
			//condiçoes bola no eixo y
			if(y > 8 || y < 0) {
				System.out.println("Bola fora da quadra.");
			} else if(y <= 8 && y >= 0) {
				System.out.println("Bola dentro da quadra.");
			}
			break;
		}

	}

}
