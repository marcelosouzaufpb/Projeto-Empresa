package br.Empresa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.Empresa.Connection.ConnectionFactory;
import br.Empresa.Models.Members;

public class MembersManagerDAO {
	public static Connection conexao = new ConnectionFactory().getConnection();

	public void add(Members m) {

		int id = m.getId();
		String nome = m.getNome();
		String email = m.getEmail();
		String cargo = m.getOffice();
		String curso = m.getCourse();
		String periodo_atual = m.getCurrentPeriod();
		String cpf = m.getCpf();
		String rg = m.getRg();
		String telefone = m.getTelefone().toString();
		String endereco = m.getEndereco().toString();
		String referencias = m.getReference();
		String data_entrada = m.getEntryDate().toString();
		String observacao = m.getNote();

		String sql = "INSERT INTO Membro(id, nome, email, cargo, curso, periodo_atual,"
				+ " cpf, rg, telefone, endereco, referencias,"
				+ " data_entrada, observacao)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.setInt(1, id);
			stmt.setString(2, nome);
			stmt.setString(3, email);
			stmt.setString(4, cargo);
			stmt.setString(5, curso);
			stmt.setString(6, periodo_atual);
			stmt.setString(7, cpf);
			stmt.setString(8, rg);
			stmt.setString(9, telefone);
			stmt.setString(10, endereco);
			stmt.setString(11, referencias);
			stmt.setString(12, data_entrada);
			stmt.setString(13, observacao);

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void delete(Members m) {
		int id = m.getId();
		String sql = "DELETE FROM Membro WHERE id = " + id;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void update(Members m) {
		int id = m.getId();
		String nome = m.getNome();
		String email = m.getEmail();
		String cargo = m.getOffice();
		String curso = m.getCourse();
		String periodo_atual = m.getCurrentPeriod();
		String cpf = m.getCpf();
		String rg = m.getRg();
		String telefone = m.getTelefone().toString();
		String endereco = m.getEndereco().toString();
		String referencias = m.getReference();
		String data_entrada = m.getEntryDate().toString();
		String observacao = m.getNote();

		String sql = "UPDATE Membro SET id='" + id + "', nome='" + nome + "', email='" + email + "', cargo='" + cargo
				+ "'," + " curso='" + curso + "', periodo_atual='" + periodo_atual + "', cpf='" + cpf + "', rg='" + rg
				+ "', telefone='" + telefone + "'," + " endereco='" + endereco + "', referencias='" + referencias
				+ "', data_entrada='" + data_entrada + "', observacao='" + observacao + "' WHERE id = " + id;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void list() {

		String sql = "SELECT id, nome, email, cargo, curso, periodo, cpf, rg, telefone, endereco, referencias, data_entrada, observacao FROM membro";
		try {
			java.sql.Statement st = conexao.createStatement();
			ResultSet resultadoDaConexao = st.executeQuery(sql);
			System.out.println("----------------------------------------------------------------");
			while (resultadoDaConexao.next()) {

				int id = resultadoDaConexao.getInt(1);
				String nome = resultadoDaConexao.getString(2);
				String email = resultadoDaConexao.getString(3);
				String cargo = resultadoDaConexao.getString(4);
				String curso = resultadoDaConexao.getString(5);
				String periodo_atual = resultadoDaConexao.getString(6);
				String cpf = resultadoDaConexao.getString(7);
				String rg = resultadoDaConexao.getString(8);
				String telefone = resultadoDaConexao.getString(9).toString();
				String endereco = resultadoDaConexao.getString(10).toString();
				String referencias = resultadoDaConexao.getString(11);
				String data_entrada = resultadoDaConexao.getString(12).toString();
				String observacao = resultadoDaConexao.getString(13);

				System.out.println("Id: " + id + "\nNome: " + nome + "\nEmail: " + email + "\nCargo: " + cargo
						+ "\nCurso: " + curso + "\nPeriodo: " + periodo_atual + "\nCPF: " + cpf + "\nRG: " + rg
						+ "\nTelefone: " + telefone + "\nEndereco: " + endereco + "\nReferencias: " + referencias
						+ "\nData_entrada: " + data_entrada + "\nObservacao: " + observacao);
				
				System.out.println("----------------------------------------------------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
