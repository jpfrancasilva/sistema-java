package br.com.jp.hotel.testes;

import java.util.List;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class TesteListaHospedes {

	public static void main(String[] args) {
		
		HospedesDAO dao = new HospedesDAO();
		
		List<Hospedes> listaHospedes = dao.listar();
		
		for (Hospedes hospedes : listaHospedes) {
			System.out.println(hospedes.getCodigo());
			System.out.println(hospedes.getNome());
			System.out.println();
		}
	}

}
