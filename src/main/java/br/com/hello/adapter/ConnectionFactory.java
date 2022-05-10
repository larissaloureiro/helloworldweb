package br.com.hello.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Preparar a conexao
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", "rootpassword");
		} catch (SQLException ex) {
			throw new SQLException("Erro: " + ex.getMessage());
		} catch (ClassNotFoundException ex) {
			throw new SQLException("Driver n�o localizado: (" + ex.getMessage()+")");
		}
	}
}
