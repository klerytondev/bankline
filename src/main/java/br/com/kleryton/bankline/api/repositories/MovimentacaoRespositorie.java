package br.com.kleryton.bankline.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kleryton.bankline.api.models.MovimentacaoModel;

public interface MovimentacaoRespositorie extends JpaRepository<MovimentacaoModel, Long> {

}
