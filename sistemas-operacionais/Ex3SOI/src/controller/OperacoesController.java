package controller;

public class OperacoesController {
	public void parOuImpar(int[] vetor) {
		for(int i: vetor) {
			if(i % 2 != 0) {
				System.out.println(i + " é ímpar porque não é múltiplo de 2");
			} else if(i % 10 == 0){
				System.out.println(i + " é par e múltiplo de 10");
			}
		}
	}
}
