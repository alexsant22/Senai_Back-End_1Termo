package atv_trat_excecao;

import java.util.Scanner;

class UsuarioNaoEncontrado extends Exception {
	public UsuarioNaoEncontrado(String mensagem) {
		super(mensagem);
	}
}

class SenhaIncorreta extends Exception {
	public SenhaIncorreta(String mensagem) {
		super(mensagem);
	}
}

public class Ex7 {
	
	static void login(String usuario, int senha) throws UsuarioNaoEncontrado, SenhaIncorreta {
		if (usuario == null || usuario.isEmpty() || !usuario.equals("alxissz")) {
			throw new UsuarioNaoEncontrado("Usuário inválido.");
		}
		if (senha != 2201) {
			throw new SenhaIncorreta("Senha inválida.");
		}
		System.out.println("Conectado...");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Digite o usuário: ");
			String usu = scan.next();
			System.out.println("Digite sua senha: ");
			int sen = scan.nextInt();
			Ex7 pessoa = new Ex7();
			pessoa.login(usu, sen);
			scan.close();
		} catch (UsuarioNaoEncontrado | SenhaIncorreta e) {
			System.out.println(e.getMessage());
		}

	}

}
