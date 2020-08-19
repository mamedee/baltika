package de.mamede.baltika.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class Usuario {
	
	@NotEmpty(message="O nome deve ser informado.")
	private String nome;
	@NotEmpty(message="A data de nascimento deve ser informada.")
	private Date nascimento;
	@NotEmpty(message="O email deve ser informado.")
	private String email;
	private String senha;
	private Boolean ativo;
	
	/****************************************/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setCpfCnpj(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
