package br.com.kleryton.bankline.api.requestDto;

import br.com.kleryton.bankline.api.models.ContaModel;
import br.com.kleryton.bankline.api.models.CorrentistaModel;

public class CorrentistaRequestDto {

	private String cpf;

	private String nome;

	private ContaModel contaModel;

	public CorrentistaRequestDto(CorrentistaModel correntistaModel) {
		this.cpf = correntistaModel.getCpf();
		this.nome = correntistaModel.getNome();
		this.contaModel = correntistaModel.getContaModel();
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

	public ContaModel getContaModel() {
		return contaModel;
	}

	public void setContaModel(ContaModel contaModel) {
		this.contaModel = contaModel;
	}

}
