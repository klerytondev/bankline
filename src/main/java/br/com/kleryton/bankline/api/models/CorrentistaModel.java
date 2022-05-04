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
