package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioAtualizar {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario(1, "Joao", "joao@gmail.com", "226-1000");
		
		FuncionarioDAO fDAO = new FuncionarioDAO();
		
		fDAO.cadastar(funcionario);
		
		fDAO.atualizar(11, "Pedro", "pedro@gmail.com", "336-1000");
		
		
	}

}
