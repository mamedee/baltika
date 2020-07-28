package de.mamede.baltika.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Cerveja {
	
	@NotEmpty
	private String sku;
	@NotEmpty
	private String nome;
	@NotEmpty
	@Size(max=50)
	private String descricao;
	
	//******************************************
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
	

}
