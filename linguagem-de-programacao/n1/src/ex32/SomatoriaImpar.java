package ex32;

import javax.swing.JOptionPane;

public class SomatoriaImpar {
	public static void somatoria(int maior, int menor, int impar) {
		if(menor >= maior) {
			return;
		} else if(menor % 2 == 0){
			somatoria(maior, menor + 1, impar = 0);
		} else {
			System.out.println(impar);
			somatoria(maior, menor + 2, impar + menor);
		}
	}
	
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
		int maior = Math.max(x, y);
		int menor = Math.min(x, y);
		int impar = menor;
		
		somatoria(maior, menor, impar); 
	}

}
