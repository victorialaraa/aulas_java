package atividades.atividade_switch;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		
		    float numero1, numero2;
			int operacao;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("# ## ### #### #########   Calculadora   ########## #### ### ## #");
			
			System.out.printf("\n--Digite o primeiro numero--");
			numero1 = scanner.nextFloat();
			
			System.out.printf("\n--Digite o segundo numero--");
			numero2 = scanner.nextFloat();
			
			System.out.println("# ## ### #### #########   Escolha uma operaçao   ########## #### ### ## #");
	        System.out.println("--Digite 1 para soma--");
	        System.out.println("--Digite 2 para Subtração--");
	        System.out.println("--Digite 3 para multiplicação--");
	        System.out.println("--Digite 4 para divisão--");
	        operacao = scanner.nextInt();
	        
	        switch (operacao) {
	        
	        case 1:
	        	System.out.printf("O resultado da soma é: " + (numero1 + numero2));
	        	break;
	        case 2:
	        	System.out.printf("O resultado da subtração é: " +  (numero1 - numero2));
	            break;
	        case 3: 
	        	System.out.printf("O resultado da multiplicação é: " + (numero1 * numero2));
	            break;
	        case 4: 
	        	System.out.printf("O resultado da divisão é: " + (numero1 / numero2));
	            break;
	            
	            default:
	            	System.out.println("Opção inválida");
	            	break;
	        }
	        
		}

	}
