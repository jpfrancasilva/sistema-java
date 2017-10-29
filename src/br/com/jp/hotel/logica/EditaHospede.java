package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class EditaHospede implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Long codigo = Long.parseLong(request.getParameter("codigo"));
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String cpf = request.getParameter("cpf");

		Hospedes hospede = new Hospedes();
		hospede.setCodigo(codigo);
		hospede.setNome(nome);
		hospede.setEndereco(endereco);
		hospede.setTelefone(telefone);
		hospede.setCpf(cpf);

		HospedesDAO dao = new HospedesDAO();
		dao.editar(hospede); 

		return "sistema?logica=ListaHospedes";

	}

}
