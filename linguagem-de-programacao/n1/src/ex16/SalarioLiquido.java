package ex16;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class SalarioLiquido {
	public static double calcularSalarioBruto(int horas, double valorHora) {
		return horas * valorHora;
	}
	
	public static void calcularSalarioLiquido(double bruto, double desconto, int dp) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "Salário: R$" + df.format(bruto - (bruto * desconto) + dp));
	}
	
	public static void main(String[] args) {
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora"));
		double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto")) / 100;
		int dp = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes")) * 100;
		double bruto = calcularSalarioBruto(horas, valorHora);
		
		calcularSalarioLiquido(bruto, desconto, dp);
	}

}
