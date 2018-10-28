package br.com.hsexpedito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Funcionario;

public class FuncionarioDAO {

	public void cadastar(Funcionario f) {

		String sql = "INSERT INTO tb_funcionario (nome, email, tel)" + "VALUES(?,?,?)";

		try (Connection conexao = ConnectionMySql.openDatabase()) {

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setString(1, f.getNome());
			ps.setString(2, f.getEmail());
			ps.setString(3, f.getTelefone());

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro na insercao no banco de dados!");
		}
	}
	// BUSCAR POR ID - 1 FUNC + SEUS DEPENDENTES

	// BUSCAR POR NOME - 1 FUNC + SEUS DEPENDENTES

	// ATUALIZAR

	// DELETAR

	// LISTAR TODOS FUNCIONARIOS
}