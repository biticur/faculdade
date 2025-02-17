package ex04;

import javax.swing.JOptionPane;

public class Equacao {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C"));
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2" + x2);
	}

}
