package ex19;

import javax.swing.JOptionPane;

public class Maior {
	public static void exibirMaior(double x, double y) {
		if(x > y) {
			JOptionPane.showMessageDialog(null, "O primeiro número é o maior (" + x + ")");
		} else if(x < y) {
			JOptionPane.showMessageDialog(null, "O segundo número é o maior (" + y + ")");
		} else {
			JOptionPane.showMessageDialog(null, "Os números são iguais");
		}
	}
	
	public static void main(String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite mais um número"));
		
		exibirMaior(x, y);
	}

}
