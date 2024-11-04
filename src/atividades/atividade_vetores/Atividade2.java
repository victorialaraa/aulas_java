package atividades.atividade_vetores;

public class Atividade2 {
	
	static int listNumber[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; 

	static int indexPar = 0;
	static int indexImpar = 0;

	public static void main(String[] args) {

		int soma = somar(listNumber);
		float media = soma / (listNumber.length);
		
		separarImparPar(listNumber);
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
	}
	
	static int somar(int[] list) {
		int soma = 0;
		for(int p = 0; p < listNumber.length; p++) {
			int item = listNumber[p];
			soma += item;
			
			if(item % 2 == 0) {
				indexPar++;

			} 
			
			else if(item % 2 == 1){
				indexImpar++;
			}
		}
		
		return soma;
	}
	
	static void printarListaInt(int[] list) {
		for(int p = 0; p < list.length; p++) {
			int item = list[p];
			System.out.println(item+ " ");
		}
		System.out.println("");
	}

	static void separarImparPar(int[] list) {
		int vetorPar[] = new int[indexPar];
		int vetorImpar[] = new int[indexImpar];
		
		int newIndexPar = 0;
		int newIndexImpar = 0;
		
		for(int p = 0; p < listNumber.length; p++) {
			int item = listNumber[p];
			
			
			if(item % 2 == 0) {
				vetorPar[newIndexPar] = item;
				newIndexPar++;
			} 
			
			else {
				vetorImpar[newIndexImpar] = item;
				newIndexImpar++;
			}
		}
		
		printarListaInt(vetorPar);
		printarListaInt(vetorImpar);
		
	}
}

