package br.com.hsexpedito.connection;

import java.sql.*;

public class ConnectionMySql {
	
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public String SQL;
    
    public void OpenDatabase()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsexpedito";
        String user = "root";
        String password = "root";
        con = DriverManager.getConnection(url, user, password);
    }

    public void CloseDatabase() throws Exception{
        if(con != null){
            con.close();
        }
    }
}
