package br.com.financas.agendaFinanceira.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.financas.agendaFinanceira.model.enums.TipoReceita;

@Entity
@Table(name = "RECEITA")
public class Receita extends Entrada {

	private static final long serialVersionUID = 1L;
	
	@Column(name="INSTITUICAO")
	private Instituicao instituicao;
	@Column(name="TIPO_RECEITA")
	private TipoReceita tipo;
	
	public Receita(Instituicao instituicao, TipoReceita tipo) {
		super();
		this.instituicao = instituicao;
		this.tipo = tipo;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public TipoReceita getTipo() {
		return tipo;
	}

	public void setTipo(TipoReceita tipo) {
		this.tipo = tipo;
	}
	
}
