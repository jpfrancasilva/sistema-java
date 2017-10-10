package br.com.jp.hotel.testes;

import java.util.List;

import br.com.jp.hotel.dao.QuartoDAO;
import br.com.jp.hotel.model.Quarto;

public class TesteListaQuarto {
	public static void main(String[] args) {

		QuartoDAO dao = new QuartoDAO();

		List<Quarto> listaQuartos = dao.listar();

		for (Quarto quartos : listaQuartos) {
			System.out.println(quartos.getCodigo());
			System.out.println(quartos.getNumero());
			System.out.println(quartos.getAndar());
			System.out.println(quartos.getDescricao());
		}
	}
}
