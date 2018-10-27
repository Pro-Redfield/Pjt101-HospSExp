package br.com.hsexpedito.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySql {

	static final String mysqlDatabase = "JDBC:mysql://localhost:3306/hsexpedito";
	static final String user = "root";
	static final String password = "root";

	public static Connection openDatabase() {

		try {
			return DriverManager.getConnection(mysqlDatabase, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro na abertura de conexão com o banco de dados!");
			return null;
		}
	}

	public void closeDatabase(Connection connection) {

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao fechar conexão com o banco de dados!");
		}
	}
}