package br.com.hsexpedito.dao;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Dependente;

public class DependenteDAO extends ConnectionMySql{
	
	

    public void cadastar(Dependente d) throws Exception{
        OpenDatabase();
        SQL = "INSERT INTO tb_dependente (nome, parentesco, funcionario_id)"
                + "VALUES(?,?,?)";
        ps = con.prepareStatement(SQL);
        ps.setString(1, d.getNome());
        ps.setString(2, d.getParentesco());
        ps.setInt(3, d.getFuncionarioid());
        ps.execute();
        CloseDatabase();
    }

}
