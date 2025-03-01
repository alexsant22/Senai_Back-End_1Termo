package personagem;

public class SuperHeroi extends Personagem {

	// atributos
	private String poder;

	// bob construtor padrao
	public SuperHeroi() {
		System.out.println("SuperHerói criado!");
	}

	// bob construtor c/ parametro
	public SuperHeroi(String nome, String poder, int vida) {
		super(nome, vida);
		this.poder = poder;
		System.out.println("Nome do Herói: " + nome + "\nPoder do Herói: " + poder + "\nVida: " + vida);
	}

	// getters and setters
	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	// método especial
	// sobreescrita
	@Override
	public void usarPoder(String poder, int damage) {
		System.out.println("Herói usou o poder " + poder + ", com o damage de " + damage);
	}
}
