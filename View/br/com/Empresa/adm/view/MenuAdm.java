/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Empresa.adm.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class MenuAdm extends javax.swing.JFrame {

	public MenuAdm() {

		initComponents();

		setIcon();
		customizeMenuBar(jMenuBar1);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		Root = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel19 = new javax.swing.JLabel();
		jProjetoValor = new javax.swing.JTextField();
		jProjetoFormPagam = new javax.swing.JTextField();
		jProjetoCliente = new javax.swing.JTextField();
		jProjetoDataVenc = new javax.swing.JTextField();
		jProjetoMulta = new javax.swing.JTextField();
		jProjetoStatus = new javax.swing.JTextField();
		jProjetoNome = new javax.swing.JTextField();
		jProjetoEquip = new javax.swing.JTextField();
		jProjetoCaract = new javax.swing.JTextField();
		jProjetoDataIni = new javax.swing.JTextField();
		jProjetoDataPrev = new javax.swing.JTextField();
		jProjetoDuracao = new javax.swing.JTextField();
		jProjetoDataPagam = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jProjetoCodgOperBank = new javax.swing.JTextField();
		jLabel36 = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jMembroCargo = new javax.swing.JTextField();
		jMembroRg = new javax.swing.JTextField();
		jMembroPeriodo = new javax.swing.JTextField();
		jMembroDataEntr = new javax.swing.JTextField();
		jMembroEmail = new javax.swing.JTextField();
		jMembroCep = new javax.swing.JTextField();
		jMembroEndereco = new javax.swing.JTextField();
		jMembroCurso = new javax.swing.JTextField();
		jMembroEndNum = new javax.swing.JTextField();
		jMembroRefPess = new javax.swing.JTextField();
		jMembroTelefone = new javax.swing.JTextField();
		jMembroCpf = new javax.swing.JTextField();
		jMembroCidade = new javax.swing.JTextField();
		jMembroBairro = new javax.swing.JTextField();
		jMembroNome = new javax.swing.JTextField();
		jMembroUf = new javax.swing.JComboBox<>();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jButtonMembroCadastr = new javax.swing.JButton();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextAreaMembroObs = new javax.swing.JTextArea();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();
		jMenu6 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Adm eagle");
		setFont(new java.awt.Font("Microsoft PhagsPa", 0, 48)); // NOI18N
		setForeground(new java.awt.Color(204, 204, 204));
		setPreferredSize(new java.awt.Dimension(32767, 650));

		Root.setBackground(new java.awt.Color(255, 153, 153));
		Root.setLayout(new java.awt.CardLayout());

		jPanel1.setBackground(new java.awt.Color(0, 0, 255));
		jPanel1.setLayout(null);

		jLabel1.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/br/com/eaglejr/adm/view/imagens/BkgMenu.jpg"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 820, 570);

		Root.add(jPanel1, "InÃ­cio");

		jPanel2.setBackground(new java.awt.Color(204, 204, 204));
		jPanel2.setPreferredSize(new java.awt.Dimension(803, 574));

		jLabel19.setText(
				"_________________________________________________________________________________________________________________");

		jProjetoNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jProjetoNomeActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane2.setViewportView(jTextArea1);

		jLabel22.setText("NOME DO PROJETO");

		jLabel23.setText("VALOR DO PROJETO");

		jLabel24.setText("FORMA DE PAGAMENTO");

		jLabel25.setText("CLIENTE ENVOLVIDO");

		jLabel26.setText("ESQUIPES ENVOLVIDA");

		jLabel27.setText("CARACTERÃ�STICA DO PROJETO");

		jLabel28.setText("DATA DE INÃ�CIO");

		jLabel29.setText("DATA PREVISÃƒO PARA TÃ‰RMINO");

		jLabel30.setText("DATA DE VENCIMENTO");

		jLabel31.setText("DATA DE PAGAMENTO");

		jLabel32.setText("DURAÃ‡ÃƒO DO PROJETO");

		jLabel33.setText("STATUS");

		jLabel34.setText("MULTA");

		jLabel35.setText("OBSERVAÃ‡Ã•ES");

		jLabel36.setText("CÃ“DIGO DE OPERAÃ‡ÃƒO BANCÃ�RIA");

		jLabel37.setText(
				"_________________________________________________________________________________________________________________");

		jButton1.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/eaglejr/adm/view/imagens/BotaoCadastroTxt.png"))); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(24, 24, 24)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel29)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jProjetoDataPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel27)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jProjetoCaract, javax.swing.GroupLayout.PREFERRED_SIZE, 181,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(73, 73, 73).addComponent(jLabel28)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jProjetoDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel32).addComponent(jLabel34))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(
																		jProjetoDuracao,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 82,
																		Short.MAX_VALUE)
																.addComponent(jProjetoMulta))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		jPanel2Layout.createSequentialGroup()
																				.addComponent(jLabel31)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jProjetoDataPagam,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						143,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		jPanel2Layout.createSequentialGroup()
																				.addComponent(jLabel30)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(jProjetoDataVenc,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						143,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout
												.createSequentialGroup().addComponent(jLabel33)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jProjetoStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
														127, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(31, 31, 31).addComponent(jLabel36)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jProjetoCodgOperBank,
														javax.swing.GroupLayout.PREFERRED_SIZE, 236,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(39, 39, 39)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel35)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 634,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(
						jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
								jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel24)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jProjetoFormPagam, javax.swing.GroupLayout.PREFERRED_SIZE,
														125, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel25)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jProjetoCliente, javax.swing.GroupLayout.PREFERRED_SIZE,
														166, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(jLabel26)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jProjetoEquip))
										.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel22)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jProjetoNome,
																javax.swing.GroupLayout.PREFERRED_SIZE, 267,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel2Layout.createSequentialGroup().addGap(406, 406, 406)
														.addComponent(jLabel23)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jProjetoValor, javax.swing.GroupLayout.PREFERRED_SIZE,
														103, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														jPanel2Layout.createSequentialGroup().addComponent(jLabel19)
																.addGap(0, 0, Short.MAX_VALUE))
												.addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGap(144, 144, 144)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jProjetoValor, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jProjetoNome, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel22).addComponent(jLabel23))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel24)
								.addComponent(jProjetoFormPagam, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel25)
								.addComponent(jProjetoCliente, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel26).addComponent(jProjetoEquip,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(4, 4, 4).addComponent(jLabel19).addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel27)
								.addComponent(jProjetoCaract, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel28)
								.addComponent(jProjetoDataIni, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(23, 23, 23)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel29)
								.addComponent(jProjetoDataPrev, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(12, 12, 12)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jProjetoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jProjetoDataPagam, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel32).addComponent(jLabel31))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel34)
								.addComponent(jProjetoMulta, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel30).addComponent(jProjetoDataVenc,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel33)
								.addComponent(jProjetoStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel36).addComponent(jProjetoCodgOperBank,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11).addComponent(jLabel37)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel35)
						.addGap(1, 1, 1)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		Root.add(jPanel2, "Projetos");

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));
		jPanel3.setPreferredSize(new java.awt.Dimension(793, 507));

		jMembroCargo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMembroCargoActionPerformed(evt);
			}
		});

		jMembroCep.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMembroCepActionPerformed(evt);
			}
		});

		jMembroNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMembroNomeActionPerformed(evt);
			}
		});

		jMembroUf.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
		jMembroUf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMembroUfActionPerformed(evt);
			}
		});

		jLabel2.setText("CURSO");

		jLabel3.setText("PERÃ�ODO ATUAL");

		jLabel4.setText("CARGO");

		jLabel5.setText("NOME");

		jLabel6.setText("CPF");

		jLabel7.setText("RG");

		jLabel8.setText("TELEFONE");

		jLabel9.setText("CEP");

		jLabel10.setText("CIDADE");

		jLabel11.setText("UF");

		jLabel12.setText("BAIRRO");

		jLabel13.setText("NÂ°");

		jLabel14.setText("ENDEREÃ‡O");

		jLabel15.setText("REF.PESSOAIS");

		jLabel16.setText("DATA DE ENTRADA");

		jLabel17.setText("OBSERVAÃ‡Ã•ES");

		jLabel18.setText("EMAIL");

		jButtonMembroCadastr.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/eaglejr/adm/view/imagens/BotaoCadastroTxt.png"))); // NOI18N
		jButtonMembroCadastr.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMembroCadastrActionPerformed(evt);
			}
		});

		jLabel20.setText(
				"____________________________________________________________________________________________________________________________");

		jLabel21.setText(
				"____________________________________________________________________________________________________________________________");

		jTextAreaMembroObs.setColumns(20);
		jTextAreaMembroObs.setRows(5);
		jScrollPane1.setViewportView(jTextAreaMembroObs);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout
												.createSequentialGroup().addGap(37, 37, 37).addComponent(jLabel5)
												.addGap(18, 18, 18).addComponent(jMembroNome,
														javax.swing.GroupLayout.PREFERRED_SIZE, 659,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel18).addGap(18, 18, 18)
																.addComponent(jMembroEmail,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 659,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel4).addGap(18, 18, 18)
																.addComponent(jMembroCargo,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 164,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(27, 27, 27).addComponent(jLabel2)
																.addGap(18, 18, 18)
																.addComponent(jMembroCurso,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 128,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18, 18).addComponent(jLabel3)
																.addGap(18, 18, 18).addComponent(jMembroPeriodo,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 157,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel3Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(
												jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 758,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel3Layout.createSequentialGroup().addGap(42, 42, 42)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel16).addGap(18, 18, 18)
																.addComponent(jMembroDataEntr,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 118,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jLabel15)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jMembroRefPess,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 375,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel3Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addGroup(jPanel3Layout.createSequentialGroup()
																		.addComponent(jLabel9)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(jMembroCep,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				147,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(jPanel3Layout.createSequentialGroup()
																		.addGroup(jPanel3Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(jPanel3Layout
																						.createSequentialGroup()
																						.addComponent(jLabel6)
																						.addGroup(jPanel3Layout
																								.createParallelGroup(
																										javax.swing.GroupLayout.Alignment.LEADING)
																								.addGroup(jPanel3Layout
																										.createSequentialGroup()
																										.addGap(14, 14,
																												14)
																										.addComponent(
																												jMembroCpf,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												217,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(18, 18,
																												18)
																										.addComponent(
																												jLabel7)
																										.addGap(18, 18,
																												18)
																										.addComponent(
																												jMembroRg,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												147,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(18, 18,
																												18)
																										.addComponent(
																												jLabel8))
																								.addGroup(
																										javax.swing.GroupLayout.Alignment.TRAILING,
																										jPanel3Layout
																												.createSequentialGroup()
																												.addGap(27,
																														27,
																														27)
																												.addComponent(
																														jMembroCidade,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														327,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addGap(18,
																														18,
																														18)
																												.addGroup(
																														jPanel3Layout
																																.createParallelGroup(
																																		javax.swing.GroupLayout.Alignment.LEADING)
																																.addGroup(
																																		jPanel3Layout
																																				.createSequentialGroup()
																																				.addComponent(
																																						jLabel11)
																																				.addGap(18,
																																						18,
																																						18)
																																				.addComponent(
																																						jMembroUf,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						javax.swing.GroupLayout.DEFAULT_SIZE,
																																						javax.swing.GroupLayout.PREFERRED_SIZE))
																																.addGroup(
																																		jPanel3Layout
																																				.createSequentialGroup()
																																				.addGap(10,
																																						10,
																																						10)
																																				.addComponent(
																																						jMembroBairro,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						114,
																																						javax.swing.GroupLayout.PREFERRED_SIZE))))))
																				.addComponent(jLabel10)
																				.addGroup(jPanel3Layout
																						.createSequentialGroup()
																						.addComponent(jLabel14)
																						.addGap(18, 18, 18)
																						.addComponent(jMembroEndereco,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								260,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGap(18, 18, 18)
																						.addComponent(jLabel12)))
																		.addGroup(jPanel3Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						jPanel3Layout
																								.createSequentialGroup()
																								.addComponent(jLabel13)
																								.addGap(18, 18, 18)
																								.addComponent(
																										jMembroEndNum,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										137,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(jPanel3Layout
																						.createSequentialGroup()
																						.addGap(20, 20, 20)
																						.addComponent(jMembroTelefone,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								167,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))))))
								.addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 758,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(44, 44, 44)
								.addGroup(jPanel3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(jButtonMembroCadastr, javax.swing.GroupLayout.PREFERRED_SIZE, 131,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel17)
												.addGap(625, 625, 625))
										.addComponent(jScrollPane1))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(26, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jMembroNome, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jMembroEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel18))
						.addGap(21, 21, 21)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jMembroCurso, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jMembroPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jMembroCargo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4).addComponent(jLabel3).addComponent(jLabel2))
						.addGap(11, 11, 11).addComponent(jLabel21).addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jMembroCpf, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jMembroRg, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jMembroTelefone, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8).addComponent(jLabel7).addComponent(jLabel6))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10)
								.addComponent(jMembroCidade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jMembroCep, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9)
								.addComponent(jMembroUf, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel11))
						.addGap(11, 11, 11)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14)
								.addComponent(jMembroEndereco, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12)
								.addComponent(jMembroBairro, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel13)
								.addComponent(jMembroEndNum, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16)
								.addComponent(jMembroDataEntr, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel15).addComponent(jMembroRefPess,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(jLabel20)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel17).addGap(4, 4, 4)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButtonMembroCadastr, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37)));

		Root.add(jPanel3, "Membros");

		jMenuBar1.setBackground(new java.awt.Color(51, 0, 153));
		jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
		jMenuBar1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N

		jMenu1.setBackground(java.awt.SystemColor.textHighlight);
		jMenu1.setText("Menu");
		jMenu1.setPreferredSize(new java.awt.Dimension(70, 19));

		jMenuItem3.setText("InÃ­cio");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuItem2.setText("Membros");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem1.setText("Projetos");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu5.setText("Contratos");
		jMenu5.setPreferredSize(new java.awt.Dimension(70, 19));
		jMenuBar1.add(jMenu5);

		jMenu2.setText("RelatÃ³rio");
		jMenu2.setPreferredSize(new java.awt.Dimension(70, 19));
		jMenuBar1.add(jMenu2);

		jMenu4.setText("VisÃ£o geral");
		jMenu4.setPreferredSize(new java.awt.Dimension(70, 19));
		jMenuBar1.add(jMenu4);

		jMenu6.setText("Ã�rea administrativa");
		jMenuBar1.add(jMenu6);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Root,
				javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE));

		setSize(new java.awt.Dimension(819, 613));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void customizeMenuBar(JMenuBar menuBar) {

		menuBar.setUI(new BasicMenuBarUI() {

			public void paint(Graphics g, JComponent c) {
				g.setColor(Color.BLUE);
				g.fillRect(0, 0, c.getWidth(), c.getHeight());
			}

		});

		MenuElement[] menus = menuBar.getSubElements();

		for (MenuElement menuElement : menus) {

			JMenu menu = (JMenu) menuElement.getComponent();
			changeComponentColors(menu);
			menu.setOpaque(true);

			MenuElement[] menuElements = menu.getSubElements();

			for (MenuElement popupMenuElement : menuElements) {

				JPopupMenu popupMenu = (JPopupMenu) popupMenuElement.getComponent();
				popupMenu.setBorder(null);

				MenuElement[] menuItens = popupMenuElement.getSubElements();

				for (MenuElement menuItemElement : menuItens) {

					JMenuItem menuItem = (JMenuItem) menuItemElement.getComponent();
					changeComponentColors(menuItem);
					menuItem.setOpaque(true);

				}
			}
		}
	}

	private void changeComponentColors(Component comp) {
		comp.setBackground(Color.BLUE);
		comp.setForeground(Color.white);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
		CardLayout card = (CardLayout) Root.getLayout();
		card.show(Root, "Membros");
	}// GEN-LAST:event_jMenuItem2ActionPerformed

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		CardLayout card = (CardLayout) Root.getLayout();
		card.show(Root, "Projetos");
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void jButtonMembroCadastrActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMembroCadastrActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jButtonMembroCadastrActionPerformed

	private void jMembroNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMembroNomeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jMembroNomeActionPerformed

	private void jMembroCargoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMembroCargoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jMembroCargoActionPerformed

	private void jMembroUfActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMembroUfActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jMembroUfActionPerformed

	private void jProjetoNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jProjetoNomeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jProjetoNomeActionPerformed

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem3ActionPerformed
		CardLayout card = (CardLayout) Root.getLayout();
		card.show(Root, "InÃ­cio");
	}// GEN-LAST:event_jMenuItem3ActionPerformed

	private void jMembroCepActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMembroCepActionPerformed
		BuscaCep busca = new BuscaCep();
		try {
			jMembroUf.getModel().setSelectedItem(busca.getUF(jMembroCep.getText()));
			jMembroEndereco.setText(busca.getEndereco(jMembroCep.getText()));
			jMembroBairro.setText(busca.getBairro(jMembroCep.getText()));
			jMembroCidade.setText(busca.getCidade(jMembroCep.getText()));
		} catch (IOException ex) {
			Logger.getLogger(MenuAdm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}// GEN-LAST:event_jMembroCepActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MenuAdm().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JPanel Root;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButtonMembroCadastr;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jMembroBairro;
	private javax.swing.JTextField jMembroCargo;
	private javax.swing.JTextField jMembroCep;
	private javax.swing.JTextField jMembroCidade;
	private javax.swing.JTextField jMembroCpf;
	private javax.swing.JTextField jMembroCurso;
	private javax.swing.JTextField jMembroDataEntr;
	private javax.swing.JTextField jMembroEmail;
	private javax.swing.JTextField jMembroEndNum;
	private javax.swing.JTextField jMembroEndereco;
	private javax.swing.JTextField jMembroNome;
	private javax.swing.JTextField jMembroPeriodo;
	private javax.swing.JTextField jMembroRefPess;
	private javax.swing.JTextField jMembroRg;
	private javax.swing.JTextField jMembroTelefone;
	private javax.swing.JComboBox<String> jMembroUf;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTextField jProjetoCaract;
	private javax.swing.JTextField jProjetoCliente;
	private javax.swing.JTextField jProjetoCodgOperBank;
	private javax.swing.JTextField jProjetoDataIni;
	private javax.swing.JTextField jProjetoDataPagam;
	private javax.swing.JTextField jProjetoDataPrev;
	private javax.swing.JTextField jProjetoDataVenc;
	private javax.swing.JTextField jProjetoDuracao;
	private javax.swing.JTextField jProjetoEquip;
	private javax.swing.JTextField jProjetoFormPagam;
	private javax.swing.JTextField jProjetoMulta;
	private javax.swing.JTextField jProjetoNome;
	private javax.swing.JTextField jProjetoStatus;
	private javax.swing.JTextField jProjetoValor;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextAreaMembroObs;
	// End of variables declaration//GEN-END:variables

	private void setIcon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconeEagle.png")));
	}
}
