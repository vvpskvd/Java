import java.util.*;

public class ejercicio9_IF_ELSE
{ public static void main(String[] args) {
    /*
    HACER UN ALGORITMO QUE ENTRE LA ORDENADA (Y) Y LA ABSCISA (X) DE UN PUNTO DE UN PLANO CARTESIANO
    Y DETERMINE SI PERTENECE O NO A LA RECTA DE Y = 3*X+5
     */
    Scanner x = new Scanner(System.in);

    System.out.print("DIGITA LA ORDENADA (Y) : ");
    var datoY = Double.parseDouble(x.nextLine());
    System.out.print("DIGITA LA ABSCISA (X) : ");
    var datoX = Double.parseDouble(x.nextLine());

    var resultado = (datoY == (3 * datoX) + 5) ? "SI PERTENECE." : "NO PERTENECE.";

    System.out.println(resultado);

}
}
