package br.com.kleryton.bankline.api.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.kleryton.bankline.api.enums.MovimentacaoTipo;

@Entity
@Table(name = "TB_MOVIMENTACAO")
public class MovimentacaoModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private LocalDateTime dataHora;

	@Column(nullable = false, length = 100)
	private String descricao;
	@Column(nullable = false)
	private Double valor;

	@Enumerated(EnumType.STRING)
	private MovimentacaoTipo movimentacaoTipo;

	@Column(nullable = false, name = "conta_saldo")
	private Long idConta;

	public MovimentacaoModel() {
	}
	public MovimentacaoModel(LocalDateTime dataHora, String descricao, Double valor, MovimentacaoTipo movimentacaoTipo,
			Long idConta) {
		super();
		this.dataHora = dataHora;
		this.descricao = descricao;
		this.valor = valor;
		this.movimentacaoTipo = movimentacaoTipo;
		this.idConta = idConta;
	}

	public Long getId() {
		return id;
	}

	public MovimentacaoTipo getMovimentacaoTipo() {
		return movimentacaoTipo;
	}

	public void setMovimentacaoTipo(MovimentacaoTipo movimentacaoTipo) {
		this.movimentacaoTipo = movimentacaoTipo;
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

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

}
