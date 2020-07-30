package de.mamede.baltika.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Cerveja {
	
	@NotEmpty(message = "O SKU deve ser preenchido.")
	private String sku;
	@NotEmpty(message = "O nome deve ser preenchido.")
	private String nome;
	@NotEmpty(message = "A descrição deve ser preenchida.")
	@Size(max=100, message = "A descrição deve ter 200 caracteres no máximo.")
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
