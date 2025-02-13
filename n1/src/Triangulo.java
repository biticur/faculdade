//OBJETIVO: calcular a área de um triângulo com base nos valores inseridos pelo usuário
import javax.swing.*;

public class Triangulo {
    public static void main (String[] args){
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo"));

        JOptionPane.showMessageDialog(null, "Área: " + ((base + altura) / 2));
    }
}
