package ENTRADA_CONSOLA; //IGNORAR ESTO
import java.util.*;

public class convertirDatos {
    public static void main(String[] args) {
        //CONVERTIR DATOS EN CONSOLA
        var x = new Scanner(System.in);

        System.out.print("INGRESE UN VALOR ENTERO : ");
        var enteroCOMOunSTRING = x.nextLine(); //aca se recibe como un string.
        var entero = Integer.parseInt(enteroCOMOunSTRING); //aca se convierte de string a entero.
        System.out.println("entero = " + entero);

        System.out.print("INGRESE UN VALOR FLOTANTE : ");
        var flotante = Float.parseFloat(x.nextLine()); //para ahorrar una linea
        System.out.println("flotante = " + flotante);

        /*
        Existe tambien los:
        Parse.parseDouble();
        Boolean.parseBoolean();
         */
    }
}
