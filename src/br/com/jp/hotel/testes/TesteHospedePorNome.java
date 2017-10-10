package br.com.jp.hotel.testes;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class TesteHospedePorNome {

	public static void main(String[] args) {
		
		HospedesDAO dao = new HospedesDAO();
		
		Hospedes hospede = dao.hospedePorNome("Wátila Costa");
		
		System.out.println(hospede.getCodigo());
		System.out.println(hospede.getNome());
	}

}
