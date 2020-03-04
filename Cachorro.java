package br.lasalle.oop.trab1;

public class Cachorro {
	String nome;
	String cor;
	String pelo;	
	boolean carinho;
	
	
	void AbanarRabo() {
		if(!carinho) {
			LatirFeliz();
		}else {
			LatirComRaiva();
		}
	}
	
	void LatirFeliz() {		
		System.out.println( nome +" rosnando: 'arrr! arrr!' Ele parece nao gostar de vc!");
	}
	void LatirComRaiva() {		
		System.out.println( nome +" latindo: 'Au au!' Ele esta feliz !");
	}
}
