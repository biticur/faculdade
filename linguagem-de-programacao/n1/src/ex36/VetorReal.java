package ex36;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class VetorReal {
	public static double calcularMedia(double[] vetor) {
		double soma = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		for(double num: vetor) {
			soma += num;
		}
		
		System.out.println("Média: " + df.format(soma / vetor.length));
		
		return soma / vetor.length; 
	}
	
	public static void notasAcima(double[] vetor, double media) {
		int acima = 0;
		
		for(double num: vetor) {
			if(num > media) {
				acima++;
			}
		}
		
		System.out.println("Quantidade de notas acima da média: " + acima);
	}
	
	public static void posicoesAbaixo(double[] vetor, double media) {
		System.out.println();
		System.out.println("Posições de notas abaixo da média:");
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println("[" + i + "]");
			}
		}
	}
	
	public static void main(String[] args) {
		double[] vetor = new double[5];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da posição [" + i + "]"));
		}
		
		double media = calcularMedia(vetor);
		
		notasAcima(vetor, media);
		posicoesAbaixo(vetor, media);
	}

}
