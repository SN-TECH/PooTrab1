package br.lasalle.oop.trab1;

public class CateDogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Zeus";
		cachorro.cor = "preto";		
		cachorro.carinho = false;
		
		cachorro.AbanarRabo();
		
		Gato gato = new Gato();
		gato.nome ="mimi";
		gato.raça = "persa";
		
		gato.verificaFome();
	}

}
