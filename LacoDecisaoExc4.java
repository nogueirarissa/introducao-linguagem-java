package AprendendoJava;

import java.util.Scanner;

public class LacoDecisaoExc4 {
	public static void main(String[] args){
		int numero;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número qualquer: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			resultado = Math.sqrt(numero);
		}else{
			resultado = Math.pow(numero, 2);
		}
		
		System.out.println("\nResultado = "+resultado);
		System.out.printf("\nResultado = %.2f ",resultado);
		
	}
}

