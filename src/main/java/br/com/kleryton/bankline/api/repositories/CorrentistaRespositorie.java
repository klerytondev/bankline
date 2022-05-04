package br.com.kleryton.bankline.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kleryton.bankline.api.models.CorrentistaModel;

public interface CorrentistaRespositorie extends JpaRepository<CorrentistaModel, Long>{

}
