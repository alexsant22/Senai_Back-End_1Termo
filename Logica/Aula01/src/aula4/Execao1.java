package aula4;

public class Execao1 {

	public static void main(String[] args) {
		
		try {
			//aqui o usuario faz a coisa errado!
			int conta = 10 / 0;
			System.out.println("Res: " + conta);
			
		} catch (Exception e) {//dispara exeção p/ tratar o erro
			System.out.println("ERRO:" + e);
		}
		System.out.println("Continua o código...");
	}

}
