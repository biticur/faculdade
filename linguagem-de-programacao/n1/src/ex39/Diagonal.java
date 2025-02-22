package ex39;

import java.util.Random;

public class Diagonal {
	public static void preencherMatriz(int[][] matriz) {
		Random random = new Random();
		
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz.length; y++) {
				matriz[x][y] = (x != y) ? random.nextInt(100) : 0;
			}
		}
	}
	
	public static void preencherDiagonal(int[][] matriz) {
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz.length; y++) {
				if(x == y) {
					matriz[x][y] = (int) Math.pow(4, y);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matriz = new int [4][4];
		
		preencherMatriz(matriz);
		preencherDiagonal(matriz);
		
		for(int[] linha: matriz) {
			for(int num: linha) {
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
	}

}
