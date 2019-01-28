package com.wesller.mediator;

public class UsuarioImpl extends Usuario {

	public UsuarioImpl(ChatMediator mediator, String nome) {
		super(mediator, nome);
	}

	@Override
	public void send(String mensagem) {
		System.out.println(String.format("Usuário: %s enviando a menssagem: %s", nome, mensagem));
		mediador.enviarMensagem(mensagem, this);

	}

	@Override
	public void receive(String mensagem) {
		System.out.println(String.format("Usuário: %s recebeu a mensagem: %s", nome, mensagem));

	}

}
