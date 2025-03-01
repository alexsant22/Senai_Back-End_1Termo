package br.com.lopal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.lopal.model.Produto;
import br.com.lopal.controller.Conexao;

public class LopalDAO {

	//create
	public void create(Produto produto) {
		
		String sql = "INSERT INTO produtos (nome, quantidade, categoria) VALUES (?, ?, ?)";
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			p.setString(1, produto.getNome());
			p.setInt(2, produto.getQuantidade());
			p.setString(3, produto.getCategoria());
			p.execute();
			System.out.println("Produto adicionado com sucesso!");
			
		} catch (Exception e) {
			System.out.println("Erro ao adicionar produto.");
		} finally {
			try {
				if (p != null);
				p.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}//create
	
	//read
	public List<Produto> read() {
		String sql = "SELECT * FROM produtos";
		List<Produto> produtos = new ArrayList<Produto>();//lista de produtos
		Connection conn = null;
		PreparedStatement p = null;
		ResultSet resultado = null;
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			resultado = p.executeQuery();
			while(resultado.next()) {
				Produto ver_produto = new Produto();
				ver_produto.setId(resultado.getInt("id"));
				ver_produto.setNome(resultado.getString("nome"));
				ver_produto.setQuantidade(resultado.getInt("quantidade"));
				ver_produto.setCategoria(resultado.getString("categoria"));
				produtos.add(ver_produto);
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao ler a lista de produtos.");
		} finally {
			try {
				if (p != null);
				p.close(); //fecha a conexao
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return produtos;
	}//read
	
	//update
	public void update(Produto produto) {
		String sql = "UPDATE produtos SET nome = ?, quantidade = ?, categoria = ? WHERE id = ?";
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			p.setString(1, produto.getNome());
			p.setInt(2, produto.getQuantidade());
			p.setString(3, produto.getCategoria());
			p.setInt(4, produto.getId());
			p.execute();
			System.out.println("Dados de produto atualizados!");
			
		} catch (Exception e) {
			System.out.println("Erro ao atualizar o produto.");
		} finally {
			try {
				if (p != null);
				p.close(); //fecha a conexao
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//update
	
	//delete
	public void delete(int id) {
		String sql = "DELETE FROM produtos WHERE id = ?";
		Connection conn = null;
		PreparedStatement p = null;
		try {
			conn = Conexao.criandoConexao();
			p = (PreparedStatement) conn.prepareStatement(sql);
			p.setInt(1, id);
			p.execute();
			System.out.println("Produto deletado com sucesso!");
			
			
		} catch (Exception e) {
			System.out.println("Erro ao deletar produto.");
		} finally {
			try {
				if (p != null);
				p.close(); //fecha a conexao
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//delete
	
}//classe