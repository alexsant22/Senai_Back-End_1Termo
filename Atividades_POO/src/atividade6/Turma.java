package atividade6;

import java.util.ArrayList;
import java.util.List;

public class Turma{
	//atributos
	public String nome;
	
	//atributo classe estudante
	//private Estudante estudantes;
	
	//array de estudante
	private List<Estudante> estudantes = new ArrayList<>();
	
	//bob construtor
	public Turma(String nome, List estudantes) {
		this.nome = nome;
		this.estudantes = estudantes;
	}

	//getter setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

}

