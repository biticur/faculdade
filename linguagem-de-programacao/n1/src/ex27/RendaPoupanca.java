package ex27;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class RendaPoupanca {
	public static void poupanca() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));
		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "Total em um mês: R$" + df.format(valor + (valor * 0.03)));
	}
	
	public static void rendaFixa() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));
		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "Total em um mês: R$" + df.format(valor + (valor * 0.05)));
	}
	
	public static void main(String[] args) {
		int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de investimento\n1 - Poupança\n2 - Renda fixa"));
		
		switch(opc) {
		case 1: poupanca();
			break;
		case 2: rendaFixa();
			break;
		default: JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
	}

}
