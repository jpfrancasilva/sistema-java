package br.com.jp.hotel.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.conexao.ConnectionFactory;
import br.com.jp.hotel.dao.HospedesDAO;
import br.com.jp.hotel.model.Hospedes;

public class CadastraHospedes implements Logica {

	Connection conexao = new ConnectionFactory().getConnection();

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");
		String cpf = request.getParameter("cpf");

		Hospedes hospede = new Hospedes();
		hospede.setNome(nome);
		hospede.setEndereco(endereco);
		hospede.setTelefone(telefone);
		hospede.setCpf(cpf);

		HospedesDAO dao = new HospedesDAO();
		dao.adicionar(hospede);
		
		return "sistema?logica=ListaHospedes";
	}

}
