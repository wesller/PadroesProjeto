package com.wesller.mediator;

public abstract class Usuario {

	protected ChatMediator mediador;
	
	protected String nome;
	
	public Usuario(ChatMediator mediator, String nome) {
		this.mediador = mediator;
		this.nome = nome;
	}
	
	public abstract void send(String mensagem);
	
	public abstract void receive(String mensagem);
}
