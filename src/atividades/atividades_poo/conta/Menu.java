package atividades.atividades_poo.conta;

import java.util.Scanner;

import atividades.atividades_poo.conta.utils.cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(cores.TEXT_YELLOW + cores.ANSI_BLACK_BACKGROUND + "****************************************************************");
			System.out.println("                                                                ");
			System.out.println("                  BANCO DO BRAZIL COM Z                         ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("                                                                ");
			System.out.println("              1 - Criar conta                                   ");
			System.out.println("              2 - Listar todas as contas                        ");
			System.out.println("              3 - Buscar conta por número                       ");
			System.out.println("              4 - Atualizar dados da conta                      ");
			System.out.println("              5 - Apagar conta                                  ");
			System.out.println("              6 - sacar                                         ");
			System.out.println("              7 - Depositar                                     ");
			System.out.println("              8 - Transferir valores entre contas               ");
			System.out.println("              9 - sair                                          ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("Entre com a opção desejada:                                     ");
			System.out.println("                                                                " + cores.TEXT_RESET);

			opcao = leia.nextInt();
			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui! ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(cores.TEXT_WHITE + "Criar conta \n\n");

				break;
			case 2:
				System.out.println(cores.TEXT_WHITE + "Listar todas as contas\n\n");

				break;
			case 3:
				System.out.println(cores.TEXT_WHITE + "Consultar dados da conta - por número\n\n");

				break;
			case 4:
				System.out.println(cores.TEXT_WHITE + "Atualizar dados da conta\n\n");

				break;
			case 5:
				System.out.println(cores.TEXT_WHITE + "Apagar a conta\n\n");

				break;
			case 6:
				System.out.println(cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(cores.TEXT_WHITE + "Depósito\n\n");

				break;
			case 8:
				System.out.println(cores.TEXT_WHITE + "Transferencia entre contas\n\n");

				break;
			default:
				System.out.println(cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n****************************************************************");
		System.out.println("Projeto desenvolvido por: ");
		System.out.println("Victória Lara do Nascimento - victoriap99@gmail.com");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("\n****************************************************************");
	}
}
