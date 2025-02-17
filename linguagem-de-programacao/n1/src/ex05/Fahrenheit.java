package ex05;

import javax.swing.JOptionPane;

public class Fahrenheit {

	public static void main(String[] args) {
		double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
		
		JOptionPane.showMessageDialog(null, "Em Fahrenheit: " + ((9 * celsius + 160) / 5) + "°F");
	}

}
