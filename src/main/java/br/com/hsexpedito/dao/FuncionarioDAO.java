package br.com.hsexpedito.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.hsexpedito.connection.ConnectionMySql;
import br.com.hsexpedito.model.Dependente;
import br.com.hsexpedito.model.Funcionario;

public class FuncionarioDAO extends ConnectionMySql {

	// CADASTRAR
	public void cadastar(Funcionario funcionario) throws Exception {
		openDatabase();
		SQL = "INSERT INTO tb_funcionario (nome, email, tel)" + "VALUES(?,?,?)";
		ps = con.prepareStatement(SQL);
		ps.setString(1, funcionario.getNome());
		ps.setString(2, funcionario.getEmail());
		ps.setString(3, funcionario.getTelefone());
		ps.execute();
		closeDatabase();
	}

	// BUSCAR POR ID - 1 FUNC + SEUS DEPENDENTES
	public Funcionario buscaPorId(Integer id) throws Exception {
		openDatabase();
		SQL = "SELECT tb_funcionario.idfuncionario, tb_funcionario.nome, tb_funcionario.email, tb_funcionario.tel, tb_dependente.iddependente, tb_dependente.nome, tb_dependente.parentesco " +  
				"FROM tb_funcionario " + 
				"INNER JOIN tb_dependente ON tb_funcionario.idfuncionario = tb_dependente.funcionario_id " +
				"WHERE tb_funcionario.idfuncionario = ?";
		ps = con.prepareStatement(SQL);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		
		Funcionario funcionario = new Funcionario();
		List<Dependente> listaDependentes = new ArrayList<Dependente>();
		funcionario.setDependentes(new ArrayList<Dependente>());
		
		while (rs.next()) {
			funcionario.setId(rs.getInt("tb_funcionario.idfuncionario"));
			funcionario.setNome(rs.getString("tb_funcionario.nome"));
			funcionario.setEmail(rs.getString("tb_funcionario.email"));
			funcionario.setTelefone(rs.getString("tb_funcionario.tel"));

				Dependente dependente = new Dependente();
				dependente.setId(rs.getInt("tb_dependente.iddependente"));
				dependente.setNome(rs.getString("tb_dependente.nome"));
				dependente.setParentesco(rs.getString("tb_dependente.parentesco"));

			listaDependentes.add(dependente);

		}

		funcionario.setDependentes(listaDependentes);
		
		closeDatabase();
		return funcionario;
	}

	// BUSCAR POR NOME - 1 FUNC + SEUS DEPENDENTES

	// ATUALIZAR
	public void atualizar(Funcionario funcionario) throws Exception {
		openDatabase();
		SQL = "UPDATE tb_funcionario SET nome=?, email=?, tel=? "
			+ "WHERE idfuncionario=?";
		ps = con.prepareStatement(SQL);
		ps.setString(1, funcionario.getNome());
		ps.setString(2, funcionario.getEmail());
		ps.setString(3, funcionario.getTelefone());
		ps.setInt(4, funcionario.getId());
		ps.execute();
		closeDatabase();
	}

	// DELETAR
	public void deletar(Integer id) throws Exception {
		openDatabase();
		SQL = "DELETE FROM tb_funcionario WHERE idfuncionario=?";
		ps = con.prepareStatement(SQL);
		ps.setInt(1, id);
		ps.execute();
		closeDatabase();
	}

	// LISTAR TODOS FUNCIONARIOS
	public List<Funcionario> listar () throws Exception {
		openDatabase();
		SQL = "SELECT * FROM tb_funcionario";
		ps = con.prepareStatement(SQL);
		rs = ps.executeQuery();
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		while(rs.next()){
			Funcionario funcionario = new Funcionario();
            funcionario.setId(rs.getInt("idfuncionario"));
			funcionario.setNome(rs.getString("nome"));
			funcionario.setEmail(rs.getString("email"));
			funcionario.setTelefone(rs.getString("tel"));
			listaFuncionarios.add(funcionario);
        }
		closeDatabase();
		return listaFuncionarios;
	}

}
