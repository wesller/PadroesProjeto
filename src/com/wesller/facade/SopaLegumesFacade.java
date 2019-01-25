package com.wesller.facade;

import java.util.LinkedList;
import java.util.List;

public class SopaLegumesFacade {
	
	private List<Ingredientes> ingredientes = new LinkedList<Ingredientes>();
	
	public SopaLegumesFacade() {
		ingredientes.add(new Batata());
		ingredientes.add(new Repolho());
		ingredientes.add(new Cenoura());
		ingredientes.add(new Cebola());
		ingredientes.add(new Carne());
		ingredientes.add(new Sal());
	}
	
	private void comprarIngredientes() {
		System.out.print("Realizando a compra dos ingredientes: ");
		imprimeIngredientes();
	}
	
	public void prepararSopa() {
		comprarIngredientes();
		System.out.println("Preparando os ingredientes");
		System.out.print("Sopa preparada com os ingredientes: ");
		imprimeIngredientes();
	}
	
	private void imprimeIngredientes() {
		for (Ingredientes ingrediente : ingredientes) {
			System.out.print(String.format("%s, ",ingrediente.nome()));
		}
		System.out.println();
	}

}
