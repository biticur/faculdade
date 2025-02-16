//OBJETIVO: receber um valor do usuário e aumentar em 1,3%
import javax.swing.*;

public class Poupanca {
    public static void main(String[] args){
        float deposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado"));

        JOptionPane.showMessageDialog(null, "Um mês na poupança: " + (deposito * 0.013));
    }
}
