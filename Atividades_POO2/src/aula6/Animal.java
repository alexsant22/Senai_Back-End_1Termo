package aula6;

public class Animal { //classe abstrata
	//atributos
	protected String nome;
	//construtor padrão
	public Animal() {
		System.out.println("Nasci");
	}
	public Animal(String nome) {
		this.nome = nome;
	}
	//metodo
	public void emitirSom() {
		System.out.println(nome + " som classe Animal");
	}
	public void dormir() {
		System.out.println(nome + " Roncando...");
	}
	public void brincar() {
		System.out.println(nome + " Brincando com a bolinha");
	}
	public void correr() {
		System.out.println(nome + " Correndo pelo quintal");
	}
	public void comida() {
		System.out.println(nome + " Pedindo comida");
	}

}
