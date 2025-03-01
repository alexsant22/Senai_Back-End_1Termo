package br.com.lopal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.lopal.controller.Conexao;
import br.com.lopal.model.Movimentacao;

public class MovDao {

	// create
    public void create(Movimentacao movimentacao) {
        String sql = "INSERT INTO movimentacoes (produto_id, qtd_entrada_produto, qtd_saida_produto, qtd_atual) VALUES (?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement p = null;

        try {
            conn = Conexao.criandoConexao();
            p = conn.prepareStatement(sql);
            p.setInt(1, movimentacao.getProdutoId());
            p.setInt(2, movimentacao.getQtd_Entrada());
            p.setInt(3, movimentacao.getQtd_Saida());
            p.setInt(4, movimentacao.getQtd_Atual());
            p.execute();
            System.out.println("Movimentação registrada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao registrar movimentação: " + e);
        } finally {
            try {
                if (p != null) {
                    p.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
    }// create

    // read
    public List<Movimentacao> read() {
        String sql = "SELECT * FROM movimentacoes";
        List<Movimentacao> movimentacoes = new ArrayList<>();
        Connection conn = null;
        PreparedStatement p = null;
        ResultSet rs = null;

        try {
            conn = Conexao.criandoConexao();
            p = conn.prepareStatement(sql);
            rs = p.executeQuery();

            while (rs.next()) {
                Movimentacao movimentacao = new Movimentacao();
                movimentacao.setId(rs.getInt("id"));
                movimentacao.setProdutoId(rs.getInt("produto_id"));
                movimentacao.setQtd_Entrada(rs.getInt("qtd_entrada_produto"));
                movimentacao.setQtd_Saida(rs.getInt("qtd_saida_produto"));
                movimentacao.setQtd_Atual(rs.getInt("qtd_atual"));
                movimentacao.setDate_Mov(rs.getTimestamp("data_movimentacao"));

                movimentacoes.add(movimentacao);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler movimentações: " + e);
        } finally {
            try {
                if (p != null) {
                    p.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }

        return movimentacoes;
    }// read

    // update
    public void update(Movimentacao movimentacao) {
        String sql = "UPDATE movimentacoes SET produto_id = ?, qtd_entrada_produto = ?, qtd_saida_produto = ?, qtd_atual = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement p = null;

        try {
            conn = Conexao.criandoConexao();
            p = conn.prepareStatement(sql);
            p.setInt(1, movimentacao.getProdutoId());
            p.setInt(2, movimentacao.getQtd_Entrada());
            p.setInt(3, movimentacao.getQtd_Saida());
            p.setInt(4, movimentacao.getQtd_Atual());
            p.setInt(5, movimentacao.getId());
            p.execute();
            System.out.println("Movimentação atualizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar movimentação: " + e);
        } finally {
            try {
                if (p != null) {
                    p.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
    }// update

    // delete
    public boolean delete(int id) {
        String sql = "DELETE FROM movimentacoes WHERE id = ?";
        Connection conn = null;
        PreparedStatement p = null;

        try {
            conn = Conexao.criandoConexao();
            p = conn.prepareStatement(sql);
            p.setInt(1, id);
            p.execute();
            System.out.println("Movimentação excluída com sucesso!");
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao excluir movimentação: " + e);
            return false;
        } finally {
            try {
                if (p != null) {
                    p.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
    }// delete
	
}// class
