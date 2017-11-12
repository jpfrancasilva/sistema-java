package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.QuartoDAO;
import br.com.jp.hotel.model.Quarto;

public class BuscaQuartoCancelar implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Long codigo = Long.parseLong(request.getParameter("codigo"));

		Quarto quarto = new QuartoDAO().buscaPorCodigo(codigo);

		request.setAttribute("quarto", quarto);

		return "WEB-INF/paginas/detalhe-quarto-cancelar.jsp";
	}

}
