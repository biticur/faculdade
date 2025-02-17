package ex23;

import javax.swing.JOptionPane;

public class Ordenacao {
	public static void reordenar(int a, int b, int c, int d) {
		if(d > c) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + a + ", " + b + ", " + c + ", " + d);
		} else if(d > b && d < c) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + a + ", " + b + ", " + d + ", " + c);
		} else if(d > a && d < b) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + a + ", " + d + ", " + b + ", " + c);
		} else {
			JOptionPane.showMessageDialog(null, "Em ordem crescente: " + d + ", " + a + ", " + b + ", " + c);
		}
	}
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número"));
		
		while(b >= a) {
			JOptionPane.showMessageDialog(null, "O número deve ser maior que o anterior");
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número novamente"));

		}
		
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro número"));
		
		while(c >= b) {
			JOptionPane.showMessageDialog(null, "O número deve ser maior que o anterior");
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite um terceiro número novamente"));
		}
		
		int d = Integer.parseInt(JOptionPane.showInputDialog("Agora digite um número aleatório"));
		
		reordenar(a, b, c, d);
	}

}
