package ex35;

import javax.swing.JOptionPane;

public class ConcatenarVetores {
	public static void concatenacao(int[] vetor1, int[] vetor2) {
		int[] vetor3 = new int[6];
		int j = 3;
		
		for(int i = 0; i < vetor1.length; i++) {
			vetor3[i] = vetor1[i];
		}
		
		for(int i = 0; i < vetor2.length; i++) {
			vetor3[j++] = vetor2[i];
		}
		
		System.out.println("Vetores concatenados");
		
		for(int num: vetor3) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		int[] vetor1 = new int[3];
		int[] vetor2 = new int[3];
		
		for(int i = 0; i < vetor1.length; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição [" + i + "] do vetor 1"));
		}
		
		for(int i = 0; i < vetor2.length; i++) {
			vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição [" + i + "] do vetor 2"));
		}
		
		concatenacao(vetor1, vetor2);
	}

}
