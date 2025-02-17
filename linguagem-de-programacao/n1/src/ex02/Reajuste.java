package ex02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Reajuste {

	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário a ser reajustado"));
		DecimalFormat df = new DecimalFormat(".##");
		
		JOptionPane.showMessageDialog(null, "Salário com aumento de 15%: R$" + df.format(salario + (salario * 0.15)));
	}

}
