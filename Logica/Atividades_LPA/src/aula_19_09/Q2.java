package aula_19_09;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		int armaz = 0;
		int num;
		boolean condicao = true;
		
		/*entrada < num;
		armaz = num;
		*/
		while(condicao) {//verdadeira
			num =  entrada.nextInt();//num = 0
			//condição pq ele tem q para se for 0
			if(num == 0) {
				System.out.println("digitou '0' ...saindo");
				break;
			} else if(num != 0) {
				armaz = num;
				num = entrada.nextInt();
				
			}  else if (num < armaz) {
				armaz = num;
			}
		} System.out.println("Resultado é: " + armaz);

	}

}
