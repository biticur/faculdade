//OBJETIVO: receber dois valores reais e mostrar o maior deles
import javax.swing.*;

public class Maior {
    public static void comparar(float x, float y){
        if(x > y){
            JOptionPane.showMessageDialog(null, "O maior número digitado é o primeiro (" + x + ")");
        } else if(y > x){
            JOptionPane.showMessageDialog(null, "O maior número digitado é o segundo (" + y + ")");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }
    }

    public static void main(String[] args){
        float x = Float.parseFloat(JOptionPane.showInputDialog("Digite um número real"));

        while(x < 0){
            JOptionPane.showMessageDialog(null, "O número deve ser real!");
            x = Float.parseFloat(JOptionPane.showInputDialog("Digite um número real"));
        }
        float y = Float.parseFloat(JOptionPane.showInputDialog("Digite mais um número real"));

        while(y < 0){
            JOptionPane.showMessageDialog(null, "O número deve ser real!");
            y = Float.parseFloat(JOptionPane.showInputDialog("Digite mais um número real"));
        }

        comparar(x, y);
    }
}
