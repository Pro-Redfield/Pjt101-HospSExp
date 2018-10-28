package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioListarPorId {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		FuncionarioDAO fDao = new FuncionarioDAO();

		funcionario = fDao.listarId(13);

		System.out.println(funcionario);
	}
}