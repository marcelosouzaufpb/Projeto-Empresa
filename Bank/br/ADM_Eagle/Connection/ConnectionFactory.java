package br.ADM_Eagle.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String URL = "jdbc:postgresql://localhost:5432/Databases_Eagle";
	String USER = "postgres";
	String PASSWORD = "postgres";

	public Connection getConnection() {
		System.out.println("Conectando ao banco");
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
