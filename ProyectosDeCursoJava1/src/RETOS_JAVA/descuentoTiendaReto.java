package RETOS_JAVA; //IGNORAR ESTO
import javax.swing.*;

public class descuentoTiendaReto
{ public static void main(String[] args) {
    var articulos = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos articulos ha comprado en el dia"));

    var miembro = JOptionPane.showInputDialog(null, "Cuantos articulos ha comprado en el dia\nSI \\ NO");

    if (articulos >= 10 && (miembro.equals("si") || miembro.equals("SI"))) {
        JOptionPane.showMessageDialog(null, "SI TENDRA DESCUENTO VIP, FELICITACIONES.");
    } else {
        JOptionPane.showMessageDialog(null, "NO TENDRA DESCUENTO VIP, CONTINUE CON SU COMPRA.");
    }
}
}
