//OBJETIVO: receber o ano de nascimento do usuário, calcular sua idade e quantos anos terá em 17 anos
import javax.swing.*;
import java.time.LocalDate;

public class Idade {
    public static void main(String[] args){
        int nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu"));
        int ano = LocalDate.now().getYear();
        JOptionPane.showMessageDialog(null, "Você tem " + (ano - nasc) + " anos e terá " + (ano + 17 - nasc) + " daqui 17 anos");
    }
}
