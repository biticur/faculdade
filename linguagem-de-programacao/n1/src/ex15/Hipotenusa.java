package ex15;

import javax.swing.JOptionPane;

public class Hipotenusa {

	public static void main(String[] args) {
		int cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um dos catetos"));
		int cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o outro cateto"));
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		JOptionPane.showMessageDialog(null, "Hipotenusa: " + hipotenusa);
	}

}
