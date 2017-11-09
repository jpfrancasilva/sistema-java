package br.com.jp.hotel.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.UsuarioDAO;
import br.com.jp.hotel.model.Usuario;

public class ListaUsuarios implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Usuario> usuarios = new UsuarioDAO().listar();

		request.setAttribute("usuarios", usuarios);

		return "/WEB-INF/paginas/usuarios.jsp";

	}

}
