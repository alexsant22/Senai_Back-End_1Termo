package aula_17_10;

import java.util.ArrayList;
import java.util.Scanner;

public class AtvAlbum {
	
	/*
	 * entrada
	 * int n; //total de figurinhas do album
	 * int m; //o tanto de figurinhas compradas
	 * int x; //indicando a figurinha comprada (o nmr dela)
	 * 
	 * saida
	 * sair o quanto falta para completar o album
	 */

	public static void main(String[] args) {
		//criando scanner
		Scanner scan = new Scanner(System.in);
		
		//criando arrayList para figurinhas
		ArrayList<Integer> figX = new ArrayList<Integer>();
		
		//pedindo infos
		System.out.println("Quantas figurinhas tem o álbum:");
		int n = scan.nextInt();
		System.out.println("Quantas figurinhas você comprou:");
		int m = scan.nextInt();
		
		//variavel figurinhas que faltam
		int figFal = 0;
		
		//criando for para comparar figurinhas
		for(int i = 0; i < m; i++) {
			System.out.println("Qual o numero da figurinha:");
			int x = scan.nextInt();
			if(figFal != x) {
				figFal = x;
				figX.add(figFal);
				x = 0;
			}
		}
		int figF = n - figX.size();
		System.out.println("Falta " + figF + " figurinhas.");
	}
}
