package br.com.hsexpedito.dao.test.dependente;

import br.com.hsexpedito.dao.DependenteDAO;
import br.com.hsexpedito.model.Dependente;
import br.com.hsexpedito.model.Funcionario;


public class TestDependenteAdd {

    public static void main(String[] args) throws Exception{
    	    	
        Dependente dependente = new Dependente();
        dependente.setFuncionario(new Funcionario());     //Tive que usar isso pra sair o Nullpoint 
        
        dependente.setNome("Antonio");
        dependente.setParentesco("Filho");
        dependente.getFuncionario().setId(3);
        
        DependenteDAO dao = new DependenteDAO();
        dao.cadastar(dependente);
        
        System.out.println("Dependente "+dependente.getNome()+" cadrastrado com sucesso!");
    }    

}