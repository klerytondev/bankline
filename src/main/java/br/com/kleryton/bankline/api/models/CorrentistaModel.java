package br.com.kleryton.bankline.api.models;

public class CorrentistaModel {

	private Long id;
	private String cpf;
	private String nome;
	private ContaModel contaModel;

	public ContaModel getContaModel() {
		return contaModel;
	}

	public void setContaModel(ContaModel contaModel) {
		this.contaModel = contaModel;
	}

	public long getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
