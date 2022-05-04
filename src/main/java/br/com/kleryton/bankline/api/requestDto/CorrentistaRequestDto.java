package br.com.kleryton.bankline.api.requestDto;

import br.com.kleryton.bankline.api.models.CorrentistaModel;

public class CorrentistaRequestDto {

	private String cpf;

	private String nome;

	public CorrentistaRequestDto() {
	}

	public CorrentistaRequestDto(CorrentistaModel correntistaModel) {
		this.cpf = correntistaModel.getCpf();
		this.nome = correntistaModel.getNome();
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
