package br.com.sigaBem.projectSigaBem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Produto {
	
	@Column(name = "peso")
	private Double peso;
	
	@Column(name = "cep_origem")
	private String cepOrigem;
	
	@Column(name = "cep_destino")
	private String cepDestino;
	
	@Column
	private String nomeDestinatario;
	
	public Produto() {
		
	}
	
	public Produto(Double peso, String cepOrigem, String cepDestino, String nomeDestinatario) {
		this.peso = peso;
		this.cepOrigem = cepOrigem;
		this.cepDestino = cepDestino;
		this.nomeDestinatario = nomeDestinatario;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getCepOrigem() {
		return cepOrigem;
	}
	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}
	public String getCepDestino() {
		return cepDestino;
	}
	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	
	

}
