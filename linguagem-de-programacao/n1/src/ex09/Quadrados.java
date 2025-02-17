package ex09;

import javax.swing.JOptionPane;

public class Quadrados {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
		
		JOptionPane.showMessageDialog(null, "Soma de seus quadrados: " + (Math.pow(x, 2) + Math.pow(y, 2)));
	}

}
