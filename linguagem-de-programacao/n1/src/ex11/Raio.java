package ex11;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Raio {

	public static void main(String[] args) {
		int r = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio da circunferência"));
		DecimalFormat df = new DecimalFormat(".##");
		
		JOptionPane.showMessageDialog(null, "Comprimento: " + df.format(2 * Math.PI * r));
	}

}
