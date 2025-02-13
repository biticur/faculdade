//OBJETIVO: receber horas, valor por hora, desconto, dependentes; criar um método para calcular o salário bruto e outro método para calcular o líquido
import javax.swing.*;
import java.text.DecimalFormat;

public class Liquido {
    public static float CalcularSalarioBruto(int hora, float valorHora){
        return hora * valorHora;
    }

    public static void CalcularSalarioLiquido(float salario, int dp, float desconto){
        float liquido = salario - (salario * desconto) + (dp * 100);
        DecimalFormat df = new DecimalFormat();

        JOptionPane.showMessageDialog(null, "Salário a ser recebido: R$" + df.format(liquido));
    }

    public static void main(String[] args){
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas"));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor por hora"));
        int dp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes"));
        float desconto = Float.parseFloat(JOptionPane.showInputDialog("Digite o percentual de desconto"));

        desconto = desconto / 100; //Para calcular como porcentagem

        float salario = CalcularSalarioBruto(hora, valorHora);
        CalcularSalarioLiquido(salario, dp, desconto);
    }
}
