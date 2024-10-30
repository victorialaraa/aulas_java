package atividades.variaveiseoperadores;

import java.util.Scanner;

public class Atividade4 {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.printf("Digite o valor nº 1: ");
		n1 = ler.nextFloat();
		
		System.out.printf("Digite o valor nº 2: ");
		n2 = ler.nextFloat();
		
		System.out.printf("Digite o valor nº 3: ");
		n3 = ler.nextFloat();
		
		System.out.printf("Digite o valor nº 4: ");
		n4 = ler.nextFloat();
		
		 diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença entre o produto nº1 e nº2 pelo produto entre nº3 e nº4 é " + diferenca);
		
		ler.close();
		
   }
}
