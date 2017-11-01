package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class EditaHospede implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Long codigo = Long.parseLong(request.getParameter("codigoEd"));
		String nome = request.getParameter("nomeEd");
		String endereco = request.getParameter("enderecoEd");
		String telefone = request.getParameter("telefoneEd");
		String cpf = request.getParameter("cpfEd");

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
