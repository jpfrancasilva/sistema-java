package br.com.jp.hotel.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jp.hotel.logica.Logica;

@WebServlet("/sistema")
public class Sistema extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String parametro = request.getParameter("logica");
		String NomeClasse = "logica." + parametro;

		try {
			Class<?> classe = Class.forName(NomeClasse);

			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(request, response);

			request.getRequestDispatcher(pagina).forward(request, response);

		} catch (Exception e) {
			throw new ServletException("A lógica lançou uma exceção", e);
		}
	}

}
