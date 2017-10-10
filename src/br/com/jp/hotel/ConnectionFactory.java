package br.com.jp.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
