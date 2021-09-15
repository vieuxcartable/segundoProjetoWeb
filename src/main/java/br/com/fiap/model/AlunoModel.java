package br.com.fiap.model;

public class AlunoModel {

	private String nome;
	private String rm;
	private String turma;
	
	public AlunoModel() {
		
	}

	public AlunoModel(String nome, String rm, String turma) {
		super();
		this.nome = nome;
		this.rm = rm;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}
