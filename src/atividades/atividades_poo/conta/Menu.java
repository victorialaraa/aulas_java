package atividades.atividades_poo.conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import atividades.atividades_poo.conta.util.cores;
import atividades.atividades_poo.conta.controller.ContaController;
import atividades.atividades_poo.conta.model.Conta;
import atividades.atividades_poo.conta.model.ContaCorrente;
import atividades.atividades_poo.conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;

		System.out.println("\nCriar contas\n");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 126, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();

		while (true) {

			System.out.println(cores.TEXT_YELLOW + cores.ANSI_BLACK_BACKGROUND
					+ "****************************************************************");
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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui! ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(cores.TEXT_WHITE + "Criar conta \n\n");

				System.out.println("Digite o numero da agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o tipo da conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o saldo da conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o limite de crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do aniversário da conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println(cores.TEXT_WHITE + "Listar todas as contas\n\n");
				contas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println(cores.TEXT_WHITE + "Consultar dados da conta - por número\n\n");

				keyPress();
				break;
			case 4:
				System.out.println(cores.TEXT_WHITE + "Atualizar dados da conta\n\n");

				keyPress();
				break;
			case 5:
				System.out.println(cores.TEXT_WHITE + "Apagar a conta\n\n");

				keyPress();
				break;
			case 6:
				System.out.println(cores.TEXT_WHITE + "Saque\n\n");

				keyPress();
				break;
			case 7:
				System.out.println(cores.TEXT_WHITE + "Depósito\n\n");

				keyPress();
				break;
			case 8:
				System.out.println(cores.TEXT_WHITE + "Transferencia entre contas\n\n");

				keyPress();
				break;
			default:
				System.out.println(cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");

				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n****************************************************************");
		System.out.println("Projeto desenvolvido por: ");
		System.out.println("Victória Lara do Nascimento - victoriap99@gmail.com");
		System.out.println(" https://github.com/victorialaraa?tab=repositories");
		System.out.println("\n****************************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println(cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
