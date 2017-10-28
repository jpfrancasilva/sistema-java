package br.com.jp.hotel.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/SistemaHotel";//?autoReconnect=true&useSSL=false";
		String user = "postgres";
		String password = "12345678";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
