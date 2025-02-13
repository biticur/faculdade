//OBJETIVO: receber o raio de um círculo e calcular seu comprimento
import javax.swing.*;
import java.text.DecimalFormat;

public class Circunferencia {
    public static void main(String[] args){
    float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio da circunferência"));
    DecimalFormat df = new DecimalFormat("#.##");

    JOptionPane.showMessageDialog(null, "Comprimento da circunferência: " + df.format(2 * Math.PI * raio));
    }
}
