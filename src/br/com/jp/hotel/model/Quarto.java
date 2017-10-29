package br.com.jp.hotel.model;

import java.io.Serializable;

public class Quarto implements Serializable {

	private static final long serialVersionUID = 7507334445797620913L;
	private Long codigo;
	private int numero;
	private int andar;
	private String descricao;
	private double valorDiaria;
	private String tipo;
	private int numeroPessoa;
	private String situacao;

	public Quarto() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPessoa() {
		return numeroPessoa;
	}

	public void setNumeroPessoa(int numeroPessoa) {
		this.numeroPessoa = numeroPessoa;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void setInt(int int1) {
		// TODO Auto-generated method stub
		
	}

}
