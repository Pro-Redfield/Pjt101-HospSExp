package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioAdd {

	public static void main(String[] args) throws Exception {

		Funcionario f = new Funcionario(1, "Miguel Trival", "miguel.t@gmail.com", "98764321");		
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		dao.cadastar(f);

		//System.out.println("Funcionario " + f.getNome() + " cadrastrado com sucesso!");
	}

}