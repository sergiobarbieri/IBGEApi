package br.com.drummond.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Uf {
	
	@Id
	@Column(name = "uf_sigla") 
	private String ufSigla;
	@Column(name = "uf_descricao") 
	private String ufDescricao;
	
    public Uf() {
		
	}

	public String getUfSigla() {
		return ufSigla;
	}

	public String getUfDescricao() {
		return ufDescricao;
	}

	public void setUfDescricao(String ufDescricao) {
		this.ufDescricao = ufDescricao;
	}
	
	
	

	
}
