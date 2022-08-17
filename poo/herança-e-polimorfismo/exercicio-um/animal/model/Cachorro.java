package br.com.generation.animal.model;

public class Cachorro extends Animal {

	public Cachorro(String nome, String som, String movimento, int idade) {
		super(nome, som, movimento, idade);
	}

	@Override
	public void emitirSom() {
		
		som = "Au Au Au";
	}

	@Override
	public void movimentar() {
		
		movimento = "corre";	
		System.out.println("O cachorro emite um som enquanto "+movimento+", escute: "+som);
	}

}
