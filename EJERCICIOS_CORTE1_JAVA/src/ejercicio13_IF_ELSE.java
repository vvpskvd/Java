import java.util.*;

public class ejercicio13_IF_ELSE
{ public static void main(String[] args) {
    final var precioManzana = 500;
    var total = 0;
    var totalConDescuento = 0.0;
    var descuento = 0.0;

    Scanner x = new Scanner(System.in);
    /*
    UNA FRUTERIA OFRECE MANZANAS CON DESCUENTO SEGUN LA TABLA:
                # MANZANAS                  DESCUENTO
            0 - 2                               0%
            3 - 5                               10%
            6 - 10                              15%
            11 EN ADELANTE                      20%

     DETERMINAR CUANTO PAGARIA UNO POR COMPRAR MANZANAS
     */

    System.out.print("¿Cuantas manzanas desea llevar? : ");
    var cantidad = Integer.parseInt(x.nextLine());

    if (cantidad > 0 && cantidad <= 2) {
        total = precioManzana*cantidad;
        System.out.println("Su total sin descuento es : " + total);
    }
    else if (cantidad >= 3 && cantidad <=5) {
        total = precioManzana*cantidad;
        descuento = total * 0.10;
        totalConDescuento = total - descuento;
        System.out.println("Su total es : " + total);
        System.out.println("Su total con el 10% de descuento es : $" + (int) totalConDescuento);
    }
    else if (cantidad >= 6 && cantidad <=10) {
        total = precioManzana*cantidad;
        descuento = total * 0.15;
        totalConDescuento = total - descuento;
        System.out.println("Su total es : " + total);
        System.out.println("Su total con el 15% de descuento es : $" + (int) totalConDescuento);
    }
    else {
        total = precioManzana*cantidad;
        descuento = total * 0.20;
        totalConDescuento = total - descuento;
        System.out.println("Su total es : " + total);
        System.out.println("Su total con el 20% de descuento es : $" + (int) totalConDescuento);
    }
}
}
