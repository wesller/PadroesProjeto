package com.wesller.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<Usuario> usuarios;
	
	public ChatMediatorImpl(){
		usuarios=new ArrayList<>();
	}
	
	@Override
	public void enviarMensagem(String mensagem, Usuario usuario) {
		for (Usuario usu : usuarios) {
			if(usu != usuario) {
				usu.receive(mensagem);
			}
		}

	}

	@Override
	public void adicionarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);

	}

}
