package br.com.dextraining.biblioteca;

import java.util.Date;

public class Livro {

	private String codigo;
	private String autor;
	private String titulo;
	private Date dataPublicacao;

	public String getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
