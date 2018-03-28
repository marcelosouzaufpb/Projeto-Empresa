package br.ADM_Eagle.Connection;
import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
	
	public static void main(String[] args) throws SQLException{
		Connection conexao = new ConnectionFactory().getConnection();
		System.out.println("Conectado");
		conexao.close();
	}
}
