package com.wesller;

import java.util.Arrays;

import com.wesller.facade.SopaLegumesFacade;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Iniciando com padrões de projeto");
		printLine();
		facade();
		printLine();
		System.out.println("Concluido");
	}

	private static void facade() {
		SopaLegumesFacade sopa = new SopaLegumesFacade();
		sopa.prepararSopa();
		System.out.println(System.getProperty("line.separator"));
		
	}
	
	private static void printLine() {
		char[] data = new char[120];
	    Arrays.fill(data, '-');
	    System.out.println(new String(data));
	}
}
