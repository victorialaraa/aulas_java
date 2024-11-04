package atividades.atividade_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		boolean exiteNumero = false;
		
		System.out.print("Digite algum numero: ");
		int numDig = scanner.nextInt();
		
		for(int p = 0; p < lista.size(); p++) {
			int item = lista.get(p);
			
			if(item == numDig) {
				exiteNumero = true;
				System.out.println("O número " + numDig +  " foi encontrado");
			}			
		}
		
		if(!exiteNumero) {
            System.out.println("O número " + numDig +  " não foi encontrado");
		}
	}
}
