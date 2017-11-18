package br.com.jp.hotel.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.dao.UsuarioDAO;
import br.com.jp.hotel.model.Usuario;

public class Login implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);

		if (usuario.getNome() == null) {
			System.out.println("usuario nao existe");
			return "loginErro.jsp";
		} else if(usuario.getTipo().equals("comum")) {
				//System.out.println("Usuário logado: " + usuario.getNome());
				request.setAttribute("usuarioteste", usuario);
				return "WEB-INF/paginas/index.jsp";
			}else {
					//System.out.println("Usuário logado: " + usuario.getNome());
					request.setAttribute("usuarioteste", usuario);
					return "WEB-INF/paginas/indexAdmin.jsp";
				}
	}
}
