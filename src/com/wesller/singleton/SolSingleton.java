package com.wesller.singleton;

import java.util.UUID;

public enum SolSingleton {

	INSTANCE;
	private String id;
	SolSingleton(){
		id = UUID.randomUUID().toString();
	    System.out.println(String.format("Criando o sol %s", id));
	}
	public String brilhar() {
		return String.format("Sol %s brilhando.", id);
	}
	

}
