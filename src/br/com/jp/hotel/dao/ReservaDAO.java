package br.com.jp.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.jp.hotel.conexao.ConnectionFactory;
import br.com.jp.hotel.model.Reserva;

public class ReservaDAO {
	Connection conexao = new ConnectionFactory().getConnection();

	public void inserir(Reserva reserva) {

		String sql = "INSERT INTO reserva (entrada, saida, situacao, valor, codigo_hospede, codigo_quarto) VALUES(?,?,?,?,?,?)";

		try {

			PreparedStatement st = conexao.prepareStatement(sql);
			//
			//saida
			st.setString(3, reserva.getSituacao());
			st.setDouble(4, reserva.getValor());
			st.setLong(5, reserva.getCodigoHospede());
			st.setLong(6, reserva.getCodigoQuarto());

			st.execute();
			st.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
