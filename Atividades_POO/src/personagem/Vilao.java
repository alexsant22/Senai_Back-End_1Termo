package personagem;

public class Vilao extends Personagem {

	// atributos
	private String habilidade;

	// bob construtor padrao
	public Vilao() {
		System.out.println("Vilão criado!");
	}

	// bob construtor c/ parametro
	public Vilao(String nome, String habilidade, int vida) {
		super(nome, vida);
		this.habilidade = habilidade;
		System.out.println("Nome do Vilão: " + nome + "\nHabilidade do Vilão: " + habilidade + "\nVida: " + vida);
	}

	// getters and setters
	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}

	// method special
	// sobreescrita
	@Override
	public void realizarHabilidade(String habilidade, int damage) {
		System.out.println("Vilão usou a habilidade " + habilidade + ", com o damage de " + damage);
	}
}
