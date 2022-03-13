package br.com.financas.agendaFinanceira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financas.agendaFinanceira.model.Instituicao;

@Repository
public interface InstituicaoRepository extends JpaRepository<Instituicao, Long>{

}
