package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.UsuarioDAO;
import br.com.jp.hotel.model.Usuario;

public class ExcluirUsuario implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Long codigo = Long.parseLong(request.getParameter("codigo"));
		
		Usuario usuario = new Usuario();
		usuario.setCodigo(codigo);
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.excluir(usuario);
		
		return "sistema?logica=ListaUsuarios";
	}
	
}
