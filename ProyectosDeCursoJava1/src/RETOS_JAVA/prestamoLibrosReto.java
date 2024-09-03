package RETOS_JAVA; //IGNORAR ESTO
import javax.swing.*;
public class prestamoLibrosReto
{ public static void main(String[] args) {
    var idEst = JOptionPane.showInputDialog(null, "¿POSEE CREDENCIAL DE ESTUDIANTE?\n(SI O NO)");
    var kmEst = Integer.parseInt(JOptionPane.showInputDialog(null, "¿A CUANTOS KM VIVE ACTUALMENTE?"));

    if ((idEst.equals("SI") || idEst.equals("si")) || kmEst <= 3) {
        JOptionPane.showMessageDialog(null, "SI ES VALIDO PARA EL PRESTAMO.");
    } else {
        JOptionPane.showMessageDialog(null, "NO ES VALIDO PARA PEDIR PRESTAMO DE LIBROS EN ESTA BIBLIOTECA.");
    }
}
}
