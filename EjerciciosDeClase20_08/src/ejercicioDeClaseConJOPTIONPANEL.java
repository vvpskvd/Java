import javax.swing.*;

public class ejercicioDeClaseConJOPTIONPANEL {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seleccione una tarifa \n" +
                "1 - Carro. \n" +
                "2 - Moto. \n" +
                "3 - Camion. \n" +
                "4 - Bus.");
        int major = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion"));

        switch(major) {
            case 1:
                JOptionPane.showMessageDialog(null, "LA TARIFA TOTAL ES $5000");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "LA TARIFA TOTAL ES $10.000");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "LA TARIFA TOTAL ES $15.000");
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION NO VALIDA.");
        }
    }
}
