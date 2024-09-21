import java.util.*;
import static java.lang.System.*;

public class ejercicio9_FOR_WHILE
{ public static void main(String[] args) {
    /*
    Elaborar un algoritmo que encuentre el mayor valor entre un grupo de datos positivos
     */
    Scanner x = new Scanner(System.in);
    var numMayor = Integer.MIN_VALUE;

    out.print("¿Ingrese cuantos numeros desea ingresar? = ");
    var cantidad = Integer.parseInt(x.nextLine());

    for (int i = 0; i < cantidad; i++) {
        out.print("Ingrese el dato #" + (i+1) + " = ");
        var num = Integer.parseInt(x.nextLine());

        if (num > numMayor) {
            numMayor = num;
        }
    }
    out.println("De los " + cantidad + " datos ingresados, el numero mayor es = " + numMayor);
}
}
