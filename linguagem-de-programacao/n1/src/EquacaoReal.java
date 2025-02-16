//OBJETIVO: receber os coeficientes de uma equação de 2o' grau, verificar se Delta é real e calcular as raízes
import javax.swing.*;
import java.text.DecimalFormat;

public class EquacaoReal {
    public static double delta(double a, double b, double c){
        double d = Math.pow(b, 2) - (4 * a * c);

        if(d < 0){
            JOptionPane.showMessageDialog(null, "Delta é menor que zero!");
            System.exit(0);
        }

        return d;
    }

    public static void Raizes(double raiz, double a, double b){
        double xUm = (-b + Math.sqrt(raiz)) / (2 * a);
        double xDois = (-b - Math.sqrt(raiz)) / (2 * a);
        DecimalFormat df = new DecimalFormat("#.#");

        JOptionPane.showMessageDialog(null, "x1 = " + df.format(xUm) + "\nx2 = " + df.format(xDois));
    }

    public static void main(String[] args){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A"));

        while(a == 0) {
            JOptionPane.showMessageDialog(null, "O coeficiente A não pode ser igual a 0");
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A novamente"));
        }

        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C"));
        double raiz = delta(a, b, c); //calcula Delta

        Raizes(raiz, a, b); //encontra as raízes
    }
}