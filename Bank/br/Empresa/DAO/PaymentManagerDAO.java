package br.Empresa.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.Empresa.Connection.ConnectionFactory;
import br.Empresa.Models.Payment;
import br.Empresa.Models.Projects;

public class PaymentManagerDAO {
	public static Connection conexao = new ConnectionFactory().getConnection();

	public void add(Projects p, Payment pg) {
		String sql = "INSERT INTO Pagamento(id, valor, data_pagamento, codigo_operacao, multa,"
				+ " observacao, forma_pagamento, data_vencimento, status)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			int id = pg.getId();
			double valor = pg.getValue();
			String data_pagamento = pg.getDueDate().toString();
			String codigo_operacao = pg.getOperationalCode();
			double multa = pg.getTrafficTicket();
			String observacao = pg.getStatus();
			String forma_pagamento = pg.getFormOfPayment();
			String data_vencimento = pg.getDueDate().toString();
			String status = pg.getStatus();

			stmt.setInt(1, id);
			stmt.setDouble(2, valor);
			stmt.setString(3, data_pagamento);
			stmt.setString(4, codigo_operacao);
			stmt.setDouble(5, multa);
			stmt.setString(6, observacao);
			stmt.setString(7, forma_pagamento);
			stmt.setString(8, data_vencimento);
			stmt.setString(9, status);

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void delete(Payment pg) {
		int id = pg.getId();
		String sql = "DELETE FROM Pagamento WHERE id = " + id;
		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void update(Projects p, Payment pg) {

		int id = pg.getId();
		double valor = pg.getValue();
		String data_pagamento = pg.getDueDate().toString();
		String codigo_operacao = pg.getOperationalCode();
		double multa = pg.getTrafficTicket();
		String observacao = pg.getStatus();
		String forma_pagamento = pg.getFormOfPayment();
		String data_vencimento = pg.getDueDate().toString();
		String status = pg.getStatus();

		String sql = "UPDATE Pagamento SET id='" + id + "', valor='" + valor + "', data_pagamento='" + data_pagamento
				+ "'," + " codigo_operacao='" + codigo_operacao + "', multa='" + multa + "', observacao='" + observacao
				+ "', forma_pagamento='" + forma_pagamento + "'," + " data_vencimento='" + data_vencimento
				+ "', status='" + status + "' WHERE id =" + id;

		try {
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void list() {

		String sql = "SELECT id, valor, data_pagamento, codigo_operacao, multa, observacao, forma_pagamento, data_vencimento, status FROM Pagamento";
		try {
			java.sql.Statement st = conexao.createStatement();
			ResultSet resultadoDaConexao = st.executeQuery(sql);
			System.out.println("----------------------------------------------------------------");
			while (resultadoDaConexao.next()) {

				int id = resultadoDaConexao.getInt(1);
				double valor = resultadoDaConexao.getDouble(2);
				String data_pagamento = resultadoDaConexao.getString(3).toString();
				String codigo_operacao = resultadoDaConexao.getString(4);
				double multa = resultadoDaConexao.getDouble(4);
				String observacao = resultadoDaConexao.getString(5);
				String forma_pagamento = resultadoDaConexao.getString(6);
				String data_vencimento = resultadoDaConexao.getString(7).toString();
				String status = resultadoDaConexao.getString(8);

				System.out.println("Id: " + id + "\nValor: " + valor + "\nData_pagamento: " + data_pagamento
						+ "\nCodigo_operacao: " + codigo_operacao + "\nMulta: " + multa + "Observacao: " + observacao
						+ "\nForma_pagamento: " + forma_pagamento + "\nData_vencimento: " + data_vencimento
						+ "\nSatus: " + status);

				System.out.println("----------------------------------------------------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
