package view;

import controller.OperacoesController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		
		int length = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos índices o vetor terá"));
		
		while(length > 100 || length <= 0) {
			JOptionPane.showMessageDialog(null, "O vetor deve ter um índice maior que 0 e só pode conter até 100");
			length = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente quantos índices o vetor terá"));
		}
		
		System.out.println("Tamanho do vetor: " + length);
		
		int[] vetor = new int[length];
		
		for(int i = 0; i < length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição [" + i + "]"));
		}
		
		op.parOuImpar(vetor);
	}

}
