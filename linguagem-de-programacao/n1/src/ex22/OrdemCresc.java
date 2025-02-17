package ex22;

import javax.swing.JOptionPane;

public class OrdemCresc {
	public static void exibirOrdem(int x, int y) {
		if(x < y) {
			JOptionPane.showMessageDialog(null, x + ", " + y);
		} else {
			JOptionPane.showMessageDialog(null, y + ", " + x);
		}
	}
	
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
		
		while(y == x) {
			JOptionPane.showMessageDialog(null, "Os números devem ser diferentes!");
			y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número novamente"));
		}
		
		exibirOrdem(x, y);
	}

}
