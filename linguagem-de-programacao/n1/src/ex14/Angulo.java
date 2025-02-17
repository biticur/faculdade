package ex14;

import javax.swing.JOptionPane;

public class Angulo {

	public static void main(String[] args) {
		int angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um dos ângulos do triângulo"));
		int angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do outro ângulo"));
		
		JOptionPane.showMessageDialog(null, "O terceiro ângulo tem " + (180 - (angulo1 + angulo2) + "°"));
	}

}
