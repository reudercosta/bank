package com.reuder.apiRestConductor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.reuder.apiRestConductor.model.Conta;
import com.reuder.apiRestConductor.model.Transacao;

@Repository
@Transactional(readOnly = false)
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
	List<Transacao> findByContaIn(Conta conta);
			
	
}
