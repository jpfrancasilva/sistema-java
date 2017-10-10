package br.com.jp.hotel.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.QuartoDAO;
import br.com.jp.hotel.model.Quarto;

public class VisaoGeral implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Quarto> quartos = new QuartoDAO().listar();
		request.setAttribute("quartos", quartos);
		
		return "/WEB-INF/paginas/index.jsp";
	}
	
}
