package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.QuartoDAO;
import br.com.jp.hotel.logica.Logica;
import br.com.jp.hotel.model.Quarto;

public class CadastraQuartos implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int codigo = Integer.parseInt(request.getParameter("andar") + request.getParameter("andar"));
		int numero = Integer.parseInt(request.getParameter("numero"));
		int andar = Integer.parseInt(request.getParameter("andar"));
		String descricao = request.getParameter("descricao");
		Float valorDiaria = Float.parseFloat(request.getParameter("valorDiaria"));
		String tipo = request.getParameter("tipo");
		String situacao = request.getParameter("situacao");

		Quarto quarto = new Quarto();
		quarto.setCodigo((long) codigo);
		quarto.setNumero(numero);
		quarto.setAndar(andar);
		quarto.setDescricao(descricao);
		quarto.setValorDiaria(valorDiaria);
		quarto.setTipo(tipo);
		quarto.setSituacao(situacao);

		QuartoDAO dao = new QuartoDAO();
		dao.adicionar(quarto);

		return "sistema?logica=ListaQuartos";
	}

}
