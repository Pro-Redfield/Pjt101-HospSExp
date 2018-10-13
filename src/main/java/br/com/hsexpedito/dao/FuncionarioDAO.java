package br.com.hsexpedito.dao;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDAO{
	
    private final Connection connection;
    
    public FuncionarioDAO() throws Exception{
        connection = new ConnectionMySql().get();
    }
    public void cadastar(Funcionario funcionario) throws SQLException{
        
        try {
            String sql = "INSERT INTO funcionario (nome, email, telefone) VALUES(?,?,?)";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getEmail());
            statement.setString(3, funcionario.getTelefone());
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(
                    FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            connection.close();
        }
    }
	
}
