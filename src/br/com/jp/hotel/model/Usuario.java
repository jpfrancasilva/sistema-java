package br.com.jp.hotel.model;

public class Usuario extends Funcionario{

	private static final long serialVersionUID = -4393139419376833546L;
	private String nome;
	private String email;
	private String senha;
	private String tipo;
	
	public Usuario(){
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
