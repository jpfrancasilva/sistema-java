package br.com.jp.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
				usuario.setTipo(rs.getString("tipo"));

			}
			
			rs.close();
			st.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return usuario;
	}
	
	public List<Usuario> listar() {

		try {

			List<Usuario> usuarios = new ArrayList<Usuario>();
			PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM usuario");
			ResultSet rs = stmt.executeQuery(); // --> O resultado da query
												// acima é gravado dentro de rs.

			while (rs.next()) {
				// Criando novo objeto usuario
				Usuario usuario = new Usuario();
				
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTipo(rs.getString("tipo"));
				usuario.setTipo(rs.getString("senha"));

				// adicionando um usuario à lista de usuarios
				usuarios.add(usuario);
			}

			rs.close();
			stmt.close();
			return usuarios;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
