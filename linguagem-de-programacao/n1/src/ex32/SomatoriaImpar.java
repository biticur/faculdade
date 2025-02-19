package ex32;

import javax.swing.JOptionPane;

public class SomatoriaImpar {
	public static void somatoria(int maior, int menor, int soma) {
		if(menor > maior) {
			System.out.println(soma);
			return;
		} else if(menor % 2 != 0) {
			somatoria(maior, menor + 2, soma += menor);
		} else {
			somatoria(maior, menor + 1, soma);
		}
	}
	
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
		int maior = Math.max(x, y);
		int menor = Math.min(x, y);
		int soma = 0;
		
		somatoria(maior, menor, soma); 
	}

}
