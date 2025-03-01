package personagem;

public abstract class Personagem {

	// atributos
	private String nome;
	private int vida;

	// bob construtor padrao
	public Personagem() {
		System.out.println("Personagem criado!");
	}

	// bob construtor c/ parametro
	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}

	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	// metodos especiais para o jogo
	// sobrecarga de metodos
	public void receberDano(int dano) {
		setVida(vida - dano);
	}

	public int receberDano(int vida, int dano) {
		return vida - dano;
	}

	// sobreescrita heroi
	public void usarPoder(String poder, int damage) {
		System.out.println("Usando poder");
	}

	// sobreescrita vilao
	public void realizarHabilidade(String habilidade, int damage) {
		System.out.println("Usando habilidade");
	}
}
