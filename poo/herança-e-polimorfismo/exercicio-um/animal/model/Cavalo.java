package br.com.generation.animal.model;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, String som, String movimento, int idade) {
		super(nome, som, movimento, idade);
	}
	@Override
	public void emitirSom() {
		som = "Hiin in in";
	}
	@Override
	public void movimentar() {
		movimento = "corre";
		
		System.out.println("O cavalo emite um som enquanto "+movimento+", escute: "+som);
	}

	
	
	

}
