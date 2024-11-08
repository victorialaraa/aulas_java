package poo.objetos;

public class Menu {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		
		System.out.println("\nCadastre seu gato: ");
		gato1.nome = "bugadinho";
		gato1.idade = 1;
		gato1.cor = "tricolor";
		gato1.raca = "viralata";
		
		gato1.Imprimir();
		
		System.out.println("\nOque o gato1 está fazendo? ");
		
		gato1.Dormir();
		
		
		// Gato 2
		
		System.out.println("\nCadastre seu gato: ");
		gato2.nome = "Carniça";
		gato2.idade = 3;
		gato2.cor = "Laranja";
		gato2.raca = "viralata";
		
		gato2.Imprimir();
		
		System.out.println("\nOque o gato2 está fazendo? ");
		
		gato2.Miar();
		gato2.Comer();

	}

}
