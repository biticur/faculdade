package ex25;

import javax.swing.JOptionPane;

public class Multiplos {
	public static void verificarDivisao(int x, int y) {
		if(x == y) {
			JOptionPane.showMessageDialog(null, "Os números são iguais");
		} else {
			int maior = Math.max(x, y);
			int menor = Math.min(x, y);
			
			if(maior % menor == 0) {
			JOptionPane.showMessageDialog(null, "O número " + maior + "é múltiplo de " + menor);
			} else {
				JOptionPane.showMessageDialog(null, "O número " + maior + "não é múltiplo de " + menor);
			}
		}	
	}
		
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
		
		verificarDivisao(x, y);
	}

}
