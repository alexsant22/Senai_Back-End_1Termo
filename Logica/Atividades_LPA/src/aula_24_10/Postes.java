package aula_24_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Postes {
	
	/*
	 * Entrada:
	 * int n; //nmr de postes da cerca
	 * dps: desses 'n' postes, int x; para falar o tamanho deles
	 * 
	 * tamanho dos postes:
	 * poste < 50 substituir
	 * poste de 50 a 84 consertar
	 * poste > 85 n faz nada
	 * 
	 * saida:
	 * nmr de postes p/ serem substituidos
	 * nmr de postes p/ serem consertados
	 */

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		//arraylist
		ArrayList<Integer> postes = new ArrayList<Integer>();
		
		System.out.println("Digite o número de postes da cerca:");
		int n = scan.nextInt();
		postes.get(n);

	}

}
