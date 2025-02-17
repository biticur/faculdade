package ex10;

import javax.swing.JOptionPane;

public class Diferenca {

	public static void main(String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número"));

		JOptionPane.showMessageDialog(null, "Diferença: " + (x - y));
	}

}
