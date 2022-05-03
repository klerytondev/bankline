package br.com.kleryton.bankline.api.models;

import java.time.LocalDateTime;

import br.com.kleryton.bankline.api.enums.MovimentacaoTipo;

public class MovimentacaoModel {
	
	private Long id;
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo movimentacaoTipo;
	
	public Long getId() {
		return id;
	}
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
