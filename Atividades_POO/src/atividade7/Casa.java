package atividade7;

public class Casa {
	//atributos classe 'casa'
	private String cor;
	private float preco;
	private float metragem;
	
	//atributos de composição (classes extra)
	public Sala sala;
	public Quarto quarto;
	
	//bob construtor padrao
	public Casa() {
		System.out.println("Casa !");
	}
	
	//bob construtor c/ parametro
	public Casa(String cor, float preco, float metragem, Quarto quarto, Sala sala) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.quarto = quarto;
		this.sala = sala;
	}

	//getter e setter
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getMetragem() {
		return metragem;
	}

	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto Quarto) {
		this.quarto = Quarto;
	}
	
	//metodo especial
	public void mostrarDetalhes() {
		System.out.println("A cor da casa será: " + cor);
		System.out.println("O preço da cara será: R$" + preco);
		System.out.println("A metragem da casa será: " + metragem + "m²");
		System.out.println("Possui o quarto: " + quarto.getNome() + ". E o número de camas é: " + quarto.getNumeroCamas());
		System.out.println("Possui a sala: " + sala.getNome() + ". Ter TV: " + sala.getTemTV());
	}

}
