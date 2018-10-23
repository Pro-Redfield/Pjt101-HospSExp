package br.com.hsexpedito.dao.test.dependente;

import br.com.hsexpedito.dao.DependenteDAO;
import br.com.hsexpedito.model.Dependente;
import br.com.hsexpedito.model.Funcionario;

public class TestDependenteAtualizar {

	public static void main(String[] args) throws Exception {


        String id = ("6"); // Id do Dependente a que será atualizado
        String nome = ("Sthefanny");
        String parentesco = ("Filha");
        String funcionario_id = ("3");

        Dependente dependente = new Dependente();
        dependente.setFuncionario(new Funcionario());     //Tive que usar isso pra sair o Nullpoint 
        
        dependente.setId(Integer.parseInt(id)); //Convertendo String p/ int
        dependente.setNome(nome);
        dependente.setParentesco(parentesco);
        dependente.getFuncionario().setId(Integer.parseInt(funcionario_id)); //Convertendo String p/ int

        DependenteDAO dao = new DependenteDAO();
        dao.atualizar(dependente);
        System.out.println("Dependente "+dependente.getNome()+" alterado com sucesso!");

	}

}