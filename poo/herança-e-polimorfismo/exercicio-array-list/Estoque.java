package com.generation.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		String produto;
		int escolha;
		boolean saida = true;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String>estoque = new ArrayList<String>(); 

		estoque.add("Tênis");
		estoque.add("Calça esportiva");
		estoque.add("Bola de ping pong");
		
		System.out.println(estoque);
		
		while(saida) {
			System.out.println("\nQual a opção você deseja realizar? \n[1]-Adicionar produtos \n[2]-Remover produtos \n[3]- Verificar o estoque atual\n[4]-Sair");
			escolha = leia.nextInt();
			switch (escolha) {
			case 1:       
				System.out.println("\nDigite o produto que você gostaria de adicionar: ");
				leia.nextLine();
				produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:   
				System.out.println("\nDigite o produto que você gostaria de remover: ");
				leia.nextLine();
				produto = leia.nextLine();//remover dados
				estoque.remove(produto);
				System.out.println("\n"+estoque);
				break;
			case 3:  
				System.out.println("\nEstoque atual: "+estoque);
				break;
			case 4:
				saida = false;
				break;
			default:
				System.out.println("\nEssa não é uma opção válida");
		}
		}
		
	}

}
