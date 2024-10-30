package atividades.atividade_switch;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
			int opcao, quantidade;
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("# ## ### #### #########   Selecione uma opção do menú   ########## #### ### ## #");
	        System.out.println("--Digite 1 para Cachorro quente R$10,00 --");
	        System.out.println("--Digite 2 para X-Salada R$15,00--");
	        System.out.println("--Digite 3 para X-Bacon R$18,00--");
	        System.out.println("--Digite 4 para Bauru R$12,00--");
	        System.out.println("--Digite 5 para Refrigerante R$08,00--");
	        System.out.println("--Digite 6 para Suco de Latanja R$13.00--");
	        opcao = scanner.nextInt();
	        
	        System.out.printf("\n--Digite a quantidade--");
			quantidade = scanner.nextInt();
	        
	        switch (opcao) {
	        
	        case 1:
	        	System.out.printf("Pedido: Cachorro quente. Valor total: " + (quantidade * 10) + "reais");
	        	break;
	        case 2:
	        	System.out.printf("Pedido: X-Salada. Valor total: " + (quantidade * 15) + "reais");
	            break;
	        case 3: 
	        	System.out.printf("Pedido: X-Bacon. Valor total: " + (quantidade * 18) + "reais");
	            break;
	        case 4: 
	        	System.out.printf("Pedido: Bauru. Valor total: " + (quantidade * 12) + "reais");
	            break;
	        case 5: 
	        	System.out.printf("Pedido: Refrigerante. Valor total: " + (quantidade * 8) + "reais");
	            break;
	        case 6: 
	        	System.out.printf("Pedido: Suco de laranja. Valor total: " + (quantidade * 13) + "reais");
	            break;
	            
	            default:
	            	System.out.println("Opção inválida");
	            	break;
	        }
	        
		}

	}