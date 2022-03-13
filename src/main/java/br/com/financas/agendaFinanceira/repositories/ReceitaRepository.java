package br.com.financas.agendaFinanceira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financas.agendaFinanceira.model.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long>{

}
