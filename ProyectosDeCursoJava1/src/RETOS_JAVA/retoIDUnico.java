package RETOS_JAVA; //IGNORAR ESTO
import javax.swing.*;
import java.util.*;

public class retoIDUnico
{
    public static void main(String[] args)
    {
        Random x = new Random();

        var nombre = JOptionPane.showInputDialog(null , "DIGITE SU 1° NOMBRE");
        var apellido = JOptionPane.showInputDialog(null , "DIGITE SU 1° APELLIDO");
        var fecha = JOptionPane.showInputDialog(null , "DIGITE SU AÑO DE NACIMIENTO");

        int id = x.nextInt(9999) +1;
        var numID = Integer.toString(id);
        int idLength = numID.length();

        var xx = new StringBuilder(numID); //se convierte a objeto stringbuilder en la variable xx el numID

        while (idLength < 4) {
             xx.insert(0, '0');
            idLength++;
        }

        var nombreID = nombre.toUpperCase().substring(0, 2);
        var apellidoID = apellido.toUpperCase().substring(0, 2);
        var fechaID = fecha.substring(2);

        System.out.println("Su ID sera = " + nombreID + apellidoID + fechaID + xx);
    }
}