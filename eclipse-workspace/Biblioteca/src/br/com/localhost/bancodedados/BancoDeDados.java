package br.com.localhost.bancodedados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.localhost.controle.TipoLivro;
import br.com.localhost.controle.TipoUsuario;
import br.com.localhost.livro.Livro;
import br.com.localhost.usuarios.Usuario;

public class BancoDeDados {

	private Map<TipoUsuario, ArrayList<Usuario>> armazenamentoUsuarios;
	private Map<TipoLivro, ArrayList<Livro>> armazenamentoLivros;
	
	public BancoDeDados() {
		this.armazenamentoUsuarios = new HashMap<TipoUsuario, ArrayList<Usuario>>();
		this.armazenamentoLivros = new HashMap<TipoLivro, ArrayList<Livro>>();
		
		this.armazenamentoUsuarios.put(TipoUsuario.ADMINISTRADOR, new ArrayList<Usuarios>)
	}
	
}
