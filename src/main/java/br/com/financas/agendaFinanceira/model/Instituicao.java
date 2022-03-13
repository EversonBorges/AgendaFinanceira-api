package br.com.financas.agendaFinanceira.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INSTITUICAO")
public class Instituicao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInstituicao;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "CODIGO")
	private Integer codigo;
	
	public Instituicao() {
	
	}

	public Instituicao(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public Long getIdInstituicao() {
		return idInstituicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}
