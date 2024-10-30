package atividades.atividadesif;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
Scanner escrever = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o número A:");
		a = escrever.nextInt();
		
		System.out.println("Digite o numero B:");
		b = escrever.nextInt();
		
		System.out.println("Digite o numero C:");
		c = escrever.nextInt();

		if ((a + b) > c) {
			
			System.out.println(  "A Soma de A + B é Maior do que C");
		} 
		
		else if ((a + b) < c ){
			System.out.println(  "A Soma de A + B é Menor do que C");
		}
		
		else if ((a + b) == c ){
			System.out.println(  "A Soma de A + B é Igual a C");
		}
		
		escrever.close();
	}

}
