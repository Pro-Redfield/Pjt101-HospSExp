package br.com.hsexpedito.connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionMySql {
	
    public Connection con;
    
    public Connection get()throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsexpedito";
        String user = "root";
        String password = "root";
        
        if ( con == null){
            con = DriverManager.getConnection(url, user, password);
            return con;
        }
        
        return con;
        
    }

    public void close() throws RuntimeException{
        if(con != null){
            try {
                con.close();
            } catch (SQLException exception) {
                throw new RuntimeException("Failed to connect database");
            }
        }
    }
}
