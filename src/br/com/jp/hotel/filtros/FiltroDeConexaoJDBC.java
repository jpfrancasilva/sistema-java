package br.com.jp.hotel.filtros;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.jp.hotel.conexao.ConnectionFactory;

@WebFilter("/*")
public abstract class FiltroDeConexaoJDBC implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// Disponibiliza uma conexao e atribui um objeto connection na request.
		Connection conexao = new ConnectionFactory().getConnection();
		request.setAttribute("conexao", conexao);

		chain.doFilter(request, response);

		try {
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
