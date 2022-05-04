package br.com.kleryton.bankline.api.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kleryton.bankline.api.enums.MovimentacaoTipo;
import br.com.kleryton.bankline.api.models.CorrentistaModel;
import br.com.kleryton.bankline.api.models.MovimentacaoModel;
import br.com.kleryton.bankline.api.repositories.CorrentistaRespositorie;
import br.com.kleryton.bankline.api.repositories.MovimentacaoRespositorie;
import br.com.kleryton.bankline.api.requestDto.MovimentacaoRequestDto;

@Service
public class MovimentacaoService {

	@Autowired
	private MovimentacaoRespositorie movimentacaoRespositorie;

	@Autowired
	private CorrentistaRespositorie correntistaRespositorie;

	@Transactional
	// Create correntista
	public MovimentacaoModel create(MovimentacaoRequestDto movimentacaoRequestDto) {
		MovimentacaoModel movimentacaoModel = convertDtoToModel(movimentacaoRequestDto);
		Double valor = movimentacaoRequestDto.getMovimentacaoTipo() == MovimentacaoTipo.RECEITA
				? movimentacaoRequestDto.getValor()
				: movimentacaoRequestDto.getValor() * -1;
		movimentacaoModel.setDataHora(LocalDateTime.now());
		movimentacaoModel.setValor(valor);
		CorrentistaModel correntistaModel = correntistaRespositorie.findById(movimentacaoRequestDto.getIdConta())
				.orElse(null);
		if (correntistaModel != null) {
			correntistaModel.getContaModel().setSaldo(correntistaModel.getContaModel().getSaldo() + valor);
			correntistaRespositorie.save(correntistaModel);
		}
		movimentacaoRespositorie.save(movimentacaoModel);
		return movimentacaoModel;
	}

	public List<MovimentacaoModel> findAll() {
		List<MovimentacaoModel> movimentacaoModelsList = new ArrayList<>();
		for (MovimentacaoModel movimentacaoModel : movimentacaoRespositorie.findAll()) {
			movimentacaoModelsList.add(movimentacaoModel);
		}
		return movimentacaoModelsList;
	}

	// Coverte um request DTO em movimentação
	private MovimentacaoModel convertDtoToModel(MovimentacaoRequestDto movimentacaoRequestDto) {
		MovimentacaoModel movimentacaoModel = new MovimentacaoModel();
		movimentacaoModel.setMovimentacaoTipo(movimentacaoRequestDto.getMovimentacaoTipo());
		movimentacaoModel.setDescricao(movimentacaoRequestDto.getDescricao());
		movimentacaoModel.setIdConta(movimentacaoRequestDto.getIdConta());
		return movimentacaoModel;
	}

}
