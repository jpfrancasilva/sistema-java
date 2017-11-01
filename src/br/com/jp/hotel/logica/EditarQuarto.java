package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.QuartoDAO;
import br.com.jp.hotel.model.Quarto;

public class EditarQuarto implements Logica {
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Integer codigo = Integer.parseInt(request.getParameter("codigo"));
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		Integer andar = Integer.parseInt(request.getParameter("andar"));
		String descricao = request.getParameter("descricao");
		Double diaria = Double.parseDouble(request.getParameter("diaria"));
		String tipo = request.getParameter("tipo");
		String situacao = request.getParameter("situacao");
		
		Quarto quarto = new Quarto();
		quarto.setCodigo(codigo);
		quarto.setNumero(numero);
		quarto.setAndar(andar);
		quarto.setDescricao(descricao);
		quarto.setValorDiaria(diaria);
		quarto.setTipo(tipo);
		quarto.setSituacao(situacao);
		
		QuartoDAO dao = new QuartoDAO();
		dao.editar(quarto);

		return "sistema?logica=ListaQuartos";

	}
}
