//OBJETIVO: receber os valores de uma equação de 2o grau e encontrar as duas raízes
import javax.swing.*;

public class Equacao {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
        int delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Delta não é real!");
            System.exit(0);
        } else {
            double raiz = Math.sqrt(delta);
            double xUm = (-b + raiz) / (2 * a);
            double xDois = (-b - raiz) / (2 * a);

            JOptionPane.showMessageDialog(null, "x1 = " + xUm + "\nx2 = " + xDois);
        }
    }
}
