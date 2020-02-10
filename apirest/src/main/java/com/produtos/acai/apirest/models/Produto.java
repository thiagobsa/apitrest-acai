package com.produtos.acai.apirest.models;

import java.io.Serializable;

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
	
	private String tamanho;
	
	private String sabor;

	private String personalizacao;
	
	private String tempoPreparo;
	
	private Double valorTamanho;
	
	private Double valorPersonalizacao;
	
	private Double valorTotal;
	
		
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getPersonalizacao() {
		return personalizacao;
	}

	public void setPersonalizacao(String personalizacao) {
		this.personalizacao = personalizacao;
	}

	public String getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(String tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public Double getValorTamanho() {
		return valorTamanho;
	}

	public void setValorTamanho(Double valorTamanho) {
		this.valorTamanho = valorTamanho;
	}

	public Double getValorPersonalizacao() {
		return valorPersonalizacao;
	}

	public void setValorPersonalizacao(Double valorPersonalizacao) {
		this.valorPersonalizacao = valorPersonalizacao;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	
	public Double valorTamanho(String tamanho) {
		
		if(tamanho.equalsIgnoreCase("pequeno (300ml)")) {
			valorTamanho = 10.00;
		} else if (tamanho.equalsIgnoreCase("médio (500ml)")) {
			valorTamanho = 13.00;
		} else if (tamanho.equalsIgnoreCase("grande (700ml)")) {
			valorTamanho = 15.00;
		}		
		
		return valorTamanho;
	}
	
	public Double valorpersonalizacao(String personalizacao) {
		
		if(personalizacao.equalsIgnoreCase("leite ninho") || personalizacao.equalsIgnoreCase("paçoca")) {
			valorPersonalizacao = 3.00;
		} else {
			valorPersonalizacao = 0.00;
		}
		
		return valorPersonalizacao;
	}
	
	public Double calcularValor(Double valorTamanho ,Double valorPersonalizacao) {
		
		valorTotal = valorTamanho + valorPersonalizacao;
		return valorTotal;
	}
	
	public String calcularTempo(String tamanho, String sabor, String personalizacao) {
		
		int tempo = 0;
		if(tamanho.equalsIgnoreCase("pequeno (300ml)")) {
			tempo = 5;
		} else if (tamanho.equalsIgnoreCase("médio (500ml)")) {
			tempo = 7;
		} else if (tamanho.equalsIgnoreCase("grande (700ml)")) {
			tempo = 10;
		}
		
		if(sabor.equalsIgnoreCase("kiwi")) {
			tempo = tempo + 5;
		}
		
		if(personalizacao.equalsIgnoreCase("paçoca")) {
			tempo = tempo + 3;
		}
		
		tempoPreparo = String.valueOf(tempo) + " Minutos";
		
		return tempoPreparo;
	}
}

