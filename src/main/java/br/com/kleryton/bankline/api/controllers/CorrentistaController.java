package br.com.kleryton.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kleryton.bankline.api.models.CorrentistaModel;
import br.com.kleryton.bankline.api.repositories.CorrentistaRespositorie;

@RestController
@RequestMapping(value = "/v1/bankline")
//Otimiza o acesso a API
@CrossOrigin(origins = "*")
public class CorrentistaController {

	@Autowired
	private CorrentistaRespositorie correntistaRespositorie;

	// Read All
	@GetMapping("/correntistas/all")
	public List<CorrentistaModel> getAllCorrentistas() {
		return correntistaRespositorie.findAll();
	}

}
