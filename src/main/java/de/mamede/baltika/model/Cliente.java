package de.mamede.baltika.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Cliente {
	
	@NotEmpty(message="O nome deve ser informado.")
	private String nome;
	@NotEmpty(message="O cnpj deve ser informado.")
	private Long cpfCnpj;
	private String fone;
	@NotEmpty(message="O email deve ser informado.")
	private String email;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String cep;
	private String estado;
	private String cidade;
	
	/****************************************/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(Long cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
