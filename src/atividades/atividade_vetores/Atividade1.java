package atividades.atividade_vetores;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int listNumber[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; 
		boolean numeroDigitado = false;
		
		
		System.out.println("Digite algum numero para descobrir a posição: ");
		int numDig = scanner.nextInt();
		
		for(int p = 0; p < listNumber.length; p++) {
			int item = listNumber[p];
			
			if(item == numDig) {
				numeroDigitado = true;
	            System.out.println("O número " + numDig+  " está localizado na posição: " + p);
			}
			
		}
		
		if(!numeroDigitado) {
            System.out.println("O número " + numDig +  " não foi encontrado");
		}
	}
}
