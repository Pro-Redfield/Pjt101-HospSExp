package br.com.hsexpedito.dao;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Funcionario;

public class FuncionarioDAO extends ConnectionMySql {

	// CADASTRAR
	public void cadastar(Funcionario f) throws Exception {
		openDatabase();
		SQL = "INSERT INTO tb_funcionario (nome, email, tel)" + "VALUES(?,?,?)";
		ps = con.prepareStatement(SQL);
		ps.setString(1, f.getNome());
		ps.setString(2, f.getEmail());
		ps.setString(3, f.getTelefone());
		ps.execute();
		closeDatabase();
	}

	// BUSCAR POR ID - 1 FUNC + SEUS DEPENDENTES

	// BUSCAR POR NOME - 1 FUNC + SEUS DEPENDENTES

	// ATUALIZAR

	// DELETAR

	// LISTAR TODOS FUNCIONARIOS

}
