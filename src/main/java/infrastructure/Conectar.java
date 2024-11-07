package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

	private static final String URL = "jdbc:mysql://localhost:3306/estudei";
	private static final String USUARIO = "root";
	private static final String SENHA = "MySQL2020#!";

	public static Connection conectar() {
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			System.out.println("Conexão bem-sucedida!");
		} catch (SQLException e) {
			System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
		}
		return conexao;
	}
}
