package br.com.lopal.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	//atributos(constantes) para conexao
		private static final String USERNAME = "root";
		private static final String PASSWORD = "";
		private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/empresa";
		
		public static Connection criandoConexao() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexao = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			return conexao;
		}
		
		public static void main(String[] args) throws Exception {
			//conectando ao BD
			Connection con = criandoConexao();
			if (con != null) {
				System.out.println("Conectado");
			}
			con.close();
		}
	
}
