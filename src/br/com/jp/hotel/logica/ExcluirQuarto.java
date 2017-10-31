package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.QuartoDAO;
import br.com.jp.hotel.model.Quarto;

public class ExcluirQuarto implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer codigo = Integer.parseInt(request.getParameter("codigo"));
		
		Quarto quarto = new Quarto();
		quarto.setCodigo(codigo);
		
		QuartoDAO dao = new QuartoDAO();
		dao.excluir(quarto);
		
		return "sistema?logica=ListaQuartos";
	}
	
}
