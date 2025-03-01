package atividade2;

import java.util.Scanner;

public class TesteParque {

	public static void main(String[] args) {
		//criando scanner para armazenar memoria digitada
		Scanner t = new Scanner(System.in);
		
		//instanciando obj brinquedo
		Brinquedo b1 = new Brinquedo("Bate-bate", 1.50, 10);
		b1.exibirinfo();
		System.out.println("");
		Brinquedo b2 = new Brinquedo("Montanha-Russa", 1.50, 10);
		b2.exibirinfo();
		
		//pegando informaçoes 
		System.out.println("");
		System.out.println("Digite seu nome: ");
		String nome1 = t.next();
		System.out.println("Digite sua idade: ");
		int idade1 = t.nextInt();
		System.out.println("Digite seua altura");
		double altura1 = t.nextDouble();
		
		//instanciando visitante
		Visitante v1 = new Visitante(nome1, idade1, altura1);
		v1.exibirinfo();
		
		//pode ou n?
		System.out.println("");
		v1.podeAndarNoBrinquedo(altura1, idade1);
		
		//visitante 2
		System.out.println("");
		System.out.println("Digite seu nome: ");
		String nome2 = t.next();
		System.out.println("Digite sua idade: ");
		int idade2 = t.nextInt();
		System.out.println("Digite seua altura");
		double altura2 = t.nextDouble();
		
		//instanciando visitante
		Visitante v2 = new Visitante(nome2, idade2, altura2);
		v2.exibirinfo();
		
		//pode ou n?
		System.out.println("");
		v2.podeAndarNoBrinquedo(altura2, idade2);

	}

}
