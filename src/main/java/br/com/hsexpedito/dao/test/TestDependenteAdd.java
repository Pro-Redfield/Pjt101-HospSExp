package br.com.hsexpedito.dao.test;

import br.com.hsexpedito.dao.DependenteDAO;
import br.com.hsexpedito.model.Dependente;

public class TestDependenteAdd {


    public static void main(String[] args) throws Exception{
        Dependente d = new Dependente();
        d.setNome("Antonio");
        d.setParentesco("Filho");
        d.setFuncionarioid(1);
        DependenteDAO dao = new DependenteDAO();
        dao.cadastar(d);
        
        System.out.println("Dependente "+d.getNome()+" cadrastrado com sucesso!");
    }    

}
