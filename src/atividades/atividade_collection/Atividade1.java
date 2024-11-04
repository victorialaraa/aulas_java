package atividades.atividade_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;

public class Atividade1 {
	
	public static void main(String[] args) {
		int limiteLista = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		String[] listaCores = {"Azul", "Verde", "Amarelo", "Branco", "Laranja"};
		ArrayList<String> lista = new ArrayList<String>();

		for(int i = 0; i < limiteLista; i++) {
			String item = listaCores[i];
			
			System.out.println("Digite uma cor: ");
			String texto = scanner.next();
			
			lista.add(texto);
		}
		
		System.out.println("cores:");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		Collections.sort(lista);
		
		System.out.println("");
		System.out.println("Ordenar as cores:");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
	}
}
