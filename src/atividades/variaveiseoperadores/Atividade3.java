package atividades.variaveiseoperadores;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		
		float sbruto, anoturno, hextra, descontos, sliquido;
		
		System.out.printf("Digite o salário bruto: ");
		sbruto = escrever.nextFloat();
		
		System.out.printf("Digite o adicional noturno: ");
		anoturno = escrever.nextFloat();
		
		System.out.printf("Digite as horas extras: ");
		hextra = escrever.nextFloat();
		
		System.out.printf("Digite os descontos: ");
		descontos = escrever.nextFloat();
		
		sliquido = (sbruto + anoturno + (hextra * 5)) - descontos;
		
		System.out.printf("O salário líquido é: " + sliquido);
		
		escrever.close();

	}

}