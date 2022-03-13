package br.com.financas.agendaFinanceira.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.financas.agendaFinanceira.model.Instituicao;
import br.com.financas.agendaFinanceira.services.InstituicaoServiceImpl;

@Controller
@RequestMapping(value = "/instituicao")
public class InstituicaoResource {
	
	@Autowired
	private InstituicaoServiceImpl service;
	
	@PostMapping
	public ResponseEntity<Instituicao> save(@RequestBody Instituicao instituicao){
		Instituicao response = service.salvar(instituicao);
		
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Instituicao>> buscarTodas(){
		List<Instituicao> response = service.buscarTodas();
		
		return ResponseEntity.ok(response);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Instituicao> buscarPorId(@PathVariable Long id){
		
			Instituicao response = service.buscarPorId(id);
			return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Instituicao> deletar(@PathVariable Long id) {
		
		Instituicao instituicao = service.deletar(id);
		return ResponseEntity.ok(instituicao);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Instituicao> atualizar(
							@RequestBody Instituicao instituicao,
							@PathVariable Long id){
		
		Instituicao response = service.atualizar(instituicao, id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
