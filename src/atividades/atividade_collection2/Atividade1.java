package atividades.atividade_collection2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		int opcao;
		boolean isExit = false;
		Scanner scanner = new Scanner(System.in);

		LinkedList<String> fila = new LinkedList<String>();


		do {
			System.out.println("************************************************************************* ");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - retirar cliente da fila");
			System.out.println("0 - sair");
			System.out.println("************************************************************************* ");
			System.out.println("Entre com a opção desejada: ");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("\nDigite o nome do cliente:  ");
				String cliente = scanner.next();
				fila.add(cliente);
				System.out.println("Cliente adicionado.");

				break;
			case 2:

				Iterator<String> iterator = fila.iterator();

				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
					System.out.println("\nRemover cliente: " + fila.remove());
					System.out.println("O cliente foi chamado.");
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
