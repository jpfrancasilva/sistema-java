package br.com.jp.hotel.testes;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class TesteAdicionaHospede {

	public static void main(String[] args) {
		
		Hospedes hospede = new Hospedes();
		hospede.setNome("Marcelo Ferreira");
		hospede.setCpf("000.000.000-00");
		hospede.setEndereco("Estrada do Pici,12");
		hospede.setTelefone("0000000000");
		
		HospedesDAO dao = new HospedesDAO();
		dao.adicionar(hospede);

	}

}
