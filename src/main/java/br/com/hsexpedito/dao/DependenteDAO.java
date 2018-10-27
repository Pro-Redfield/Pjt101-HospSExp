package br.com.hsexpedito.dao;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Dependente;
import br.com.hsexpedito.model.Funcionario;

public class DependenteDAO extends ConnectionMySql{
	
	
	// CADASTRAR
    public void cadastar(Dependente dependente) throws Exception{
        openDatabase();
        SQL = "INSERT INTO tb_dependente (nome, parentesco, funcionario_id)"
                + "VALUES(?,?,?)";
        ps = con.prepareStatement(SQL);
        ps.setString(1, dependente.getNome());
        ps.setString(2, dependente.getParentesco());
        ps.setInt(3, dependente.getFuncionario().getId());
        ps.execute();
        CloseDatabase();
    }
    
    // BUSCAR POR ID - DEPENDENTE + FUNCIONARIO TITULAR
    public Dependente buscaPorId(Integer id)throws Exception{
        openDatabase();
        SQL = "SELECT "
        	+"tb_dependente.iddependente,tb_dependente.nome,tb_dependente.parentesco,"
        	+"tb_funcionario.idfuncionario,tb_funcionario.nome "
    	+"FROM "
    		+"tb_dependente "
    	+"INNER JOIN "
    		+"tb_funcionario ON tb_dependente.funcionario_id = tb_funcionario.idfuncionario "
    	+"WHERE "
    		+"tb_dependente.iddependente = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, id);
        rs = ps.executeQuery();
		Dependente dependente = new Dependente();
		dependente.setFuncionario(new Funcionario());
		if (rs.next()) {
			dependente.setId(rs.getInt("tb_dependente.iddependente"));
			dependente.setNome(rs.getString("tb_dependente.nome"));
			dependente.setParentesco(rs.getString("tb_dependente.parentesco"));
			dependente.getFuncionario().setNome(rs.getString("tb_funcionario.nome"));
		}
		CloseDatabase();
		return dependente;
	}
    
    //  BUSCAR POR NOME - DEPENDENTE + FUNCIONARIO TITULAR
    
    

	// ATUALIZAR
	public void atualizar(Dependente dependente) throws Exception {
		openDatabase();
		SQL = "UPDATE tb_dependente SET nome=?, parentesco=?, funcionario_id=? "
			+ "WHERE iddependente=?";
		ps = con.prepareStatement(SQL);
		ps.setString(1, dependente.getNome());
		ps.setString(2, dependente.getParentesco());
		ps.setInt(3, dependente.getFuncionario().getId());
		ps.setInt(4, dependente.getId());
		ps.execute();
		CloseDatabase();
	}

	// DELETAR
	public void deletar(Integer id) throws Exception {
		openDatabase();
		SQL = "DELETE FROM tb_dependente WHERE iddependente=?";
		ps = con.prepareStatement(SQL);
		ps.setInt(1, id);
		ps.execute();
		CloseDatabase();
	}
}
