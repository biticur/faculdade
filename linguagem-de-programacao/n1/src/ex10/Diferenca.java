package ex10;

import javax.swing.JOptionPane;

public class Diferenca {

	public static void main(String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		
		while(x < 0) {
			JOptionPane.showMessageDialog(null, "O número deve ser real");
			x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número diferente"));
		}
		
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número"));
		
		while(y < 0) {
			JOptionPane.showMessageDialog(null, "O número deve ser real");
			y = Double.parseDouble(JOptionPane.showInputDialog("Digite um número diferente"));
		}
		
		JOptionPane.showMessageDialog(null, "Diferença: " + (x - y));
	}

}
