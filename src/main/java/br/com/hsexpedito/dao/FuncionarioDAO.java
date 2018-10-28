package br.com.hsexpedito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro na insercao no banco de dados!");
		}
	}

	public void atualizar(int id, String nome, String email, String telefone) {

		String updateSql = "UPDATE tb_funcionario SET nome = ?, email = ?, tel = ? WHERE idfuncionario = ?";

		try (Connection conexao = ConnectionMySql.openDatabase()) {

			PreparedStatement ps = conexao.prepareStatement(updateSql);

			ps.setString(1, nome);
			ps.setString(2, email);
			ps.setString(3, telefone);
			ps.setInt(4, id);

			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao atualizar funcionario no banco de dados!");
		}
	}

	public List<Funcionario> listar() {

		String selectSql = "SELECT * FROM tb_funcionario";
		ResultSet lista = null;
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try (Connection conexao = ConnectionMySql.openDatabase()) {

			PreparedStatement ps = conexao.prepareStatement(selectSql);

			lista = ps.executeQuery();

			while (lista.next()) {
				Funcionario funcionario = new Funcionario(lista.getInt("idfuncionario"), lista.getString("nome"),lista.getString("email"), lista.getString("tel"));
				funcionarios.add(funcionario);
			}
			
			lista.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar funcionarios no banco de dados!");
		}
		
		return funcionarios;
	}
	
	// BUSCAR POR ID - 1 FUNC + SEUS DEPENDENTES

	// BUSCAR POR NOME - 1 FUNC + SEUS DEPENDENTES

	// ATUALIZAR

	// DELETAR

	// LISTAR TODOS FUNCIONARIOS
}