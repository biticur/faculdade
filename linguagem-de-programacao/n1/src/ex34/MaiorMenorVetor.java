package ex34;

import javax.swing.JOptionPane;

public class MaiorMenorVetor {
	public static void exibirMaiorMenor(int[] vetor) {
		int maior = vetor[0];
		int menor = vetor[0];
		
		for(int num: vetor) {
			if(num > maior) {
				maior = num;
			} else if (num < menor) {
				menor = num;
			}
		}
		
		System.out.println("Maior número do vetor: " + maior);
		System.out.println("Menor número do vetor: " + menor);
	}
	
	public static void media(int[] vetor) {
		int soma = 0;
		
		for(int num: vetor) {
			soma += num;
		}
		
		System.out.println("Média dos valores digitados: " + (double) soma / vetor.length);
	}
	
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do índice [" + i + "]"));
		}
		
		exibirMaiorMenor(vetor);
		media(vetor);
	}

}
