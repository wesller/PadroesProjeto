package com.wesller.mediator;

public interface ChatMediator {

	void enviarMensagem(String mensagem, Usuario usuario);
	
	void adicionarUsuario(Usuario usuario);
}
