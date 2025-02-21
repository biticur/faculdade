package ex20;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EquacaoReal {
	public static void calcularRaizes(int a, int b, double delta) {
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "x1 = " + df.format(x1) + "\nx2 = " + df.format(x2));
	}
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C"));
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0) {
			JOptionPane.showMessageDialog(null, "A equação não possui raízes reais");
			System.exit(0);
		}
		
		calcularRaizes(a, b, delta);
	}

}
