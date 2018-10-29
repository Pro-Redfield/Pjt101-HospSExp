package br.com.hsexpedito.dao.test.funcionario;

import java.util.List;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestFuncionarioListar {

	public static void main(String[] args) throws Exception{
		
		FuncionarioDAO dao = new FuncionarioDAO();

        List<Funcionario> funcionarios = dao.listar();

        for(Funcionario funcionario : funcionarios){
            System.out.println("Cod: " + funcionario.getId());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Email: " + funcionario.getEmail());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("");
        }
        System.out.print("Fim!");
    }
}