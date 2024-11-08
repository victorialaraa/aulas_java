package poo.objetos;

public class Gato {

	String nome;
	int idade;
	String cor;
	String raca;
	
	public void Miar() {
		System.out.println("Miauuuuuuu");
	}
	
	public void Comer( ) {
		System.out.println("Comendo a ração yummy yummy yummy ");
	}
	
	public void Dormir() {
		System.out.println("Dormiu zzZzZzZz");
	}
	
	public void Imprimir() {
		System.out.println("\nNome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Cor: " +cor);
		System.out.println("Raça: " +raca);
	}
	
}
