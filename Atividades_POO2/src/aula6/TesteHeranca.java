package aula6;

public class TesteHeranca {

	public static void main(String[] args) {
		//instanciar objs
		Cachorro cao1 = new Cachorro();
		cao1.nome = "Caramelo";
		System.out.println("Meu nome é: " + cao1.nome);
		Cachorro cao2 = new Cachorro("Rex", "Pitibull");
		System.out.println("Caozinho se chama " + cao2.nome + "De raça" + cao2.getRaca());
		//cao de casa
		//Cachorro cao3 = new Cachorro("Mel", "Shitzu");
		//System.out.println("A cadela se chama " + cao3.nome + "Da raça" + cao3.getRaca());
		
		//Animal an1 = new Animal(); não consigo instanciar obj
		cao1.dormir();
		cao1.emitirSom();
		cao1.brincar();
		cao1.correr();
		cao1.comida();
		//Cachorro cao3 = (Cachorro) new Animal(); não da instanciar com uma classe abstrata
		
	}

}
