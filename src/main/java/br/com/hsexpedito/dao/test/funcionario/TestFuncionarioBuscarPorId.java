package br.com.hsexpedito.dao.test.funcionario;

import java.util.ArrayList;
import java.util.List;
import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Dependente;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioBuscarPorId {

	public static void main(String[] args) throws Exception {

		FuncionarioDAO dao = new FuncionarioDAO();
		Funcionario funcionario = dao.buscaPorId(1);

        System.out.println("Funcionário:");
        
        System.out.println("Cod: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Telefone: " + funcionario.getTelefone());
        
        System.out.println("\nLista de seus dependetes:");
        
        List<Dependente> dependentes = new ArrayList<Dependente>();
        dependentes = funcionario.getDependentes();

//        for(Dependente dependente : dependentes){
//            System.out.println("Cod: " + dependente.getId());
//            System.out.println("Nome: " + dependente.getNome());
//            System.out.println("Email: " + dependente.getParentesco());
//            System.out.println("");
//        }


	}

}