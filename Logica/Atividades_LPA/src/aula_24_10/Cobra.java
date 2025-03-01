package aula_24_10;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Coral verdadeira == BVBP BVBP
 * 					   5393
 * 					   6268
 * 
 * Coral falsa == BVPB BVPB
 * 				  7147
 * 
 * Entrada:
 * uma linha com 4 número inteiros
 * 
 * saida:
 * uma saida dizendo se a sequencia de numeros é 'V' ou 'F'
 */

public class Cobra {

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		//arraylist
		ArrayList<Integer> python = new ArrayList<Integer>();
		
		String verif;
		int cont = 0;
		
		while (cont < 4) {
			System.out.println("Digite um número: ");
			int nmr = scan.nextInt();
			python.add(nmr);
			cont ++;
		}
		if (python.get(0) == python.get(2) || python.get(1) == python.get(3)) {
			System.out.println("");
			System.out.println("Resultado, Verdadeiro");
		} else {
			System.out.println("");
			System.out.println("Resultado, Falso");
		}
	}

}
