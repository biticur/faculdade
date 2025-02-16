package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		
		op.mil();
		op.dezMil();
		op.cemMil();
	}

}
