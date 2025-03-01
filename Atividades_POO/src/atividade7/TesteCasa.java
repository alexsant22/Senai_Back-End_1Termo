package atividade7;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//Pegando info
		System.out.println("Casa 1:");
		System.out.println("Qual a cor da sua casa?");
		String cor1 = scan.nextLine();
		System.out.println("Qual o preço da sua casa:");
		float preco1 = scan.nextFloat();
		System.out.println("Qual a metragem da sua casa:");
		float metre1 = scan.nextFloat();
		
		//quarto
		System.out.println("Qual o nome do quarto de sua casa?");
		String nomQr = scan.next();
		System.out.println("Quantas camas tem no quarto?");
		int cam1 = scan.nextInt();
		
		//criando quarto
		Quarto quarto1 = new Quarto(nomQr, cam1);
		
		//sala
		System.out.println("Qual o nome da sala?");
		String nomSl = scan.next();
		
		//sim ou não para tv na sala
		System.out.println("Sua sala tem TV? (S / N)");
		String perg = scan.next();
		/* boolean temTV = scan.nextBoolean();
		if(temTV == true) {
			System.out.println("Tem tv");
		} else if(temTV == false) {
			System.out.println("Nao tem tv");
		} */
		boolean temTV = perg.equals("s") ? true : false;
		
		//criando sala
		Sala sala1 = new Sala(nomSl, temTV);
		
		//criando casa1
		Casa casa1 = new Casa(cor1, preco1, metre1, quarto1, sala1);
		System.out.println("");
		System.out.println("Casa 1:");
		casa1.mostrarDetalhes();
		
		//separando
		
		//Pegando info 2
		System.out.println("");
		System.out.println("Casa 2:");
		System.out.println("Qual a cor da sua casa?");
		String cor2 = scan.next();
		System.out.println("Qual o preço da sua casa:");
		float preco2 = scan.nextFloat();
		System.out.println("Qual a metragem da sua casa:");
		float metre2 = scan.nextFloat();
				
		//quarto2
		System.out.println("Qual o nome do quarto de sua casa?");
		String nomQr2 = scan.next();
		System.out.println("Quantas camas tem no quarto?");
		int cam2 = scan.nextInt();
				
		//criando quarto2
		Quarto quarto2 = new Quarto(nomQr, cam1);
				
		//sala2
		System.out.println("Qual o nome da sala?");
		String nomS2 = scan.next();
				
		//sim ou não para tv na sala2
		System.out.println("Sua sala tem TV? (S / N)");
		String perg2 = scan.next();
		boolean temTV2 = perg2.equals("s") ? true : false;
				
		//criando sala2
		Sala sala2 = new Sala(nomS2, temTV2);
				
		//criando casa2
		Casa casa2 = new Casa(cor2, preco2, metre2, quarto2, sala2);
		System.out.println("");
		System.out.println("Casa 2:");
		casa2.mostrarDetalhes();
		
		scan.close();
				
	}

}
