package controller;

public class OperacoesController {
	public void dividirTexto(String texto) {
		String[] vetorPalavras = texto.split(";");
		
		System.out.println(texto);
		System.out.println("O texto digitado possui " + vetorPalavras.length + " palavras");
	}
}
