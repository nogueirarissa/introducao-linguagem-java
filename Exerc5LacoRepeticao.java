package AprendendoJava;

import java.util.Scanner;

public class Exerc5LacoRepeticao {

public static void main(String[] args) {
		
		int num,soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			
			if(num == 0) {
				System.out.println("\nVolte sempre!!");
			}else {
				soma += num;
				  }
			}
				
		while(num!=0);
			System.out.println("\nA soma dos números é: "+soma);
			}
				
}


