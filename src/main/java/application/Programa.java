package application;

import javax.swing.SwingUtilities;

import gui.DisciplinaFrame;

public class Programa {

	public static void main(String[] args) {

		// Cria e exibe a janela
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				DisciplinaFrame janela = new DisciplinaFrame();
				janela.setVisible(true);
			}
		});

	}

}
