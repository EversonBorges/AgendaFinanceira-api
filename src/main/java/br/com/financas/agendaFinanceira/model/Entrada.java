package br.com.financas.agendaFinanceira.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entrada implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="DESCRICAO")
	private String descricao;
	@Column(name="VALOR")
	private Double valor;
	@Column(name="DT_ENTRADA")
	private Date dtEntrada;
	
	public Entrada() {
	}

	public Entrada(String descricao, Double valor, Date dtEntrada) {
		this.descricao = descricao;
		this.valor = valor;
		this.dtEntrada = dtEntrada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(Date dtEntrada) {
		this.dtEntrada = dtEntrada;
	}
	
}
