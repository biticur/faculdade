package ex37;

import java.util.Random;

import javax.swing.JOptionPane;

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
		
	}
	
	public static boolean procurarValor(int[] vetor, int num) {
		for(int x: vetor) {
			if(x == num) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] vetor = new int[20];
		Random random = new Random();
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100);
		}
		
		bubblesort(vetor);
		
		System.out.println("Vetor ordenado:");
		
		for(int x: vetor) {
			System.out.println("[" + x + "]");
		}
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		boolean existencia = procurarValor(vetor, num);
		
		System.out.println(existencia ? "O número existe no vetor" : "O número não existe no vetor");
	}

}
