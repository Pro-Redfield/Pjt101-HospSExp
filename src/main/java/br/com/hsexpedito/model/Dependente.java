package br.com.hsexpedito.model;

public class Dependente {
	
	private int id;
	private String nome;
	private String parentesco;
	private int funcionarioid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public int getFuncionarioid() {
		return funcionarioid;
	}
	public void setFuncionarioid(int funcionarioid) {
		this.funcionarioid = funcionarioid;
	}
	
	
	
}
