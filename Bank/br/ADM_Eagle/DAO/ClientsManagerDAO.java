package br.ADM_Eagle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ADM_Eagle.Connection.ConnectionFactory;
import br.ADM_Eagle.Models.Clients;

public class ClientsManagerDAO {
	public static Connection conexao = new ConnectionFactory().getConnection();

	public void add(Clients c) {
		String sql = "INSERT INTO Cliente(id, nome, email, telefone, endereco, observacao)VALUES (?, ?, ?, ?, ?, ?);";
		int id = c.getId();
		String nome = c.getNome();
		String email = c.getEmail();
		String telefone = c.getTelefone().toString();
		String endereco = c.getEndereco().toString();
		String observacao = c.getObservacao();

		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.setLong(1, id);
			stmt.setString(2, nome);
			stmt.setString(3, email);
			stmt.setString(4, telefone);
			stmt.setString(5, endereco);
			stmt.setString(6, observacao);

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void delete(Clients c) {
		int id = c.getId();
		String sql = "DELETE FROM cliente WHERE id = " + id;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void update(Clients c) {
		int id = c.getId();
		String nome = c.getNome();
		String email = c.getEmail();
		String telefone = c.getTelefone().toString();
		String endereco = c.getEndereco().toString();
		String observacao = c.getObservacao();

		String sql = "UPDATE Cliente SET id='" + id + "', nome='" + nome + "', email='" + email + "', telefone='"
				+ telefone + "', endereco='" + endereco + "', observacao='" + observacao + "' WHERE id = " + id;

		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void list() {

		String sql = "SELECT id, nome, email, telefone, endereco, observacao FROM Cliente";
		try {
			java.sql.Statement st = conexao.createStatement();
			ResultSet resultadoDaConexao = st.executeQuery(sql);
			System.out.println("----------------------------------------------------------------");
			while (resultadoDaConexao.next()) {
				int id = resultadoDaConexao.getInt(1);
				String nome = resultadoDaConexao.getString(2);
				String email = resultadoDaConexao.getString(3);
				String telefone = resultadoDaConexao.getString(4).toString();
				String endereco = resultadoDaConexao.getString(5).toString();
				String observacao = resultadoDaConexao.getString(6);

				System.out.println("Id:" + id + "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone
						+ "\nEndereco: " + endereco + "\nObservacao: " + observacao);

				System.out.println("----------------------------------------------------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
