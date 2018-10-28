package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioAdd {

	public static void main(String[] args) throws Exception {

		Funcionario f = new Funcionario();
		
		f.setNome("Miguel Trival");
		f.setEmail("miguel.t@gmail.com");
		f.setTelefone("98764321");

		FuncionarioDAO dao = new FuncionarioDAO();
		dao.cadastar(f);

		//System.out.println("Funcionario " + f.getNome() + " cadrastrado com sucesso!");
	}

}
