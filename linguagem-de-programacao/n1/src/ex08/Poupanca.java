package ex08;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Poupanca {

	public static void main(String[] args) {
		double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
		DecimalFormat df = new DecimalFormat(".##");
		
		JOptionPane.showMessageDialog(null, "Em um mês você terá: R$" + df.format(deposito + (deposito * 0.013)));
	}

}
