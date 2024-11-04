package atividades.atividade_while;

import java.util.Scanner;

public class Atividadewhile {

	public static void main(String[] args) {

		  int contMenores = 0; 
	        int contMaiores = 0;
	        int idade;

	        Scanner scanner = new Scanner(System.in);

	        while (true) { 
	            System.out.print("Digite uma idade (negativa para sair): ");
	            idade = scanner.nextInt();

	            if (idade < 0) { 
	                break;
	            }

	            if (idade < 21) {
	                contMenores++; 
	            }

	            if (idade > 50) {
	                contMaiores++; 
	            }
	        }

	        
	        System.out.println("Total de pessoas menores de 21 anos: " + contMenores);
	        System.out.println("Total de pessoas maiores de 50 anos: " + contMaiores);
	        
	        scanner.close();

	}
}
