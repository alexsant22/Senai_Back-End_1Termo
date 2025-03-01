package aula02;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		//array é vetor
		int[] nota = new int[3]; //obj vetor nota
		Scanner teclado = new Scanner(System.in);
		
		int i;
		//escreve valores
		for(i = 0; i < 3; i++) {
				System.out.println("Digite um nº: " + (i+1) + ":");
				/*
				nota[0] = 10;
				nota[1] = 5;
				nota[2] = 7;
				*/
				nota[i] = teclado.nextInt();
			}
		//lendo valores
		for(i = 0; i < 3; i++) {
			System.out.println("Var i: " + i + "\nLendo: " + nota[i]);
		}
		//com uso do foreach
		for(int num : nota) {
			System.out.println("Imprimindo: " + num);
		}
	}
}