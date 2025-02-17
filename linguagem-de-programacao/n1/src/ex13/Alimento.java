package ex13;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Alimento {

	public static void main(String[] args) {
		double comida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em kg"));
		DecimalFormat df = new DecimalFormat("0");
		
		JOptionPane.showMessageDialog(null, "A comida durará " + df.format(comida / 0.05) + " dia(s)");
	}

}
