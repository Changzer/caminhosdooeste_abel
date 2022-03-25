package br.com.uniamerica.transportadora.motorista;

import java.time.LocalDate;

public class Motorista {
	
	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String dataNascimento;
	private String endereco;
	private String obs;
	
	
	
	public Motorista() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}
}
