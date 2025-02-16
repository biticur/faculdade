//OBJETIVO: calcular a área de um quadrado com base no valor de um dos lados inserido pelo usuário

import javax.swing.*;

public class Area {
    public static void main (String[] args){
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho de um dos lados do quadrado"));

        JOptionPane.showMessageDialog(null, "Área: " + (lado * lado));
    }
}
