package ex38;

import javax.swing.JOptionPane;

public class Vendas {
	public static int[] cadaProduto(int[][] matriz) {
		int[] vendas = new int[3];
		
		for(int[] linha: matriz) {
			for(int y = 0; y < linha.length; y++) {
				vendas[y] += linha[y];
			}
		}
		
		return vendas;		
	}
	
	public static int[] vendaSemanal(int[][] matriz) {
		int[] semanal = new int[matriz.length];
		
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz[x].length; y++) {
				semanal[x] += matriz[x][y];
			}
		}
		
		return semanal;
	}
	
	public static int total(int[][] matriz) {
		int total = 0;
		
		for(int[] linha: matriz) {
			for(int num: linha) {
				total += num;
			}
		}
		return total;
		
	}
	
	public static void main(String[] args) {
		int x = 4; int y = 3;
		int[][] matriz = new int[x][y];
		
		for(x = 0; x < matriz.length; x++) { //semanas
			for(y = 0; y < matriz[x].length; y++) { //produtos
				matriz[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Semana " + (x + 1) + "\nDigite a quantidade de vendas do produto " + (y + 1)));
			}
		}
		
		int[] vendas = cadaProduto(matriz);
		
		System.out.println("TOTAL DE VENDAS POR PRODUTO");
		for(y = 0; y < vendas.length; y++) {
			System.out.println("produto " + (y + 1) + ": " + vendas[y]);
		}
		
		System.out.println();
		
		int[] semanal = vendaSemanal(matriz);
		
		System.out.println("VENDAS POR SEMANA");
		for(x = 0; x < semanal.length; x++) {
			System.out.println("Semana " + (x + 1) + ": " + semanal[x]);
		}
		
		System.out.println();
		
		int total = total(matriz);
		
		System.out.println("VENDAS TOTAIS: " + total);
	}

}
