package br.com.kleryton.bankline.api.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CORRENTISTA")
public class CorrentistaModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String cpf;

	@Column(nullable = false, length = 100)
	private String nome;

	private ContaModel contaModel;

	public CorrentistaModel() {
	}

	public CorrentistaModel( String cpf, String nome, ContaModel contaModel) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.contaModel = contaModel;
	}

	public Long getId() {
		return id;
	}

	public ContaModel getContaModel() {
		return contaModel;
	}

	public void setContaModel(ContaModel contaModel) {
		this.contaModel = contaModel;
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
