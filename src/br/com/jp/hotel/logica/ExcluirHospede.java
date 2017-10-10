package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class ExcluirHospede implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Long codigo = Long.parseLong(request.getParameter("codigo"));
		
		Hospedes hospede = new Hospedes();
		hospede.setCodigo(codigo);
		
		HospedesDAO dao = new HospedesDAO();
		dao.excluir(hospede);
		
		return "sistema?logica=ListaHospedes";
	}
	
}
