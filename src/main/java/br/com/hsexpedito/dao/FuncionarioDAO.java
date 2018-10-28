package br.com.hsexpedito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Funcionario;

public class FuncionarioDAO {

	public void cadastar(Funcionario f) {

		String insertSql = "INSERT INTO tb_funcionario (nome, email, tel)" + "VALUES(?,?,?)";

		try (Connection conexao = ConnectionMySql.openDatabase()) {

			PreparedStatement ps = conexao.prepareStatement(insertSql);

			ps.setString(1, f.getNome());
			ps.setString(2, f.getEmail());
			ps.setString(3, f.getTelefone());

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro na insercao no banco de dados!");
		}
	}

	public void atualizar(int id, String nome, String email, String telefone) {

		String updateSql = "UPDATE tb_funcionario SET idfuncionario = ?, nome = ?, email = ?, tel = ? WHERE idfuncionario = ?";

		try (Connection conexao = ConnectionMySql.openDatabase()) {

			PreparedStatement ps = conexao.prepareStatement(updateSql);

			ps.setInt(1, id);
			ps.setString(2, nome);
			ps.setString(3, email);
			ps.setString(4, telefone);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao atualizar funcionario no banco de dados!");
		}
	}
	// BUSCAR POR ID - 1 FUNC + SEUS DEPENDENTES

	// BUSCAR POR NOME - 1 FUNC + SEUS DEPENDENTES

	// ATUALIZAR

	// DELETAR

	// LISTAR TODOS FUNCIONARIOS
}