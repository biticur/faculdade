import javax.swing.*;

public class MediaArit {
    public static void calcularMedia(double n1, double n2, double n3, double n4){
        double media = (n1 + n2 + n3 + n4) / 4;

        if(media >= 6){
            JOptionPane.showMessageDialog(null, "APROVADO");
        } else if(media < 3){
            JOptionPane.showMessageDialog(null, "RETIDO");
        } else {
            JOptionPane.showMessageDialog(null, "EXAME");
        }
    }

    public static void main(String[] args){
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3a nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2a nota"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4a nota"));

        calcularMedia(nota1, nota2, nota3, nota4);
    }
}
