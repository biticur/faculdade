//OBJETIVO: receber os valores de uma equação de 2o grau e encontrar as duas raízes
import javax.swing.*;

public class Equacao {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A"));

        while(a == 0) {
            JOptionPane.showMessageDialog(null, "O coeficiente A não pode ser igual a 0");
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A novamente"));
        }

        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C"));
        double delta = Math.pow(b, 2) - (4 * a * c);
        double raiz = Math.sqrt(delta);
        double xUm = (-b + raiz) / (2 * a);
        double xDois = (-b - raiz) / (2 * a);

        JOptionPane.showMessageDialog(null, "x1 = " + xUm + "\nx2 = " + xDois);
    }
}

