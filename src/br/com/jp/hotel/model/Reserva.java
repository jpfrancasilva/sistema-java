package br.com.jp.hotel.model;

import java.io.Serializable;
import java.util.Calendar;

public class Reserva implements Serializable {

	private static final long serialVersionUID = -6567310622270338443L;
	private Long codigo;
	private Calendar dataEntrada;
	private Calendar dataSaida;
	private Double valor;
	private String situacao;
	private Long codigoHospede;
	private Long codigoQuarto;
	private int dias;

	public Reserva() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Calendar getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Long getCodigoHospede() {
		return codigoHospede;
	}

	public void setCodigoHospede(Long codigoHospede) {
		this.codigoHospede = codigoHospede;
	}

	public Long getCodigoQuarto() {
		return codigoQuarto;
	}

	public void setCodigoQuarto(Long codigoQuarto) {
		this.codigoQuarto = codigoQuarto;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

}
