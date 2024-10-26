package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanoEstudo {

	private List<Edital> editais = new ArrayList<>();

	private List<Cargo> cargos = new ArrayList<>();

	private List<Disciplina> disciplinas = new ArrayList<>();

	private List<Revisao> revisoes = new ArrayList<>();

	private List<RegistroEstudo> constancia = new ArrayList<>();

	private String observacao;

}
