package aula_10_10;

import java.util.Scanner;

public class AtvContasPagar {
	
	/*
	 * Oq fazer?
	 * tbm n sei mas vou tentar escrever;
	 * criar um scanner para pegar os valores de aposentdoria e os valores
	 * das contas em débito e fazer as comparações se consegue pagar todas
	 * elas. Se não conseguir quantas ele pode pagar com o dinheiro que tem.
	 * 
	 * Entrada (4 linhas):
	 * int V; valor disponivel do vovô
	 * int A; valor da conta do açougue
	 * int F; valor da conta da farmacia
	 * int P; valor da conta da padaria
	 * 
	 * Saida (1 linha):
	 * imprimir uma linha com um Int dizendo quantas contas o vovô consegue
	 *  pagar de acordo com o dinheiro q ele tem
	 *  
	 *  Restrição:
	 *  0 <= V <= 2000
	 *  1 <= A <= 1000
	 *  1 <= F <= 1000
	 *  1 <= P <= 1000
	 */
	
	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//variaveis a serem usadas
		int V, A, F, P;
			//pegando as info
			System.out.println("Qual o valor disponível da aposentadoria do véio?");
			V = scan.nextInt();
			System.out.println("Qual o valor da conta do açougue?");
			A = scan.nextInt();
			System.out.println("Qual o valor da conta da farmácia?");
			F = scan.nextInt();
			System.out.println("Qual o valor da conta da padaria?");
			P = scan.nextInt();
			
			//restrições de código e variaveis
			if(0 <= V && V <= 2000 && 
				1 <= A && A <= 1000 && 
				1 <= F && F <= 1000 && 
				1 <= P && P <= 1000) {
				//PAGANDO CONTAS
				int contas = 0;
				if(V >= A) {
					V = V - A;
					contas++;
				}
				if(V >= F) {
					V = V - F;
					contas++;
				}
				if(V >= P) {
					V = V - F;
					contas++;
				}
				
				System.out.println(contas);

				} else {
					System.out.println("Inválido");
				}
				}
}
