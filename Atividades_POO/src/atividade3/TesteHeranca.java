package atividade3;

import java.util.Scanner;

public class TesteHeranca {

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		
		
		//pedindo infos
		System.out.println("Digite o nome do aluno 1:");
		String nm1 = scan.next();
		System.out.println("Digite o endereço do aluno 1:");
		String end1 = scan.next();
		System.out.println("Digite o telefone do aluno 1:");
		int tel1 = scan.nextInt();
		System.out.println("Digite o CPF do aluno 1:");
		int cpf1 = scan.nextInt();
		System.out.println("Digite o celular do aluno 1:");
		int cel1 = scan.nextInt();
		System.out.println("Digite o curso do aluno 1:");
		String cur = scan.next();
		System.out.println("Digite a nota 1:");
		float n1 = scan.nextInt();
		System.out.println("Digite a nota 2:");
		float n2 = scan.nextInt();
		
		//instanciando aluno1
		Aluno alu1 = new Aluno(nm1,end1,tel1,cpf1,cel1,cur,0,n1,n2);
		float media = alu1.calcularMedia(n1, n2);
		System.out.println("");
		System.out.println((alu1.situacaoFinal(media))? "Aprovado" : "Reprovado");
		System.out.println("");
		System.out.println("Nome: " + nm1 + "\nEndereço: " + end1 + "\nTelefone: " + tel1 + "\nCPF: " + cpf1 + "\nCelular: " + cel1
		+ "\nCusro: " + cur + "\nNota 1: " + n1 + "\nNota 2: " + n2 + "\nMédia: " + media);
		
		//pedindo infos pela segunda vez
		System.out.println("Digite o nome do aluno 2:");
		String nm2 = scan.next();
		System.out.println("Digite o endereço do aluno 2:");
		String end2 = scan.next();
		System.out.println("Digite o telefone do aluno 2:");
		int tel2 = scan.nextInt();
		System.out.println("Digite o CPF do aluno 2:");
		int cpf2 = scan.nextInt();
		System.out.println("Digite o celular do aluno 2:");
		int cel2 = scan.nextInt();
		System.out.println("Digite o curso do aluno 2:");
		String cur2 = scan.next();
		System.out.println("Digite a nota 1:");
		float no1 = scan.nextInt();
		System.out.println("Digite a nota 2:");
		float no2 = scan.nextInt();
				
		//instanciando aluno2
		Aluno alu2 = new Aluno(nm2,end2,tel2,cpf2,cel2,cur2,0,no1,no2);
		float media2 = alu1.calcularMedia(no1, no2);
		System.out.println("");
		System.out.println((alu1.situacaoFinal(media2))? "Aprovado" : "Reprovado");
		System.out.println("");
		System.out.println("Nome: " + nm2 + "\nEndereço: " + end2 + "\nTelefone: " + tel2 + "\nCPF: " + cpf2 + "\nCelular: " + cel2
		+ "\nCusro: " + cur2 + "\nNota 1: " + no1 + "\nNota 2: " + no2 + "\nMédia: " + media2);
		
		//pegando info prof1
		System.out.println("");
		System.out.println("Professor 1:");
		System.out.println("Digite o nome do professor 1:");
		String nm3 = scan.next();
		System.out.println("Digite o endereço do professor 1:");
		String end3 = scan.next();
		System.out.println("Digite o telefone do professor 1:");
		int tel3 = scan.nextInt();
		System.out.println("Digite o CPF do professor 1:");
		int cpf3 = scan.nextInt();
		System.out.println("Digite o celular do professor 1:");
		int cel3 = scan.nextInt();
		System.out.println("Nome do curso:");
		String nC = scan.next();
		int sa = 3000;
		
		//instanciando prof1
		Professor prof1 = new Professor(nm3, end3, tel3, cpf3, cel3, nC, sa);
		System.out.println("");
		System.out.println("Sálario é: R$" + sa);
		System.out.println("");
		System.out.println("Nome: " + nm3 + "\nEndereço: " + end3 + "\nTelefone: " + tel3 + "\nCPF" + 
		cpf3 + "\nCelular: " + cel3 + "\nNome do Curso: " + nC);
		
		//pegando info prof2
		System.out.println("");
		System.out.println("Professor 2:");
		System.out.println("Digite o nome do professor 2:");
		String nm4 = scan.next();
		System.out.println("Digite o endereço do professor 2:");
		String end4 = scan.next();
		System.out.println("Digite o telefone do professor 2:");
		int tel4 = scan.nextInt();
		System.out.println("Digite o CPF do professor 2:");
		int cpf4 = scan.nextInt();
		System.out.println("Digite o celular do professor 2:");
		int cel4 = scan.nextInt();
		System.out.println("Nome do curso:");
		String nC4 = scan.next();
		int sa4 = 3500;
				
		//instanciando prof2
		Professor prof2 = new Professor(nm4, end4, tel4, cpf4, cel4, nC4, sa4);
		System.out.println("");
		System.out.println("Sálario é: R$" + sa4);
		System.out.println("");
		System.out.println("Nome: " + nm4 + "\nEndereço: " + end4 + "\nTelefone: " + tel4 + "\nCPF" + 
		cpf4 + "\nCelular: " + cel4 + "\nNome do Curso: " + nC4);
		
	}

}

