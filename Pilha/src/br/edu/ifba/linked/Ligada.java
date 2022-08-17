package br.edu.ifba.linked;

import java.util.Stack;

import br.edu.ifba.basica.Contato;

public class Ligada {
	
	Stack<Contato>lista = new Stack<Contato>();
	
	
	public void inserir(Contato info) {
		lista.push(info);
	}
	public void remover() {
		lista.pop();
	}

	public boolean verificar() {
		return this.lista.isEmpty();

	}

	public void mostrar() {
		System.out.println("\n" + lista.toString());
	}
	}
	
	

