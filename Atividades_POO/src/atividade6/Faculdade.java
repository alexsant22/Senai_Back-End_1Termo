package atividade6;

public class Faculdade {
	//atributos
	public String nomeFacul;
	
	//atributos de composição
	private Turma cursos;
	
	//bob construtor
	public Faculdade(String nomeFacul, Turma cursos) {
		this.nomeFacul = nomeFacul;
		this.cursos = cursos;
	}

	//getter setter
	public String getNomeFacul() {
		return nomeFacul;
	}

	public void setNomeFacul(String nomeFacul) {
		this.nomeFacul = nomeFacul;
	}

	public Turma getCursos() {
		return cursos;
	}

	public void setCursos(Turma cursos) {
		this.cursos = cursos;
	}
	
	//metodo especial
	public int getTotalEstudantes() {
		return getTotalEstudantes();
	}


}
