package ex30;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class SerieFracao {
	public static void fracao(double num) {
		DecimalFormat df = new DecimalFormat("0.000");
		
		if(num < 1) {
			return;
		} else {
			fracao(num - 1);
			System.out.println(df.format(1 / num));
		}
	}
	
	public static void main(String[] args) {
		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		
		fracao(num);
	}

}
