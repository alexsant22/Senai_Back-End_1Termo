package atividade6;

public class Estudante {
	// atributos
	public String nome;
	public int ra;
	public String curso;
	
	//bob construtor c/ parametro
	public Estudante(String nome, int ra, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
	}

	//gatters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
