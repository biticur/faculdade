package ex17;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Gasolina {
	public static double calcularGasolina(int tempo, int velocidade) {
		double distancia = velocidade * tempo / 60;
		
		return distancia / 12;
	}
	
	public static void main(String[] args) {
		int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite em minutos o tempo da viagem"));
		int velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média em km/h do veículo"));
		DecimalFormat df = new DecimalFormat("0.00");
		double gasolina = calcularGasolina(tempo, velocidade);
		
		JOptionPane.showMessageDialog(null, "Foram consumidos " + df.format(gasolina) + "l de combustível");
	}

}
