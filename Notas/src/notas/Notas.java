package notas;
//author @melinnarc
import javax.swing.JOptionPane;

public class Notas {

    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Escriba una nota del 1-20: "));
        if (nota >= 0 && nota <= 20) {
            if (nota >= 0 && nota <= 5) {
                JOptionPane.showMessageDialog(null, "Insuficiente");
            }
            if (nota > 5 && nota < 9) {
                JOptionPane.showMessageDialog(null, "Suficiente");
            } else if (nota >= 9 && nota < 13) {
                JOptionPane.showMessageDialog(null, "Bien");
            } else if (nota >= 13 && nota < 17) {
                JOptionPane.showMessageDialog(null, "Notable");
            } else if (nota >= 17 && nota < 21) {
                JOptionPane.showMessageDialog(null, "Sobresaliente");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Rango incorrecto solo se admite de 0-20");
        }

    }
}
