package ex26;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class VelocidadeMedia {
	public static void calcularVelocidade(int volta, double distancia, double tempo) {
		double velocidade = distancia / tempo;
		double voltaCompleta = distancia * 1000 / volta;
		DecimalFormat df =  new DecimalFormat("0");
		
		JOptionPane.showMessageDialog(null, "Velocidade média: " + df.format(velocidade) + "km/h\nUma volta possui " + df.format(voltaCompleta) + "m");
	}
	
	public static void main(String[] args) {
		int volta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas completadas"));
		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite em metros a distância total percorrida")) / 1000;
		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite em minutos a duração do percurso")) / 60;
		
		calcularVelocidade(volta, distancia, tempo);
	}

}
