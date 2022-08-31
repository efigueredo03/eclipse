package br.com.localhost.livro;

import br.com.localhost.controle.TipoLivro;

public class Livro {

	private String nome;
	private String autor;
	private TipoLivro tipo;
	
	public Livro(String nome, String autor, TipoLivro tipo) {
		this.nome = nome;
		this.autor = autor;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public TipoLivro getTipo() {
		return tipo;
	}
	
}
