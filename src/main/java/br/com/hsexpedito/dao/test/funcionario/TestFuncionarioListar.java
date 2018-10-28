package br.com.hsexpedito.dao.test.funcionario;

import java.util.ArrayList;
import java.util.List;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioListar {

	public static void main(String[] args) {

		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		FuncionarioDAO fDao = new FuncionarioDAO();

		listaFuncionarios = fDao.listar();

		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}

	}

}