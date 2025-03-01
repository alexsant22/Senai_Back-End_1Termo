package atv_trat_excecao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
		
		Integer[]notas = {10, 8, 9, 7, 0 ,8, 5, 6}; 
		
		try {
			System.out.println("Digite a nota da lista que deseja ver:");
			int i = s.nextInt();
			System.out.println("A nota desta lista é: " + notas[i - 1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Esta nota não existe. " + e);
		}
		
	}

}
