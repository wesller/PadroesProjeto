package com.wesller;

import java.util.Arrays;

import com.wesller.facade.SopaLegumesFacade;
import com.wesller.mediator.ChatMediator;
import com.wesller.mediator.ChatMediatorImpl;
import com.wesller.mediator.Usuario;
import com.wesller.mediator.UsuarioImpl;
import com.wesller.singleton.SolSingleton;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Iniciando com padrões de projeto");
		printLine();
		facade();
		printLine();
		try {
			singleton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printLine();
		mediator();
		printLine();
		System.out.println("Concluido");
	}

	private static void facade() {
		System.out.println(">>> Facade <<<");
		SopaLegumesFacade sopa = new SopaLegumesFacade();
		sopa.prepararSopa();
		System.out.println(System.getProperty("line.separator"));
	}
	
	private static void singleton() throws Exception {
		System.out.println(">>> Singleton <<<");
		String idSol = "";
		for (int i = 0; i < 1000; i++) {
			if (idSol.isEmpty()) {
				idSol = SolSingleton.INSTANCE.brilhar();
			}
			if (!idSol.equals(SolSingleton.INSTANCE.brilhar())) {
				System.out.println("O mundo vai acabar, existe mais de um sol.");
				throw new Exception("Singleton falhou"); 
			}
		}
		System.out.println("Singleton executado com sucesso");
		System.out.println();
	}
	
	private static void mediator() {
		System.out.println(">>> Mediator <<<");
		ChatMediator mediator = new ChatMediatorImpl();
		Usuario joao = new UsuarioImpl(mediator, "Joao");
		Usuario pedro = new UsuarioImpl(mediator, "Pedro");
		Usuario juberlita = new UsuarioImpl(mediator, "Juberlita");
		Usuario serafina = new UsuarioImpl(mediator, "Serafina");
		mediator.adicionarUsuario(joao);
		mediator.adicionarUsuario(pedro);
		mediator.adicionarUsuario(juberlita);
		mediator.adicionarUsuario(serafina);
		joao.send("Ola a todos");
		
	}
	
	private static void printLine() {
		char[] data = new char[120];
	    Arrays.fill(data, '-');
	    System.out.println(new String(data));
	}
}
