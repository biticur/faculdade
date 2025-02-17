package ex24;

import javax.swing.JOptionPane;

public class Divisao {
	public static void verificarDivisao(int num) {
		if(num % 2 == 0 && num % 3 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é divisível por 2 e por 3");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + num + " não é divisível por 2 e/ou por 3");			
		}
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		verificarDivisao(num);
	}

}
