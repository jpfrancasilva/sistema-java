package br.com.jp.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.jp.hotel.conexao.ConnectionFactory;
import br.com.jp.hotel.model.Usuario;

public class UsuarioDAO {

	Connection conexao = new ConnectionFactory().getConnection();

	public Usuario buscaPorEmailESenha(String email, String senha) {

		Usuario usuario = new Usuario();

		try {
			
			PreparedStatement st = conexao.prepareStatement("SELECT * FROM usuario WHERE email = ? AND senha = ?");
			st.setString(1, email);
			st.setString(2, senha);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {

				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setNome(rs.getString("nome"));

			}
			
			rs.close();
			st.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return usuario;
	}
}
