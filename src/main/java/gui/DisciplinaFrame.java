package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import infrastructure.Conectar;

public class DisciplinaFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public DisciplinaFrame() {

		Conectar.conectar();

		extracted();
	}

	private void extracted() {
		// Configurações da janela
		setTitle("Exemplo de Janela com JTable");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Janela centralizada na tela

		// Painel principal com layout BorderLayout
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());
		JLabel lblDisciplina = new JLabel("Disciplina");
		JTextField txtDisciplina = new JTextField(30);
		JButton addDisciplina = new JButton("Adicionar");
		northPanel.add(lblDisciplina);
		northPanel.add(txtDisciplina);
		northPanel.add(addDisciplina);

		panel.add(northPanel, BorderLayout.NORTH);

		// Dados iniciais da JTable
		String[] columnNames = { "ID", "Nome", "Idade" };
		Object[][] data = { { 1, "João", 25 }, { 2, "Maria", 30 }, { 3, "Pedro", 22 } };

		// Criando a JTable com DefaultTableModel
		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table); // Adiciona a tabela ao JScrollPane

		// Adiciona o JScrollPane ao painel central
		panel.add(scrollPane, BorderLayout.CENTER);

		// Painel para os botões
		JPanel buttonPanel = new JPanel();
		JButton addButton = new JButton("Adicionar");
		JButton removeButton = new JButton("Remover");

		// Ação do botão Adicionar
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Adiciona uma nova linha na tabela
				tableModel.addRow(new Object[] { tableModel.getRowCount() + 1, "Novo Nome", 18 });
			}
		});

		// Ação do botão Remover
		removeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Remove a linha selecionada na tabela
				int selectedRow = table.getSelectedRow();
				if (selectedRow != -1) {
					tableModel.removeRow(selectedRow);
				} else {
					JOptionPane.showMessageDialog(DisciplinaFrame.this, "Selecione uma linha para remover.");
				}
			}
		});

		// Adiciona os botões ao painel de botões
		buttonPanel.add(addButton);
		buttonPanel.add(removeButton);

		// Adiciona o painel de botões ao painel principal
		panel.add(buttonPanel, BorderLayout.SOUTH);

		// Ação do botão Adicionar
		addDisciplina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Adiciona uma nova linha na tabela
				tableModel.addRow(new Object[] { tableModel.getRowCount() + 1, txtDisciplina, 18 });
			}
		});

		// Adiciona o painel principal à janela
		add(panel);
	}

}
