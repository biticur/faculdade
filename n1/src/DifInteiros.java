//OBJETIVO: receber dois valores inteiros e calcular a diferença do maior pelo menor
import javax.swing.*;

public class DifInteiros {
    public static void subtracao(int x, int y){
        if(x > y){
            JOptionPane.showMessageDialog(null, "Diferença do maior pelo menor: " + (x - y));
        } else {
            JOptionPane.showMessageDialog(null, "Diferença do maior pelo menor: " + (y - x));
        }
    }

    public static void main(String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));

        subtracao(x, y);
    }
}
