package br.com.financas.agendaFinanceira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.financas.agendaFinanceira.model.Receita;
import br.com.financas.agendaFinanceira.repositories.ReceitaRepository;

@Service
public class ReceitaServiceImpl implements ReceitaService{

	@Autowired
	private ReceitaRepository repository;
	
	@Override
	@Transactional
	public Receita salvarReceita(Receita receita) {
		Receita result = repository.save(receita);
		return result;
	}

	@Override
	public Receita buscarReceitaId(Long id) {
		Receita receita = repository.findById(id).get();
		
		return receita;
	}

	@Override
	public List<Receita> buscarTodasReceitas() {
		List<Receita> listReceita = repository.findAll();
		
		return listReceita;
	}

	@Override
	public void deletarReceita(Long id) {
		repository.deleteById(id);
	}

}
