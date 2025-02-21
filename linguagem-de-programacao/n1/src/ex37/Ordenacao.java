package ex37;

import java.util.Random;

public class Ordenacao {
	public static void bubblesort(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length - i - 1; j++) {
				if(vetor[j] > vetor[j + 1]) {
					int aux = vetor[j + 1];
					vetor[j + 1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		System.out.println("Vetor ordenado:");
		
		for(int num: vetor) {
			System.out.println("[" + num + "]");
		}
		
	}
	
	public static void main(String[] args) {
		int[] vetor = new int[20];
		Random random = new Random();
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100);
		}
		
		bubblesort(vetor);
	}

}
