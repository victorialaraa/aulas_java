package atividades.atividade_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		int limite = 3;
		Scanner scanner = new Scanner(System.in);
//        Iterator<Integer> iterator = lista.iterator();
        
        ArrayList<Integer> lista = new ArrayList<Integer>();    
        
        for(int i = 0; i < limite; i++) {
            System.out.print("Digite algum numero: ");
    		int numDig = scanner.nextInt();
    		lista.add(numDig);
        }
        
        Collections.sort(lista);
        
		System.out.println("");
		System.out.println("Lista Ordenada");
        for(int i = 0; i < limite; i++) {
        	System.out.println(lista.get(i));
        }
        
		System.out.println("");
		
        Iterator<Integer> iterator = lista.iterator();
        ArrayList<Integer> listaUnica = new ArrayList<>();
 
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (!listaUnica.contains(numero)) {
                listaUnica.add(numero);
            }
        }
        
        for(int i = 0; i < listaUnica.size(); i++) {
        	System.out.println(listaUnica.get(i));
        }
	}
}
