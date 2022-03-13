package br.com.financas.agendaFinanceira.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.financas.agendaFinanceira.model.Receita;
import br.com.financas.agendaFinanceira.services.ReceitaServiceImpl;

@Controller
@RequestMapping(value = "/receita")
public class ReceitaResource {
	
	@Autowired
	private ReceitaServiceImpl service;
	
	@PostMapping
	public ResponseEntity<Receita> save(@RequestBody Receita receita){
		Receita response = service.salvarReceita(receita);
		
		return ResponseEntity.ok().body(response);
	}

}
