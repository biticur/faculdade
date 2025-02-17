package ex07;

import javax.swing.JOptionPane;

public class Paralelepipedo {

	public static void main(String[] args) {
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo"));
		int l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do paralelepípedo"));
		int h = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepípedo"));
		
		JOptionPane.showMessageDialog(null, "Volume: " + (l * c * h));
	}

}
