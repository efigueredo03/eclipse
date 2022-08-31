package br.com.localhost.usuarios;

import br.com.localhost.controle.TipoUsuario;

public abstract class Usuario {

	private String nome;
	private String usuario;
	private String senha;
	private TipoUsuario tipo;
	
	public Usuario(String nome, String usuario, String senha, TipoUsuario tipo) {
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public TipoUsuario getTipo() {
		return tipo;
	}
	
}
