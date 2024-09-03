import javax.swing.*;

public class ejercicio3ConIf {
    public static void main(String[] args) {
        int major;
        major = Integer.parseInt(JOptionPane.showInputDialog(null, "¿QUE MES ACTUALMENTE ES? \n" +
                "Digitalo en numero de meses = 1-12."));

        if (major == 1 || major == 2 || major == 12)
        {
            JOptionPane.showMessageDialog(null, "Actualmente es Invierno.");
        }
        else if (major == 3 || major == 4 || major == 5)
        {
            JOptionPane.showMessageDialog(null, "Actualmente es Primavera.");
        }
        else if (major == 6 || major == 7 || major == 8)
        {
            JOptionPane.showMessageDialog(null, "Actualmente es Verano.");
        }
        else if (major == 9 || major == 10 || major == 11)
        {
            JOptionPane.showMessageDialog(null, "Actualmente es Otoño.");
        }
        else { JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO."); }
    }
}