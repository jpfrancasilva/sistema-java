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
				usuario.setSenha(rs.getString("senha"));
				usuario.setCodigo(rs.getLong("id"));

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
	
	public void adicionar(Usuario usuario) {
		String sql = "INSERT INTO usuario (nome, email, senha, tipo) VALUES (?,?,?,?)";

		try {

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.setString(4, usuario.getTipo());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public void excluir(Usuario usuario) {

		try {

			String sql = "DELETE FROM usuario WHERE id = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setLong(1, usuario.getCodigo());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
}
