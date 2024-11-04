package atividades.atividade_dowhile;

import java.util.Scanner;

public class Atividadedowhile {

	public static void main(String[] args) {
		
		  int numero;
	      int soma = 0;

	        Scanner scanner = new Scanner(System.in);

	        do {
	            System.out.print("Digite um número (Caso deseje sair digite 0): ");
	            numero = scanner.nextInt();

	            if (numero > 0) { 
	                soma = soma + numero;
	            }
	        } while (numero != 0); 

	       
	        System.out.println("A soma dos números positivos digitados é: " + soma);
	        
	        scanner.close(); 
	    }
	}