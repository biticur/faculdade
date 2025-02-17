package ex01;

import javax.swing.JOptionPane;

public class Quadrado {
	public static void main(String[] args) {
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho de um dos lados do quadrado"));
		
		JOptionPane.showMessageDialog(null, "Área: " + (lado * lado));
	}
}
