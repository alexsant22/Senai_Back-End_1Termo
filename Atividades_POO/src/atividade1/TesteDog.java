package atividade1;

import java.util.Scanner;

public class TesteDog {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		//instaciando o dog
		Dog d1 = new Dog();
		System.out.println("Dog 1 nasceu!");
		//nome
		System.out.println("Digite o nome do seu dog: ");
		String nome = t.nextLine();
		d1.setNome(nome);
		System.out.println("O nome do dog é: " + d1.getNome());
		//peso
		System.out.println("Digite o peso do dog: ");
		float peso = t.nextFloat();
		d1.setPeso(peso);
		System.out.println("o peso do dog é: " + d1.getPeso() + "Kg");
		//sexo
		System.out.println("Digite o sexo do dog: ");
		char sexo = t.next().charAt(0);
		d1.setSexo(sexo);
		System.out.println("O sexo do seu dog é: " + d1.getSexo());
		//QtdPatas
		System.out.println("Digite a quantidade de patas do seu dog: ");
		int qtdpatas = t.nextInt();
		d1.setQtdPatas(qtdpatas);
		System.out.println("Quantidade de patas do dog é: " + d1.getQtdPatas());
		//ações
		d1.getLatir();
		System.out.println("O dog está latindo!!");
		d1.getCorrer();
		System.out.println("O dog está correndo!!");
		d1.getBrincar();
		System.out.println("O dog está brincando!!");
		d1.getDormir();
		System.out.println("O dog está dormindo despois de tudo isso...");
		
		//teclado novo
			t.nextLine();
		
		//instaciando o dog
		Dog d2 = new Dog();
		System.out.println("Dog 2 nasceu!");
		//nome
		System.out.println("Digite o nome do seu dog: ");
		String nome2 = t.nextLine();
		d2.setNome(nome2);
		System.out.println("O nome do dog é: " + d2.getNome());
		//peso
		System.out.println("Digite o peso do dog: ");
		float peso2 = t.nextFloat();
		d2.setPeso(peso2);
		System.out.println("o peso do dog é: " + d2.getPeso() + "Kg");
		//sexo
		System.out.println("Digite o sexo do dog: ");
		char sexo2 = t.next().charAt(0);
		d2.setSexo(sexo2);
		System.out.println("O sexo do seu dog é: " + d2.getSexo());
		//QtdPatas
		System.out.println("Digite a quantidade de patas do seu dog: ");
		int qtdpatas2 = t.nextInt();
		d2.setQtdPatas(qtdpatas2);
		System.out.println("Quantidade de patas do dog é: " + d2.getQtdPatas());
		//ações
		d2.getLatir();
		System.out.println("O dog está latindo!!");
		d2.getCorrer();
		System.out.println("O dog está correndo!!");
		d2.getBrincar();
		System.out.println("O dog está brincando!!");
		d2.getDormir();
		System.out.println("O dog está dormindo despois de tudo isso...");
		
		//teclado novo
				t.nextLine();
				
		//instaciando o dog
		Dog d3 = new Dog();
		System.out.println("Dog 3 nasceu!");
		//nome
		System.out.println("Digite o nome do seu dog: ");
		String nome3 = t.nextLine();
		d3.setNome(nome3);
		System.out.println("O nome do dog é: " + d3.getNome());
		//peso
		System.out.println("Digite o peso do dog: ");
		float peso3 = t.nextFloat();
		d3.setPeso(peso3);
		System.out.println("o peso do dog é: " + d3.getPeso() + "Kg");
		//sexo
		System.out.println("Digite o sexo do dog: ");
		char sexo3 = t.next().charAt(0);
		d3.setSexo(sexo3);
		System.out.println("O sexo do seu dog é: " + d3.getSexo());
		//QtdPatas
		System.out.println("Digite a quantidade de patas do seu dog: ");
		int qtdpatas3 = t.nextInt();
		d3.setQtdPatas(qtdpatas3);
		System.out.println("Quantidade de patas do dog é: " + d3.getQtdPatas());
		//ações
		d3.getLatir();
		System.out.println("O dog está latindo!!");
		d3.getCorrer();
		System.out.println("O dog está correndo!!");
		d3.getBrincar();
		System.out.println("O dog está brincando!!");
		d3.getDormir();
		System.out.println("O dog está dormindo despois de tudo isso...");
		
	}
}
