package ex06;

import javax.swing.JOptionPane;

public class Troca {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
		int aux = x;
		
		x = y;
		y = aux;
		
		JOptionPane.showMessageDialog(null, "Valores trocados!\nx = " + x + "\ny = " + y);
	}
}
