package aula_24_10;

import java.util.ArrayList;
import java.util.Scanner;


public class Poste {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		ArrayList<Integer> poste = new ArrayList<>();
		ArrayList<Integer> posteconserto = new ArrayList<>();
		ArrayList<Integer> postemanter = new ArrayList<>();
		ArrayList<Integer> postesubstituir = new ArrayList<>();
		
		
		int x = 0;
		
		System.out.println("Indique a quantidade de postes da cerca: ");
		int n = t.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o tamanho do poste: ");
			x = t.nextInt();
			poste.add(x);
		}
		
		for (int j : poste) {
			
			if (j >= 50 && j <85) {
				posteconserto.add(j);
			}
			
			if (j >= 85) {
				postemanter.add(j);
			}
			
			if (j < 50) {
				postesubstituir.add(j);
			}
		}
		System.out.println("Postes que devem ser consertados: "+posteconserto.size());
		System.out.println("Postes que devem ser mantidos: "+postemanter.size());
		System.out.println("Postes que devem ser substituidos: "+postesubstituir.size());
	}

}
