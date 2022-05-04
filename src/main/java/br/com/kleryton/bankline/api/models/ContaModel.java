package br.com.kleryton.bankline.api.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContaModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "conta_numero")
	private Long numero;
	
	@Column(name = "conta_saldo")
	private Double saldo;

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
