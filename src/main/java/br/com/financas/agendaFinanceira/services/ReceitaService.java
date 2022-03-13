package br.com.financas.agendaFinanceira.services;

import java.util.List;
import java.util.Optional;

import br.com.financas.agendaFinanceira.model.Receita;

public interface ReceitaService {

	Receita salvarReceita(Receita receita);
	
	Receita buscarReceitaId(Long id);
	
	List<Receita> buscarTodasReceitas();
	
	void deletarReceita(Long id);
}
