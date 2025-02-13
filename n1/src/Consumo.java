//OBJETIVO: receber quantos kg de comida há e calcular por quantos dias durará com um consumo diário de 50g
import javax.swing.*;

public class Consumo {
    public static void main(String[] args){
        float alimento = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de alimento em Kg"));
        float quilos = alimento * 1000; //transforma a entrada em quilos
        int consumo = 50; //em gramas
        JOptionPane.showMessageDialog(null, "A comida durará " + (quilos / consumo) + " dias");
    }
}
