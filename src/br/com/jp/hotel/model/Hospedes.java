package br.com.jp.hotel.model;

import java.io.Serializable;

public class Hospedes implements Serializable {

	private static final long serialVersionUID = 7152869752037535555L;
	private long codigo;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String pessoas;

	public Hospedes() {
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPessoas() {
		return pessoas;
	}

	public void setPessoas(String pessoas2) {
		this.pessoas = pessoas2;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
