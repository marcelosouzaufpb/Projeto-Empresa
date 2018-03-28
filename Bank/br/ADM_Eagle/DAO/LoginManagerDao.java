package br.ADM_Eagle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ADM_Eagle.Connection.ConnectionFactory;
import br.ADM_Eagle.Models.Login;

public class LoginManagerDao {

	public static Connection conexao = new ConnectionFactory().getConnection();

	public void add(Login l) {
		int id = l.getId();
		String usuario = l.getUsuario();
		String senha = l.getSenha();

		String sql = "INSERT INTO Login(id, usuario, senha) VALUES (?, ?, ?)";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.setInt(1, id);
			stmt.setString(2, usuario);
			stmt.setString(3, senha);

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void delete(Login l) {
		int id = l.getId();
		String sql = "DELETE FROM Login WHERE id = " + id;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void update(Login l) {
		String id = l.getId() + "";
		String usuario = l.getUsuario();
		String senha = l.getSenha();

		String sql = "UPDATE Login SET id='" + id + "', usuario='" + usuario + "', senha='" + senha + "' WHERE id ="
				+ id;

		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void list() {

		String sql = "SELECT id, usuario, senha FROM Login";
		try {
			java.sql.Statement st = conexao.createStatement();
			ResultSet resultadoDaConexao = st.executeQuery(sql);
			System.out.println("----------------------------------------------------------------");
			while (resultadoDaConexao.next()) {

				int id = resultadoDaConexao.getInt(1);
				String usuario = resultadoDaConexao.getString(2);
				String senha = resultadoDaConexao.getString(3);

				System.out.println("Id:" + id + "\nUsuario: " + usuario + "\nSenha: " + senha);

				System.out.println("----------------------------------------------------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
