package aula4;
// nome invalido ... email invalido
class NomeInvalido extends Exception{
	public NomeInvalido(String mensagem) {
		super();
	}
}

class EmailInvalido extends Exception{
	public EmailInvalido(String mensagem) {
		super();
	}
}

public class SistemaCadastro {
	
	public void SistemaCadastro(String nome, String email) throws NomeInvalido, EmailInvalido {
		//validar nome
		if (nome == null || nome.trim().isEmpty()) {
			throw new NomeInvalido("ERRO: Nome inválido.");
		}
		if (email == null || !email.contains("@") || !email.contains(".")) {
			throw new EmailInvalido("ERRO: E-mail inválido.");
		}
		//se der tudo certo...
		System.out.println("Usuário cadastrado: " + nome);
	}

	public static void main(String[] args) {
		SistemaCadastro sist = new SistemaCadastro();
		//taratmento de exceção
		try {
			sist.SistemaCadastro("Alexandre Elson", "alexandre@gmail.com");
		} catch (NomeInvalido | EmailInvalido ob) {
			System.out.println(ob.getMessage());
		}
		
	}

}
