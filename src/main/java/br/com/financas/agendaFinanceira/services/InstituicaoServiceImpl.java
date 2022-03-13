package br.com.financas.agendaFinanceira.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.financas.agendaFinanceira.exceptionhandler.NotFoundException;
import br.com.financas.agendaFinanceira.model.Instituicao;
import br.com.financas.agendaFinanceira.repositories.InstituicaoRepository;

@Service
public class InstituicaoServiceImpl implements InstituicaoService{

	@Autowired
	private InstituicaoRepository repository;
	
	@Override
	@Transactional
	public Instituicao salvar(Instituicao instituicao) {
		Instituicao result = repository.save(instituicao);
		return result;
	}

	@Override
	public Instituicao buscarPorId(Long id) {
		Optional<Instituicao> instituicao = repository.findById(id);
		
		return instituicao.orElseThrow(() -> new NotFoundException());
	}

	@Override
	public List<Instituicao> buscarTodas() {
		List<Instituicao> listInstituicao = repository.findAll();
		
		return listInstituicao;
	}

	@Override
	public Instituicao deletar(Long id) {
		
		Instituicao response = buscarPorId(id);
		repository.deleteById(id);
		return response;
	}

	@Override
	public Instituicao atualizar(Instituicao instituicao, Long id) {
  
		buscarPorId(id);
		Instituicao instituicaoUpdate = repository.getById(id);
		BeanUtils.copyProperties(instituicao, instituicaoUpdate,"id");
		return repository.save(instituicaoUpdate);
	}

}
