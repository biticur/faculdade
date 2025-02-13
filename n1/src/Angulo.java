//OBJETIVO: receber o valor de dois ângulos de um triângulo e calcular o terceiro ângulo
import javax.swing.*;

public class Angulo {
    public static void main(String[] args){
        int priAngulo = Integer.parseInt(JOptionPane.showInputDialog("Insira um dos ângulos do triângulo"));
        int segAngulo = Integer.parseInt(JOptionPane.showInputDialog("Insira mais um ângulo"));

        JOptionPane.showMessageDialog(null, "O terceiro ângulo tem " + (180 - (priAngulo + segAngulo)) + "°");
    }
}
