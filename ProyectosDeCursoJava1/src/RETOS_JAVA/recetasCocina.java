package RETOS_JAVA; //IGNORAR ESTO
import javax.swing.*;

public class recetasCocina
{
    public static void main(String[] args)
    {
        var nombre = JOptionPane.showInputDialog(null , "¿CUAL ES EL NOMBRE DE LA RECETA DE COCINA?");
        var ingredientes = JOptionPane.showInputDialog(null , "¿CUALES SON LOS INGREDIENTES?");
        var tiempo = Integer.parseInt(JOptionPane.showInputDialog(null , "INGRESA EL TIEMPO DE PREPARACION EN MINUTOS"));
        var dificultad = JOptionPane.showInputDialog(null , "INGRESA LA DIFICULTAD\n(FACIL/MEDIO/DIFICIL)");

        JOptionPane.showMessageDialog(null , "La receta de " + nombre +
                "\nIngredientes : " + ingredientes +
                "\nTiempo de coccion : " + tiempo + " min" +
                "\nDificultad : " + dificultad);

    }
}
