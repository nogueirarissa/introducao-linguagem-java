package AprendendoJava;

import java.util.Scanner;

public class Exerc4LacoRepeticao {
	
	public static void main(String[] args) {
		
		int idade[] =  new int[5];
		int genero[] =  new int[5];
		int fatorPsic[] = new int[5];
		
		int pessoa=0,npc=0,nmn=0,nha=0,noc=0,npn40=0,npc18=0;
		
		Scanner leia = new Scanner(System.in);
		
			
		while(pessoa<=4) {
			
			System.out.println("\nDigite sua idade: ");
			idade[pessoa] = leia.nextInt();
			System.out.println("\nDigite o número que corresponde ao seu gênero:\n1-Feminino\n2-Masculino\n3-Binário  ");
			genero[pessoa] = leia.nextInt();
			System.out.println("\nDigite o número que corresponde ao fator psicológico::\n1- Calma\n2-Nervosa\n3-Agressiva ");
			fatorPsic[pessoa] = leia.nextInt();
			
			pessoa++;
		}
		pessoa =  0;
		while(pessoa<=4) {
			
			if(fatorPsic[pessoa] == 1) {
				npc++;
			}
			if(genero[pessoa] == 1 && fatorPsic[pessoa] == 2) {
				nmn++;
			}
			if(genero[pessoa] == 2 && fatorPsic[pessoa] == 3) {
				nha++;
			}
			if(genero[pessoa] == 3 && fatorPsic[pessoa] == 1) {
				noc++;
			}
			if(fatorPsic[pessoa] == 2 && idade[pessoa]>40) {
				npn40++;
			}
			if(fatorPsic[pessoa] == 1 && idade[pessoa]<18) {
				npc18++;
			}
			pessoa++;
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+npc);
		System.out.println("\nNúmero de mulheres nervosas: "+nmn);
		System.out.println("\nNúmero de homens agressivos "+nha);
		System.out.println("\nNúmero de outros calmos: "+noc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+npn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+npc18);
	
	}

}
