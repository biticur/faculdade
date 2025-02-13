//OBJETIVO: receber os valores de um paralelepípedo e calcular seu volume
import javax.swing.*;

public class Retangulo {
    public static void main(String[] args){
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo em centímetros"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do paralelepípedo em centímetros"));
        int h = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepípedo em centímetros"));

        JOptionPane.showMessageDialog(null, "Volume: " + (c * l * h));
    }
}
