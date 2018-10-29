package br.com.hsexpedito.dao.test.dependente;

import br.com.hsexpedito.dao.DependenteDAO;
import br.com.hsexpedito.model.Dependente;

public class TestDependenteBuscarPorId {

	public static void main(String[] args) throws Exception {

		DependenteDAO dao = new DependenteDAO();
		Dependente dependente = dao.buscaPorId(4);

        System.out.println("Cod: " + dependente.getId());
        System.out.println("Nome: " + dependente.getNome());
        System.out.println("Parentesco: " + dependente.getParentesco());
        System.out.println("Funcionário Titular: " + dependente.getFuncionario().getNome());


	}

}