package br.com.jp.hotel.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class ListaHospedes implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Hospedes> hospedes = new HospedesDAO().listar();

		request.setAttribute("hospedes", hospedes);

		return "/WEB-INF/paginas/hospedes.jsp";

	}

}
