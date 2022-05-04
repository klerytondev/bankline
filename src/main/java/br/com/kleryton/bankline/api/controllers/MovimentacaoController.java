package br.com.kleryton.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kleryton.bankline.api.models.MovimentacaoModel;
import br.com.kleryton.bankline.api.requestDto.MovimentacaoRequestDto;
import br.com.kleryton.bankline.api.services.MovimentacaoService;

@RestController
@RequestMapping(value = "/v1/bankline")
//Otimiza o acesso a API
@CrossOrigin(origins = "*")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@PostMapping("/movimentacao/add")
	public ResponseEntity<Object> saveCorrentista(@RequestBody MovimentacaoRequestDto movimentacaoRequestDto) {
		MovimentacaoModel movimentacaoModel = movimentacaoService.create(movimentacaoRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(movimentacaoModel);
	}
	
	// Read All
		@GetMapping("/movimentacao/all")
		public ResponseEntity<List<MovimentacaoModel>> getAllCorrentistaModel() {
			return ResponseEntity.status(HttpStatus.OK).body(movimentacaoService.findAll());
		}

}
