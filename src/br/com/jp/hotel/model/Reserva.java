package br.com.jp.hotel.model;

import java.io.Serializable;
import java.sql.Date;
//import java.util.Calendar;

public class Reserva implements Serializable {

	private static final long serialVersionUID = -6567310622270338443L;
	private Long codigo;
	private Date dataEntrada;
	private Date dataSaida;
	private Double valor;
	private String situacao;
	private Long codigoHospede;
	private Long codigoQuarto;
	private int dias;
	private String nomeHospede;
	private String cpfHospede;
	private Hospedes hospede;
	private Quarto quarto;

	public Hospedes getHospede() {
		return hospede;
	}

	public void setHospede(Hospedes hospede) {
		this.hospede = hospede;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public String getCpfHospede() {
		return cpfHospede;
	}

	public void setCpfHospede(String cpfHospede) {
		this.cpfHospede = cpfHospede;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public Reserva() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date date) {
		this.dataEntrada = date;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
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
