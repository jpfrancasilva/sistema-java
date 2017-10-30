package br.com.jp.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.jp.hotel.conexao.ConnectionFactory;
import br.com.jp.hotel.model.Quarto;

public class QuartoDAO {

	Connection conexao = new ConnectionFactory().getConnection();

	// INSERE QUARTO
	public void adicionar(Quarto quarto) {

		String sql = "INSERT INTO quarto (codigo, numero, andar, descricao, valorDiaria, tipo, situacao) VALUES(?,?,?,?,?,?,?)";

		try {

			PreparedStatement st = conexao.prepareStatement(sql);
			st.setFloat(1, quarto.getCodigo());
			st.setInt(2, quarto.getNumero());
			st.setInt(3, quarto.getAndar());
			st.setString(4, quarto.getDescricao());
			st.setDouble(5, quarto.getValorDiaria());
			st.setString(6, quarto.getTipo());
			st.setString(7, quarto.getSituacao());

			st.execute();
			st.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// EDITA QUARTO
	public void editar(Quarto quarto) {

		String sql = "UPDATE quarto SET numero = ?, andar = ?, descricao = ?, valorDiaria = ?, tipo = ?, situacao = ? WHERE codigo = ?";

		try {

			PreparedStatement st = conexao.prepareStatement(sql);
			st.setInt(1, quarto.getNumero());
			st.setInt(2, quarto.getAndar());
			st.setString(3, quarto.getDescricao());
			st.setDouble(4, quarto.getValorDiaria());
			st.setString(5, quarto.getTipo());
			st.setString(6, quarto.getSituacao());
			st.setLong(7, quarto.getCodigo());
			st.execute();
			st.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// EXCLUIR QUARTO
	public void excluir(Quarto quarto) {

		String sql = "DELETE FROM quarto WHERE codigo = ?";

		try {

			PreparedStatement st = conexao.prepareStatement(sql);
			st.setLong(1, quarto.getCodigo());
			st.execute();
			st.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// LISTA TODOS OS QUARTOS
	public List<Quarto> listar() {

		try {

			List<Quarto> quartos = new ArrayList<Quarto>();
			PreparedStatement st = conexao.prepareStatement("SELECT * FROM quarto");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				Quarto quarto = new Quarto();
				quarto.setCodigo(rs.getLong("codigo"));
				quarto.setNumero(rs.getInt("numero"));
				quarto.setAndar(rs.getInt("andar"));
				quarto.setDescricao(rs.getString("descricao"));
				quarto.setTipo(rs.getString("tipo"));
				quarto.setValorDiaria(rs.getDouble("valorDiaria"));
				quarto.setSituacao(rs.getString("situacao"));
				quartos.add(quarto);
			}

			rs.close();
			st.close();

			return quartos;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	//BUSCA QUARTO PELO CÓDIGO
	public Quarto buscaPorCodigo(Long codigo) {
		
		String sql = "SELECT * FROM quarto WHERE codigo = ?";
		Quarto quarto = new Quarto();

		try {
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setLong(1, codigo);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				quarto.setCodigo(rs.getLong("codigo"));
				quarto.setAndar(rs.getInt("andar"));
				quarto.setDescricao(rs.getString("descricao"));
				quarto.setNumero(rs.getInt("numero"));
				quarto.setValorDiaria(rs.getDouble("valorDiaria"));
				quarto.setTipo(rs.getString("tipo"));
				quarto.setSituacao(rs.getString("situacao"));
			}
			
			rs.close();
			st.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return quarto;
	}

}
