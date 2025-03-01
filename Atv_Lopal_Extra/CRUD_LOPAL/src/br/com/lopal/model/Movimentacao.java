package br.com.lopal.model;

import java.sql.Timestamp;

public class Movimentacao {

	private int id;
	private int produtoId;
	private int qtd_Entrada;
	private int qtd_Saida;
	private int qtd_Atual;
	private Timestamp date_Mov;
	
	//bob construtor padrao
	public Movimentacao() {
		
	}
	
	//bob construtor c/ parametro
	public Movimentacao(int id, int produtoId, int qtd_Entrada, int qtd_Saida, int qtd_Atual, Timestamp date_Mov) {
		this.id = id;
        this.produtoId = produtoId;
        this.qtd_Entrada = qtd_Entrada;
        this.qtd_Saida = qtd_Saida;
        this.qtd_Atual = qtd_Atual;
        this.date_Mov = date_Mov;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}

	public int getQtd_Entrada() {
		return qtd_Entrada;
	}

	public void setQtd_Entrada(int qtd_Entrada) {
		this.qtd_Entrada = qtd_Entrada;
	}

	public int getQtd_Saida() {
		return qtd_Saida;
	}

	public void setQtd_Saida(int qtd_Saida) {
		this.qtd_Saida = qtd_Saida;
	}

	public int getQtd_Atual() {
		return qtd_Atual;
	}

	public void setQtd_Atual(int qtd_Atual) {
		this.qtd_Atual = qtd_Atual;
	}

	public Timestamp getDate_Mov() {
		return date_Mov;
	}

	public void setDate_Mov(Timestamp date_Mov) {
		this.date_Mov = date_Mov;
	}
	
}
