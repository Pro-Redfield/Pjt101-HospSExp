package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;

public class TestFuncionarioDeletar {

	public static void main(String[] args) throws Exception {

		FuncionarioDAO dao = new FuncionarioDAO();
		dao.deletar(7); // Id do funcionario que sera deletado
		System.out.println("Funcionario deletado com sucesso!");

	}
}
