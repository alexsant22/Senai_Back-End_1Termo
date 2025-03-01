package personagem;

public class TestePersonagem {

	public static void main(String[] args) {

		// intanciando superHeroi
		SuperHeroi heroi = new SuperHeroi("Motoqueiro Fantasma", "Bola de fogo!", 200);

		System.out.println("");//espaçamento
		
		// instanciando vilao
		Vilao vilao = new Vilao("Necromante", "Sombras ergam-se!", 200);
		
		System.out.println("");//espaçamento
		
		//heroi utilizando seu poder
		heroi.usarPoder("Bola de fogo!", 100);
		//vilao utilizando sua habilidade
		vilao.realizarHabilidade("Sombras ergam-se!", 50);
		
		System.out.println("");//espaçamento
		
		//recebendo dano e imprimindo
		System.out.println("Após a habilidade do vilão atingir o herói, ele ficou com " + heroi.receberDano(200, 100) + " de vida!!" +
				"\nApós o poder do herói acertar o vilão, ele ficou com " + vilao.receberDano(200, 50) + " de vida!!");

	}

}
