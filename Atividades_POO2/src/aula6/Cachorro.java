package aula6;

public class Cachorro extends Animal {
	//atributo
	private String raca;
	//construtor com parametros
	public Cachorro() {
		System.out.println("Nasci sem raça");
	}
	public Cachorro(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
