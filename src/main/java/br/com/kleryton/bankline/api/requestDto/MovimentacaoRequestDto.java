package br.com.kleryton.bankline.api.requestDto;

import br.com.kleryton.bankline.api.enums.MovimentacaoTipo;
import br.com.kleryton.bankline.api.models.MovimentacaoModel;

public class MovimentacaoRequestDto {

	private String descricao;

	private Double valor;

	private MovimentacaoTipo movimentacaoTipo;

	private Long idConta;
	
	public MovimentacaoRequestDto() {
	}

	public MovimentacaoRequestDto(MovimentacaoModel movimentacaoModel) {
		this.descricao = movimentacaoModel.getDescricao();
		this.valor = movimentacaoModel.getValor();
		this.movimentacaoTipo = movimentacaoModel.getMovimentacaoTipo();
		this.idConta = movimentacaoModel.getIdConta();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimentacaoTipo getMovimentacaoTipo() {
		return movimentacaoTipo;
	}

	public void setMovimentacaoTipo(MovimentacaoTipo movimentacaoTipo) {
		this.movimentacaoTipo = movimentacaoTipo;
	}

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

}
