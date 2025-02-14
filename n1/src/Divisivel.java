//OBJETIVO: receber um valor e dizer se é ou não divisível por 2 e 3
import javax.swing.*;

public class Divisivel {
    public static void verificarDivisao(int num){
        if(num % 2 == 0 && num % 3 == 0){
            JOptionPane.showMessageDialog(null, "O número digitado é divisível por 2 e 3");
        } else if(num % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número digitado é divisível apenas por 2");
        } else if (num % 3 == 0){
            JOptionPane.showMessageDialog(null, "O número digitado é divisível apenas por 3");
        } else {
            JOptionPane.showMessageDialog(null, "O número digitado não é divisível por 2 e nem por 3");
        }
    }

    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        verificarDivisao(num);
    }
}
