package br.com.localhost.usuarios;

import br.com.localhost.controle.TipoUsuario;

public class Administrador extends Usuario {

	public Administrador(String nome, String usuario, String senha) {
		super(nome, usuario, senha, TipoUsuario.ADMINISTRADOR);
	}

}
