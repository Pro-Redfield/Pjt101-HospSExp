package br.com.hsexpedito.dao.test.funcionario;

import br.com.hsexpedito.dao.FuncionarioDAO;
import br.com.hsexpedito.model.Funcionario;

public class TestfuncionarioAtualizar {

	public static void main(String[] args) throws Exception {

        String id = ("4"); // Id do Funcionario a que será atualizado
        String nome = ("Anderson Nunes");
        String email = ("anderson.a@email.com");
        String telefone = ("11223344");

        Funcionario funcionario = new Funcionario();
        
        funcionario.setId(Integer.parseInt(id)); //Convertendo String para int
        funcionario.setNome(nome);
        funcionario.setEmail(email);
        funcionario.setTelefone(telefone);

        FuncionarioDAO dao = new FuncionarioDAO();
        dao.atualizar(funcionario);
        System.out.println("Funcionario "+funcionario.getNome()+" alterado com sucesso!");

	}

}