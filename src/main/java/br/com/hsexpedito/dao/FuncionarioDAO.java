package br.com.hsexpedito.dao;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Funcionario;

public class FuncionarioDAO extends ConnectionMySql {

	// CADASTRAR
	public void cadastar(Funcionario f) throws Exception {
		OpenDatabase();
		SQL = "INSERT INTO tb_funcionario (nome, email, tel)"
				+ "VALUES(?,?,?)";
		ps = con.prepareStatement(SQL);
		ps.setString(1, f.getNome());
		ps.setString(2, f.getEmail());
		ps.setString(3, f.getTelefone());
		ps.execute();
		CloseDatabase();
	}

	// BUSCAR POR ID

	// ATUALIZAR

	// DELETAR
	
	// LISTAR TODOS FUNCIONARIOS
	
	// LISTA FUNCIONA UM FUNCIONARIO POR ID E SEUS DEPENDENTES
	

}
