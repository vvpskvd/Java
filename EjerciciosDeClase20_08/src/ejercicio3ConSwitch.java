import javax.swing.*;

public class ejercicio3ConSwitch {
    public static void main(String[] args) {
        int major;
        major = Integer.parseInt(JOptionPane.showInputDialog(null, "¿QUE MES ACTUALMENTE ES? \n" +
                "Digitalo en numero de meses = 1-12."));

        switch (major) {
            case 1, 2, 12:
                JOptionPane.showMessageDialog(null, "Actualmente es Invierno.");
                break;
            case 3, 4, 5:
                JOptionPane.showMessageDialog(null, "Actualmente es Primavera.");
                break;
            case 6, 7, 8:
                JOptionPane.showMessageDialog(null, "Actualmente es Verano.");
                break;
            case 9, 10, 11:
                JOptionPane.showMessageDialog(null, "Actualmente es Otoño.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
                break;
        }
    }
}