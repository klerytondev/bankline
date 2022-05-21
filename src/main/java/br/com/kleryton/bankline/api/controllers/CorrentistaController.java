package br.com.kleryton.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kleryton.bankline.api.models.CorrentistaModel;
import br.com.kleryton.bankline.api.requestDto.CorrentistaRequestDto;
import br.com.kleryton.bankline.api.services.CorrentistaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/bankline")
//Otimiza o acesso a API
@CrossOrigin(origins = "*")
public class CorrentistaController {

	@Autowired
	private CorrentistaService correntistaService;

	@PostMapping("/correntistas/add")
	public ResponseEntity<Object> saveCorrentista(@RequestBody CorrentistaRequestDto correntistaRequestDto) {
		CorrentistaModel correntistaModel = correntistaService.create(correntistaRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(correntistaModel);
	}

	// Read All
	@GetMapping("/correntistas/all")
	public ResponseEntity<List<CorrentistaModel>> getAllCorrentistaModel() {
		return ResponseEntity.status(HttpStatus.OK).body(correntistaService.findAll());
	}

	// Delete One by id
	@ApiOperation(value = "Deleta um correntista de acordo com o id passado")
	@DeleteMapping("/correntistas/{id}")
	public ResponseEntity<Object> deleteAccountModel(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(correntistaService.delete(id));
	}

}
