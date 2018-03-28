package br.ADM_Eagle.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ADM_Eagle.Connection.ConnectionFactory;
import br.ADM_Eagle.Models.Clients;
import br.ADM_Eagle.Models.Payment;
import br.ADM_Eagle.Models.Projects;

public class ProjectsManagerDAO {
	public static Connection conexao = new ConnectionFactory().getConnection();

	public void add(Clients c, Projects p, Payment pg) {

		String sql = "INSERT INTO Projeto(id, cliente_id, pagamento_id, nome,"
				+ " equipe_envolvida, setor_projeto, data_inicio, data_termino, "
				+ "duracao, data_vencimento, observacao, status)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			int id = p.getId();
			int cliente_id = c.getId();
			int pagamento_id = pg.getId();
			String nome = p.getName();
			String equipe_envolvida = p.getTeamInvolved();
			String setor_projeto = p.getProjectSector();
			String data_inicio = p.getStartDate().toString();
			String data_termino = p.getEndDate().toString();
			int duracao = p.getDuration();
			String data_vencimento = p.getDueDate().toString();
			String observacao = p.getNote();
			String status = p.getStatus();

			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setInt(2, cliente_id);
			stmt.setInt(3, pagamento_id);
			stmt.setString(4, nome);
			stmt.setString(5, equipe_envolvida);
			stmt.setString(6, setor_projeto);
			stmt.setString(7, data_inicio);
			stmt.setString(8, data_termino);
			stmt.setInt(9, duracao);
			stmt.setString(10, data_vencimento);
			stmt.setString(11, observacao);
			stmt.setString(12, status);

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void delete(Projects p) {
		int id = p.getId();
		String sql = "DELETE FROM Projeto WHERE id =" + id;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void update(Clients c, Projects p, Payment pg) {

		int id = p.getId();
		int cliente_id = c.getId();
		int pagamento_id = pg.getId();
		String nome = p.getName();
		String equipe_envolvida = p.getTeamInvolved();
		String setor_projeto = p.getProjectSector();
		String data_inicio = p.getStartDate().toString();
		String data_termino = p.getEndDate().toString();
		int duracao = p.getDuration();
		String data_vencimento = p.getDueDate().toString();
		String observacao = p.getNote();
		String status = p.getStatus();

		String sql = "UPDATE Projeto SET id='" + id + "', cliente_id='" + cliente_id + "', pagamento_id='"
				+ pagamento_id + "', nome='" + nome + "'," + " equipe_envolvida='" + equipe_envolvida
				+ "', setor_projeto='" + setor_projeto + "', data_inicio='" + data_inicio + "', data_termino='"
				+ data_termino + "'," + " duracao='" + duracao + "', data_vencimento='" + data_vencimento
				+ "', observacao='" + observacao + "', status='" + status + "' WHERE id =" + id;

		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void list() {

		String sql = "SELECT id, cliente_id, pagamento_id, nome, equipe_envolvida, setor_projeto, data_inicio, data_termino, duracao, data_vencimento, observacao, status FROM Projeto";
		try {
			java.sql.Statement st = conexao.createStatement();
			ResultSet resultadoDaConexao = st.executeQuery(sql);
			System.out.println("----------------------------------------------------------------");
			while (resultadoDaConexao.next()) {

				int id = resultadoDaConexao.getInt(1);
				int cliente_id = resultadoDaConexao.getInt(2);
				int pagamento_id = resultadoDaConexao.getInt(3);
				String nome = resultadoDaConexao.getString(4);
				String equipe_envolvida = resultadoDaConexao.getString(5);
				String setor_projeto = resultadoDaConexao.getString(6);
				String data_inicio = resultadoDaConexao.getString(7).toString();
				String data_termino = resultadoDaConexao.getString(8).toString();
				int duracao = resultadoDaConexao.getInt(9);
				String data_vencimento = resultadoDaConexao.getString(10).toString();
				String observacao = resultadoDaConexao.getString(11);
				String status = resultadoDaConexao.getString(12);

				System.out.println("Id: " + id + "\nCliente_id: " + cliente_id + "\nPagamento_id: " + pagamento_id
						+ "\nNome: " + nome + "\nEquipe_envolvida: " + equipe_envolvida + "\nSetor_projeto: "
						+ setor_projeto + "\nData_inicio: " + data_inicio + "\nData_termino: " + data_termino
						+ "\nDuracao: " + duracao + "\nData_vencimento: " + data_vencimento + "\nObservacao: "
						+ observacao + "\nStatus: " + status);

				System.out.println("----------------------------------------------------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
