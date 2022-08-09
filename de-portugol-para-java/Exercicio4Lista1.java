/*real x1,x2,y1,y2,d

		escreva("\nEntre com o valor de x1: ")
		leia(x1)
		escreva("\nEntre com o valor de x2: ")
		leia(x2)
		escreva("\nEntre com o valor de y1: ")
		leia(y1)
		escreva("\nEntre com o valor de y2: ")
		leia(y2)

		d = mat.raiz((mat.potencia((x2-x1),2.0)+mat.potencia((y2-y1),2.0)), 2.0)  //radicando é os elementos dentro da raiz. Índice é 2, pois é uma raiz quadrada

		escreva("\nDistância entre dois pontos foi de: ",mat.arredondar(d,2))*/


package AprendendoJava;

import java.util.Scanner;

public class Exercicio6Lista1 {
	public static void main (String[] args) {
		
		double x1,x2,y1,y2,d,R,S;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("\nEntre com o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("\nEntre com o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("\nEntre com o valor de y2: ");
		y2 = leia.nextDouble();
		
		R = Math.pow(x1+x2,2);
		S = Math.pow(y1+y2,2);
		
		d = (R + S)/2;
		
		System.out.println("\nA distância entre dois pontos foi de: "+d);
	}

}
