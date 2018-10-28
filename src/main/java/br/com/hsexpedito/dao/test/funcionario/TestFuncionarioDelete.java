package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;

public class TestFuncionarioDelete {

	public static void main(String[] args) {

		FuncionarioDAO fDao = new FuncionarioDAO();

		fDao.deletar(12);
	}
}