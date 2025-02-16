package controller;

import java.text.DecimalFormat;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	
	public void mil() {
		double tempoInicial = System.nanoTime();		
		int[] vetor = new int[1000];
		int length = vetor.length;
		
		for(int i = 0; i < length; i++) {
			vetor[i] = 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		DecimalFormat df = new DecimalFormat("#.#####");	
		
		System.out.println("Vetor de 1000 posições: " + df.format(tempoTotal) + "s");
	}
	
	public void dezMil() {
		double tempoInicial = System.nanoTime();
		int[] vetor = new int[10000];
		int length = vetor.length;
		
		for(int i = 0; i < length; i++) {
			vetor[i] = 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		DecimalFormat df = new DecimalFormat("#.####");
		
		System.out.println("Vetor de 10000 posições: " + df.format(tempoTotal) + "s");
	}
	
	public void cemMil() {
		double tempoInicial = System.nanoTime();
		int[] vetor = new int[100000];
		int length = vetor.length;
		
		for(int i = 0; i < length; i++) {
			vetor[i] = 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		
		System.out.println("Vetor de 100000 posições: " + tempoTotal + "s");
	}
}
