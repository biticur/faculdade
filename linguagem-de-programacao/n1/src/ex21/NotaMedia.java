package ex21;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class NotaMedia {
	public static void mediaAritmetica(double n1, double n2, double n3, double n4) {
		double media = (n1 + n2 + n3 + n4) / 4;
		DecimalFormat df = new DecimalFormat("0.0");
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "MÉDIA: " + df.format(media) + "\nSITUAÇÃO: APROVADO");
		} else if (media >= 3) {
			JOptionPane.showMessageDialog(null, "MÉDIA: " + df.format(media) + "\nSITUAÇÃO: EXAME");
		} else {
			JOptionPane.showMessageDialog(null, "MÉDIA: " + df.format(media) + "\nSITUAÇÃO: RETIDO");
		}
	}
	
	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2a nota"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3a nota"));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4a nota"));
		
		mediaAritmetica(n1, n2, n3, n4);
	}

}
