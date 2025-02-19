package ex31;

import javax.swing.JOptionPane;

public class Tabuada {
	public static void calcularTabuada(int num, int multiplicador) {
		if(multiplicador > 10) {
			return;
		} else {
			System.out.println(num + " x " + multiplicador + " = " + (num * multiplicador));
			calcularTabuada(num, multiplicador + 1);
		}
	}
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int multiplicador = 1;
		System.out.println("Tabuada\n=============");
		calcularTabuada(num, multiplicador);
	}

}
