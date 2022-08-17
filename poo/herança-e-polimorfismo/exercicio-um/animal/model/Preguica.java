package br.com.generation.animal.model;


public class Preguica extends Animal{

	public Preguica(String nome, String som, String movimento, int idade) {
		super(nome, som, movimento, idade);
	}
	
	@Override
	public void emitirSom() {
		som = " AAaaaaAh AAAaaaah";
	}


	@Override
	public void movimentar() {
		movimento = "sobe em árvores";
		
		System.out.println("A preguiça emite um som enquanto "+movimento+", escute: "+som);	
	}
	
	
	
	

}
