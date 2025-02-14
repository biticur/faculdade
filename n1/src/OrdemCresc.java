//OBJETIVO: receber dois valores diferentes e exibí-los em ordem crescente
import javax.swing.*;

public class OrdemCresc {
    public static void ordenar(int x, int y){
        if(x > y){
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + x + ", " + y);
        } else {
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + y + ", " + x);
        }
    }

    public static void main(String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número diferente do anterior"));

        while(y == x){
            JOptionPane.showMessageDialog(null, "O número deve ser diferente do anterior!");
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número diferente"));
        }

        ordenar(x, y);
    }
}
