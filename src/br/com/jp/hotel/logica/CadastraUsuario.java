package br.com.jp.hotel.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.conexao.ConnectionFactory;
import br.com.jp.hotel.dao.UsuarioDAO;
import br.com.jp.hotel.model.Usuario;

public class CadastraUsuario implements Logica {

	Connection conexao = new ConnectionFactory().getConnection();

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String tipo = request.getParameter("tipo");

		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		usuario.setTipo(tipo);
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.adicionar(usuario);
		
		return "sistema?logica=ListaUsuarios";
	}

}
