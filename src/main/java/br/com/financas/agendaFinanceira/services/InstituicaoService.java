package br.com.financas.agendaFinanceira.services;

import java.util.List;

import br.com.financas.agendaFinanceira.model.Instituicao;

public interface InstituicaoService {

	Instituicao salvar(Instituicao instituicao);
	
	Instituicao buscarPorId(Long id);
	
	List<Instituicao> buscarTodas();
	
	Instituicao deletar(Long id);
	
	Instituicao atualizar(Instituicao instituicao, Long id);
}
