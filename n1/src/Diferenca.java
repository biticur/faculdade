//OBJETIVO: receber dois valores reais do usuário e calcular a diferença
import javax.swing.*;

public class Diferenca {
    public static void main(String[] args){
        float x = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));

        while(x < 0) {
            JOptionPane.showMessageDialog(null, "Digite apenas números reais!");
            x = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
        }
        float y = Float.parseFloat(JOptionPane.showInputDialog("Digite mais um número"));

        while(y < 0){
            JOptionPane.showMessageDialog(null, "Digite apenas números reais!");
            y = Float.parseFloat(JOptionPane.showInputDialog("Digite mais um número"));
        }

        if(x > y){
            JOptionPane.showMessageDialog(null, "Diferença: " + (x - y));
        } else {
            JOptionPane.showMessageDialog(null, "Diferença: " + (y - x));
        }
    }
}
