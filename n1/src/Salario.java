//OBJETIVO: calcular aumento de 15% do valor inserido pelo usuário

import javax.swing.*;

public class Salario {
    public static void main(String[] args){
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário a ser reajustado"));

        JOptionPane.showMessageDialog(null, "Salario com aumento de 15%: R$" + (salario + (salario * 0.15)));
    }
}
