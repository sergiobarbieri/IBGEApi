package br.com.drummond.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Municipio {
	
	@Id
	@Column(name = "codigo") 
	private Integer codigo;
	@Column(name = "nome") 
	private String nome;
	@Column(name = "uf_sigla") 
	private String ufSigla;
	
    public Municipio() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUfSigla() {
		return ufSigla;
	}

	public void setUfSigla(String ufSigla) {
		this.ufSigla = ufSigla;
	}
}
