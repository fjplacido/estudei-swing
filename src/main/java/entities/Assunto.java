package entities;

import java.util.ArrayList;
import java.util.List;

public class Assunto {

	private Integer id;
	private String descricao;

	private Integer IdDisciplina;

	List<String> topicos = new ArrayList<>();

	public Assunto(Integer id, String descricao, Integer idDisciplina) {
		this.id = id;
		this.descricao = descricao;
		IdDisciplina = idDisciplina;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIdDisciplina() {
		return IdDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		IdDisciplina = idDisciplina;
	}

	public List<String> getTopicos() {
		return topicos;
	}

	public void setTopicos(List<String> topicos) {
		this.topicos = topicos;
	}

}
