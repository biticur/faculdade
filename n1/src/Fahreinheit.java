//OBJETIVO: receber do usuário a temperatura em Celsius e converter para Fahrenheit
import javax.swing.*;

public class Fahreinheit {
    public static void main(String[] args){
        float celsius = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));

        JOptionPane.showMessageDialog(null, "Fahrenheit: " + ((9 * celsius + 160) / 5) + "°F");
    }
}
