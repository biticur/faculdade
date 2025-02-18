package ex29;

import javax.swing.JOptionPane;

public class Fatorial {
	public static int recursivaFatorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		} else {
			return num * recursivaFatorial(num - 1);
		}
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		recursivaFatorial(num);
		JOptionPane.showMessageDialog(null, "Fatorial: " + recursivaFatorial(num));
	}

}
