package atividades.atividade_collection2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		
		int opcao;
		boolean isExit = false;
		Scanner scanner = new Scanner(System.in);
	
		Stack<String> pilha = new Stack<String>();

		do {
			System.out.println("************************************************************************* ");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - retirar livro da pilha");
			System.out.println("0 - sair");
			System.out.println("************************************************************************* ");
			System.out.println("Entre com a opção desejada: ");

			opcao = scanner.nextInt();
			
			switch (opcao) {

			case 1:

				System.out.println("\nDigite o nome do livro:  ");
				String livro = scanner.next();
				pilha.push(livro);
				System.out.println("Livro adicionado!");

				break;
			case 2:

				Iterator<String> iterator = pilha.iterator();

				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					System.out.println("\nRemover livro: " + pilha.pop());
					System.out.println("Um Livro foi retirado da pilha!");
				}
				break;

			case 0:
				System.out.println("Programa encerrado");
				isExit = true;
				break;

			default:
				System.out.println("Opção inválida tente novamente");
				break;
			}

		} while (isExit == false);

	}

}