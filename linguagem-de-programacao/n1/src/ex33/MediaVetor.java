package ex33;

import javax.swing.JOptionPane;

public class MediaVetor {
	public static void media(int[] vetor) {
		int soma = 0;
		int elementos = 0;
		
		for(int num: vetor) {
			if(num > 10 && num < 200) {
				soma += num;
				elementos++;
			}
		}
		
		if(elementos == 0) {
			System.out.println("O vetor não possui números entre 10 e 200");
		} else {
			System.out.println("Média dos números entre 10 e 200: " + (double) soma / elementos);
		}
	}
	
	public static void somaImpar(int[] vetor) {
		int soma = 0;
		
		for(int num: vetor) {
			if(num % 2 != 0) {
				soma += num;
			}
		}
		System.out.println("Soma dos números ímpares: " + soma);
	}
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número no índice [" + i + "]"));
		}
		
		media(vetor);
		somaImpar(vetor);
	}

}
