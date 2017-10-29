package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class ReservaQuarto implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// PEGANDO PARÂMETROS E GUARDANDO EM VARIÁVEIS --qualquer coisa teste
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String cpf = request.getParameter("cpf");

		// INSTANCIANDO UM NOVO OBJETO HOSPEDE E SETANDO OS PARÂMETROS
		Hospedes hospede = new Hospedes();
		hospede.setNome(nome);
		hospede.setEndereco(endereco);
		hospede.setTelefone(telefone);
		hospede.setCpf(cpf);

		// INSTACIANDO O DAO E ADD UM NOVO HOSPEDE
		HospedesDAO dao = new HospedesDAO();
		dao.adicionar(hospede);

		//String dataEntrada = request.getParameter("dataEntrada");
		//String dataSaida = request.getParameter("dataSaida");
		//Integer dias = Integer.parseInt(request.getParameter("dias"));
		//Double valor = Double.parseDouble(request.getParameter("valor"));

		return "sistema?logica=VisaoGeral";
	}

}
