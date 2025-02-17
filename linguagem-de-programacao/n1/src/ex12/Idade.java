package ex12;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		int nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu"));
		int atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
		int idade = atual - nasc;
		
		JOptionPane.showMessageDialog(null, "Você tem " + (idade) + " anos de idade e terá " + (idade + 17) + " daqui 17 anos");
	}

}
