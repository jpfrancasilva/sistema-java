package br.com.jp.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	// LISTA TODAS AS RESERVAS
		public List<Reserva> listar() {

			try {

				List<Reserva> reservas = new ArrayList<Reserva>();
				PreparedStatement st = conexao.prepareStatement("select r.*, h.nome, h.cpf\r\n" + 
						"from reserva r inner join hospede h on r.codigohospede = h.codigo\r\n" + 
						"inner join quarto q on r.codigoquarto = q.codigo\r\n" + 
						"order by r.codigo");
				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					Reserva reserva = new Reserva();
					reserva.setCodigo(rs.getLong("codigo"));
					reserva.setDataEntrada(rs.getDate("dataentrada"));
					reserva.setDataSaida(rs.getDate("datasaida"));
					reserva.setValor(rs.getDouble("valortotal"));
					reserva.setDias(rs.getInt("dias"));
					reserva.setCodigoHospede(rs.getLong("codigohospede"));
					reserva.setCodigoQuarto(rs.getLong("codigoquarto"));
					reserva.setNomeHospede(rs.getString("nome"));
					reserva.setCpfHospede(rs.getString("cpf"));
					
					reservas.add(reserva);				
					}

				rs.close();
				st.close();

				return reservas;

			} catch (SQLException e) {
				throw new RuntimeException(e);
			}

		}
}
