package br.com.generation.animal;

import br.com.generation.animal.model.Cachorro;
import br.com.generation.animal.model.Cavalo;
import br.com.generation.animal.model.Preguica;

public class TestaAnimal {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("Introduz o bicho preguiça ");
		System.out.println("-------------------------");
		Preguica p1 = new Preguica("Hugo","AAaaaaAh AAAaaaah","sobe em árvores.", 12);
		p1.visualizar();
		p1.emitirSom();
		p1.movimentar();
		
		System.out.println("-------------------------");
		System.out.println("Introduz o cachorro");
		System.out.println("-------------------------");
				
		Cachorro c1 = new Cachorro("Ulrika","Au Au Au","corre",15);
		c1.visualizar();
		c1.emitirSom();
		c1.movimentar();
		
		System.out.println("-------------------------");
		System.out.println("Introduz o cavalo");
		System.out.println("-------------------------");
		Cavalo c2 = new Cavalo("Ferrari","Hiin in in","corre",5);
		c2.visualizar();
		c2.emitirSom();
		c2.movimentar();		
		
	}

}
