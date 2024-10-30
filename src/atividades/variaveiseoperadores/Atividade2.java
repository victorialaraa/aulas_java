package atividades.variaveiseoperadores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.printf("Digite sua primeira nota: ");
		nota1 = escrever.nextFloat();
		
		System.out.printf("Digite sua segunda nota: ");
		nota2 = escrever.nextFloat();
		
		System.out.printf("Digite sua terceira nota: ");
		nota3 = escrever.nextFloat();
		
		System.out.printf("Digite sua quarta nota: ");
		nota4 = escrever.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Sua média final é: " + media);
		
		escrever.close();

	}

}
