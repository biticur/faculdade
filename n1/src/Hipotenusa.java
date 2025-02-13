//OBJETIVO: receber os dois catetos de um triângulo retângulo e calcular a hipotenusa
import javax.swing.*;
import java.text.DecimalFormat;

public class Hipotenusa {
    public static void main(String[] args){
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira um dos catetos do triângulo"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o outro cateto"));
        double hipotenusa = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
        DecimalFormat df = new DecimalFormat("#.##");

        JOptionPane.showMessageDialog(null, "A hipotenusa é: " + df.format(hipotenusa));
    }
}
