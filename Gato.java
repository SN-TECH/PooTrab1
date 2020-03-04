package br.lasalle.oop.trab1;

public class Gato {
	String nome;	
	String raça;
	boolean fome;
	
	void verificaFome() {
		if(!fome) {
			miar();
		}else {
			System.out.println(nome + " nao esta com fome ");			
		}
	}
	
	void temFome() { 
		fome = true; 
	}
	void naoTemFome() {
		fome = false; 
	}	
	
	void miar() { 
		System.out.println("Miando..."+ nome +" esta com fome ");
	}
}