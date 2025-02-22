package ex40;

import javax.swing.JOptionPane;

public class CaixaEletronico {
	public static int[] carregarNotas(int[] notas) {
		for(int i = 0; i < notas.length; i++) {
			notas[i] *= 100;
		}
		
		return notas;
	}
	
	public static void retirarNotas(int[] qtd, int[] notas) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a sacar"));
		int saque = 0;
		for(int i = qtd.length - 1; i >= 0; i--) {
			if(valor >= notas[i] && qtd[i] > 0) {
				while(saque + notas[i] <= valor && qtd[i] > 0) {
					saque += notas[i];
					qtd[i] -= 100;
				}
				if(saque == valor) {
					System.out.println("Valor sacado: " + saque);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int opc = 0;
		int[] notas = {2, 5, 10, 20, 50, 100};
		int[] qtd = new int[6];
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n1 - Carregar notas\n2 - Retirar notas\n3 - Estatística\n9 - Fim"));
			switch(opc) {
				case 1: qtd = carregarNotas(notas);
					break;
				case 2: retirarNotas(qtd, notas);
					break;
				case 9: System.exit(0);
				default: JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
			}
		}

	}

}
