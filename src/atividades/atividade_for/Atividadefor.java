package atividades.atividade_for;

import java.util.Scanner;


public class Atividadefor {

	public static void main(String[] args) {
		
		int contImpar = 0;
		int contPar = 0;

		Scanner scanner = new Scanner(System.in);

		for ( int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º númedo: ");
			int numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				contPar++;
			} else {
				contImpar++ ;
			}

		}
		
		System.out.println("Total de números par: " + contPar + ". Total de números impar: " + contImpar );

		scanner.close();

	}

}
