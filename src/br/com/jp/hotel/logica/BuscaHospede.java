package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class BuscaHospede implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Long codigo = Long.parseLong(request.getParameter("codigo"));
		
		Hospedes hospede = new HospedesDAO().buscaHospede(codigo);
		
		request.setAttribute("hospede", hospede);

		return "WEB-INF/paginas/detalhe-hospede.jsp";
		
	}

}
