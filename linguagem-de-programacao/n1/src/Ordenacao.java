//OBJETIVO: receber quatro números, sendo os três primeiros obrigatoriamente em ordem crescente, e exibir os quatro em ordem crescente
import javax.swing.*;

public class Ordenacao {
    public static void ordenar(int n1, int n2, int n3, int n4) {
        if (n1 > n4) {
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n4 + ", " + n1 + ", " + n2 + ", " + n3);
        } else if (n2 > n4) {
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n4 + ", " + n2 + ", " + n3);
        } else if (n3 > n4) {
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n2 + ", " + n4 + ", " + n3);
        } else {
            JOptionPane.showMessageDialog(null, "Em ordem crescente: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
        }
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior"));

        while (num2 <= num1) {
            JOptionPane.showMessageDialog(null, "O número deve ser maior que o anterior!");
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior"));
        }

        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que o anterior"));

        while (num3 <= num2) {
            JOptionPane.showMessageDialog(null, "O número deve ser maior que o anterior!");
            num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que o anterior"));
        }

        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Agora digite qualquer número"));

        ordenar(num1, num2, num3, num4);
    }
}