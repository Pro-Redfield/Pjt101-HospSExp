package br.com.hsexpedito.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionMySql {

	public Connection con;
	public PreparedStatement ps;
	public ResultSet rs;
	public String SQL;

	static final String mysqlDatabase = "JDBC:mysql://localhost:3306/hsexpedito";
	static final String user = "root";
	static final String password = "root";

	public void openDatabase() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/hsexpedito";
		String user = "root";
		String password = "root";
		con = DriverManager.getConnection(url, user, password);
	}

	public void closeDatabase() throws Exception {
		if (con != null) {
			con.close();
		}
	}
}
