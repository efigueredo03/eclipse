package br.com.localhost.usuarios;

import br.com.localhost.controle.TipoUsuario;

public class Pessoa extends Usuario {

	public Pessoa(String nome, String usuario, String senha) {
		super(nome, usuario, senha, TipoUsuario.PESSOA);
	}

}
