package br.com.kleryton.bankline.api.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kleryton.bankline.api.models.ContaModel;
import br.com.kleryton.bankline.api.models.CorrentistaModel;
import br.com.kleryton.bankline.api.repositories.CorrentistaRespositorie;
import br.com.kleryton.bankline.api.requestDto.CorrentistaRequestDto;

@Service
public class CorrentistaService {

	@Autowired
	private CorrentistaRespositorie correntistaRespositorie;

	@Transactional
	// Create correntista
	public CorrentistaModel create(CorrentistaRequestDto correntistaRequestDto) {
		CorrentistaModel correntistaModel = convertDtoToModel(correntistaRequestDto);
		ContaModel contaModel = new ContaModel();
		contaModel.setSaldo(0.0);
		contaModel.setNumero(new Date().getTime());
		correntistaModel.setContaModel(contaModel);
		correntistaRespositorie.save(correntistaModel);
		return correntistaModel;
	}

	public List<CorrentistaModel> findAll() {
		List<CorrentistaModel> correntistaModelsList = new ArrayList<>();
		for (CorrentistaModel correntistaModel : correntistaRespositorie.findAll()) {
			correntistaModelsList.add(correntistaModel);
		}
		return correntistaModelsList;
	}

	// Coverte um request DTO em correntista
	private CorrentistaModel convertDtoToModel(CorrentistaRequestDto correntistaRequestDto) {
		CorrentistaModel correntistaModel = new CorrentistaModel();
		correntistaModel.setCpf(correntistaRequestDto.getCpf());
		correntistaModel.setNome(correntistaRequestDto.getNome());
		return correntistaModel;
	}
}
