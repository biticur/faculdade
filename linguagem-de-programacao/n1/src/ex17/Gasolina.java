package ex17;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Gasolina {
	public static void calcularGasolina(int tempo, int velocidade) {
		double distancia = velocidade * tempo / 60;
		double combustivel = distancia / 12;
		DecimalFormat df = new DecimalFormat("0.00");
		
		JOptionPane.showMessageDialog(null, "Foram consumidos " + df.format(combustivel) + "l de combustível");
	}
	
	public static void main(String[] args) {
		int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite em minutos o tempo da viagem"));
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média em km/h do veículo"));
		
		calcularGasolina(tempo, velocidade);
	}

}
