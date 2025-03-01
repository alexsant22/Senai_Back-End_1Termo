package atv_trat_excecao;

import java.util.Scanner;

class IdadeInvalida extends Exception {
	public IdadeInvalida(String mensagem) {
		super(mensagem);
	}
}

class Ex5 {
	public static void verificaIdade(int idade) throws IdadeInvalida{
		if (idade < 18) {
			throw new IdadeInvalida("ERRO: Idade inválida. Usuário menor de idade.");
		} else {
			System.out.println("Idade válida.");
		}
	}
	
	public static void main(String[] args) {
	
		try {
			System.out.println("Digite sua idade: ");
			Scanner scan = new Scanner(System.in);
			int idade1 = scan.nextInt();
			Ex5 id = new Ex5();
			id.verificaIdade(idade1);
			scan.close();
			
		} catch (IdadeInvalida e) {
			System.out.println(e.getMessage());

		}
	}
}

