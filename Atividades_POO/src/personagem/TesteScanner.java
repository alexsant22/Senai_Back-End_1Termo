package personagem;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//pedindo infos\\
		
		//heroi
		System.out.println("Digite o nome do Herói:");
		String nomeH = scan.nextLine();
		System.out.println("Digite o poder do Herói:");
		String poderH = scan.nextLine();
		System.out.println("Digite qual o dano do poder do Herói:");
		int danoH = scan.nextInt();
		System.out.println("Digite a vida do Herói:");
		int vidaH = scan.nextInt();
		System.out.println("");//espaçamento
		SuperHeroi heroi = new SuperHeroi(nomeH, poderH, vidaH);//instanciando heroi
		
		scan.nextLine();//buffer
		System.out.println("");//espaçamento
		
		//vilao
		System.out.println("Digite o nome do Vilão:");
		String nomeV = scan.nextLine();
		System.out.println("Digite a habilidade do Vilão:");
		String poderV = scan.nextLine();
		System.out.println("Digite qual o dano da habilidade do Vilão:");
		int danoV = scan.nextInt();
		System.out.println("Digite a vida do Vilão:");
		int vidaV = scan.nextInt();
		System.out.println("");//espaçamento
		Vilao vilao = new Vilao(nomeV, poderV, vidaV);//instanciando vilão
		
		System.out.println("");//espaçamento
		
		//realizando poder e habilidades
		heroi.usarPoder(poderH, danoH); //heroi dano
		vilao.realizarHabilidade(poderV, danoV);//vilao dano

		System.out.println("");//espaçamento
		
		//recebendo dano e imprimindo
		System.out.println("Após a habilidade do vilão atingir o herói, ele ficou com " + heroi.receberDano(vidaH, danoV) + " de vida!!" +
				"\nApós o poder do herói acertar o vilão, ele ficou com " + vilao.receberDano(vidaV, danoH) + " de vida!!");
		
	}

}
