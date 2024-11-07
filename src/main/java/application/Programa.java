package application;

import java.util.Arrays;

import entities.Assunto;
import entities.Disciplina;

public class Programa {

	public static void main(String[] args) {

		Assunto assunto1 = new Assunto(1, "SCRUM", 1);
		Assunto assunto2 = new Assunto(2, "KANBAN", 1);

		Disciplina d1 = new Disciplina(1, "ENGS", "Engenharia de Software");
		d1.setAssuntos(Arrays.asList(assunto1, assunto2));

	}

}
