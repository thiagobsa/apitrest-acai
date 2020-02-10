package com.produtos.acai.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	private BigDecimal quantidade;
	
	private Integer tamanho;
	
	private String descTamanho;
	
	private BigDecimal valor;
	
	public Integer getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getDescTamanho() {
		return descTamanho;
	}
	
	public void setDescTamanho(String descTamanho) {
		this.descTamanho = descTamanho;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public String validaId(long id) {
			this.nome = "pedido realizado";
		return nome;
	}
	
	public String tamanhoPedido(Integer tamanho) {
		
		
			String tam = String.valueOf(this.tamanho);
			switch(tam) {
				case "1": 
					descTamanho = "Pequeno(300ml)";
					
				case "2": 
					descTamanho = "Médio(500ml)";
					
				case "3": 
					descTamanho = "Grande(700ml)";
					
				default:
					descTamanho = "Pequeno(300ml)";
			}
		return descTamanho;	
	}
}
