package br.com.localhost.usuarios;

import br.com.localhost.controle.TipoUsuario;

public class Funcionario extends Usuario {

	public Funcionario(String nome, String usuario, String senha) {
		super(nome, usuario, senha, TipoUsuario.FUNCIONARIO);
	}

}
