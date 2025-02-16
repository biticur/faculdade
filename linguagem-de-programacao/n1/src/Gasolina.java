//OBJETIVO: receber do usuário o tempo e a velocidade média de uma viagem e calcular a quantidade de litros consumidos (12km/l)
import javax.swing.*;
import java.text.DecimalFormat;

public class Gasolina {
    public static void litrosGastos(double h, double v){
        double distancia = h * v;
        double combustivel = distancia / 12;
        DecimalFormat df = new DecimalFormat("#.##");

        JOptionPane.showMessageDialog(null, "O veículo consumiu " + df.format(combustivel) + " litros de combustível");
    }

    public static void main(String[] args){
        int min = Integer.parseInt(JOptionPane.showInputDialog("Digite em minutos o tempo do percurso"));
        double velocidade = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade média em km/h"));
        double horas = min / 60.0; //converte o tempo em horas

        litrosGastos(horas, velocidade); //calcula em litros o combustível consumido
    }
}
