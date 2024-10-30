package atividades.variaveiseoperadores;

import java.util.Scanner;

public class Atividade1 {

public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
	    
	    float salario;
	    float abono;
	    
	    System.out.printf("Digite seu salário:");
	    salario = ler.nextFloat();
	    
	    System.out.printf("Digite o abono:");
	    
	    abono = ler.nextFloat();
	    
	    System.out.printf("Seu novo saláio é: " + (salario + abono) );
        
	    ler.close();

	}

}
