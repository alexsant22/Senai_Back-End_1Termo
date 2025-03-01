package aula01;

public class Switch1 {
	public static void main(String[] args) {
		int idade = 18;
		//chave acessa sua escolha
		switch (idade) {
		case 10:
			System.out.println("Menor de idade");
			break;
		case 18:
			System.out.println("Maior de idade");
			break;
		case 60:
			System.out.println("Experiente");
			break;
		default:
			System.out.println("Digite uma idade válida");
			break;
		}//fim switch
	}//fim main
}//fim classe
