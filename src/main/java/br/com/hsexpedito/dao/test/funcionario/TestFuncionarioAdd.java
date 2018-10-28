package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioAdd {

	public static void main(String[] args) throws Exception {

		Funcionario f = new Funcionario(1, "Miguel Trival", "miguel.t@gmail.com", "98764321");
		Funcionario g = new Funcionario(2, "Joao Pedro", "joaoPedro@gmail.com", "99999999");
		Funcionario h = new Funcionario(3, "Zé do Caixão", "ze@gmail.com", "88888888");
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		dao.cadastar(f);
		dao.cadastar(g);
		dao.cadastar(h);

		//System.out.println("Funcionario " + f.getNome() + " cadrastrado com sucesso!");
	}

}