package aula_17_10;

import java.util.ArrayList;
import java.util.Scanner;

public class AtvLeilao {
	
	/*
	 * Entrada:
	 * int n; número de lances recebidos
	 * String c; nome da pessoa q fez o lance
	 * int v; valor do lance
	 * 
	 * Saída:
	 * 1ª linha: Nome do ganhador;
	 * 2ª linha: Valor do lance ganhador
	 * 
	 * Restrições:
	 * 0 <= N <= 10 000
	 * 1 <= V <= 100 000
	 * 
	 * Oq o código deve fazer:
	 * Fazer uma lista dos nomes juntamente com os valores
	 * dos lances, e depois imprimir na saida o nome e o
	 * valor do maioir lance feito.
	 */

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//arrayList nome
		ArrayList<String> nome = new ArrayList<>();
		
		//arrayList ValorLance
		ArrayList<Integer> lanceV = new ArrayList<>();
		
		//variaveis de entrda
		int n; //número de lances recebidos
		String c; //nome da pessoa q fez o lance
		int v; //valor do lance
		
		boolean cond = true;
		
		//quantos lances vai ter?
		System.out.println("Quantos lances vai ter?");
		n = scan.nextInt();
		
		int max = 0;
		String nomeLance = null;
		//fazendo for para comparar
		for(int i = 0; i < n; i++) {
			//pegando infos
			System.out.println("");
			System.out.println("Digite o nome da pessoa "  + i + ":");
			c = scan.next(); //armazena no scanner
			nome.add(c); //adiciona no arrayList
			System.out.println("Digite o valor " + i + " do lance:");
			v = scan.nextInt();
			lanceV.add(v);
			System.out.println(""); 
			if(v > max) {
				max = v;
				nomeLance = nome.set(i, c);
			}
		}
		//imprimindo ganhador
		System.out.println("");
		System.out.println("Nome do ganhador: " + nomeLance);
		System.out.println("O valor do lance: " + max);
	}
}


//criando while para ficar pegando os lances
/* while(cond) {
	//pegando infos
	System.out.println("Informações do leilão!!");
	System.out.println("");
	System.out.println("Digite o nome:");
	c = scan.next(); //armazena no scanner
	nome.add(c); //adiciona no arrayList
	System.out.println("Digite o valor do lance:");
	v = scan.nextInt();
	lanceV.add(v);
	System.out.println(""); 
	
	//condicional se vai continuar
	if(nome.size() == n && lanceV.size() == n) {
		System.out.println("Encerrando...");
		break;
	}
} */
