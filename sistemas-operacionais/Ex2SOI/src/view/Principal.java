package view;

import controller.OperacoesController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		
		
		String texto = JOptionPane.showInputDialog("Insira um texto com as palavras separadas por ';'\nExemplo: Sistemas;Operacionais;I");
		op.dividirTexto(texto);
	}

}
