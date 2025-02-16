//OBJETIVO; receber dois valores do usuário, calcular seus quadrados e somá-los
import javax.swing.*;

public class Quadrados {
    public static void main(String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));

        JOptionPane.showMessageDialog(null, "Soma dos quadrados: " + (Math.pow(x, 2) + Math.pow(y, 2)));
    }
}
