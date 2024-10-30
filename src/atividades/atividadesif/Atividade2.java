package atividades.atividadesif;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner escrever = new Scanner(System.in);
		
		String nome; 
		int idade;
		boolean doacao;
		
		System.out.println("Digite o Nome do doador: ");
        nome = escrever.next();
        
        System.out.println("Digite a Idade do doador: ");
        idade = escrever.nextInt();
        
        System.out.println("Primeira doação de sangue? (true ou false) ");
        doacao = escrever.nextBoolean();
        
        if (idade <= 59 && idade >= 18 ) {
			
			System.out.println( nome + " está apto(a) para doar sangue!");
		} 
		
		else if (idade <= 18 ){
			System.out.println( nome + " não está apto(a) para doar sangue!");
		}
		
		else if ((idade >=60) && (doacao == true) ){
			System.out.println( nome + " não está apto(a) para doar sangue!");
		}
        
		else if ((idade >=60) && (idade <=69) && (doacao == false) ){
			System.out.println( nome + " está apto(a) para doar sangue!");
		}
		
		escrever.close();
        
		
	}

}
