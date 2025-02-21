package ex18;

import javax.swing.JOptionPane;

public class DiferencaMaiorMenor {
	public static void exibirTroca(int x, int y) {
		if(x >= y) {
			JOptionPane.showMessageDialog(null, "Diferença do maior pelo menor: " + (x - y));
		} else {
			JOptionPane.showMessageDialog(null, "Diferença do maior pelo menor: " + (y - x));
		}
	}
	
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
		
		exibirTroca(x, y);
	}

}
