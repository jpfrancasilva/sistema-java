package br.com.jp.hotel.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.ReservaDAO;
import br.com.jp.hotel.model.Reserva;

public class ListaReservas implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Reserva> reservas = new ReservaDAO().listar();

		request.setAttribute("reservas", reservas);

		return "/WEB-INF/paginas/reservas.jsp";

	}

}
