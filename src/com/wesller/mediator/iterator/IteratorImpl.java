package com.wesller.mediator.iterator;

public class IteratorImpl implements Iterator {

	private Fruta[] itens;
	int indice = 0;
	
	public IteratorImpl(Fruta[] itens) {
		this.itens = itens; 
	}
	@Override
	public boolean hasNext() {
		if (indice >= itens.length || itens[indice] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Fruta frutaAtual = itens[indice];	
		indice++;
		return frutaAtual;
	}

}
