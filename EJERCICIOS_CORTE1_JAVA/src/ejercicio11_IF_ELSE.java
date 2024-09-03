import java.util.*;

public class ejercicio11_IF_ELSE
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    /*
    Un almacen de escritorios hace los siguientes descuentos: Si el cliente compra menos de 5 unidades, se le da un descuento
    del 10% sobre la comrpa; Si el numero de unidades es mayor o igual a 5 pero menor a 10, se le otorga un 20%, y si son
    10 o mas se le da un 40%.
    Hacer un algoritmo que determine cuanto debe pagar un cliente si el valor de cada escritorio es de $800 000
     */
    final var precioEscritorio = 800000;
    final var descuento10 = 0.10;
    final var descuento20 = 0.20;
    final var descuento40 = 0.40;
    var precioDescuento = 0.0;
    var precio_a_pagar = 0.0;
    var precioFinal = 0.0;

    System.out.print("¿CUANTOS ESCRITORIOS DESEA COMPRAR? :");
    var cantidad = Integer.parseInt(x.nextLine());

    if (cantidad < 5) {
        precio_a_pagar = precioEscritorio * cantidad;
        precioDescuento = precio_a_pagar * descuento10;
        precioFinal = precio_a_pagar - precioDescuento;
    } else if (cantidad >= 5 && cantidad < 10) {
        precio_a_pagar = precioEscritorio * cantidad;
        precioDescuento = precio_a_pagar * descuento20;
        precioFinal = precio_a_pagar - precioDescuento;
    } else {
        precio_a_pagar = precioEscritorio * cantidad;
        precioDescuento = precio_a_pagar * descuento40;
        precioFinal = precio_a_pagar - precioDescuento;
    }


    System.out.printf("""
            \tCada escritorio cuesta %d
            \tSu precio a pagar seria = %.0f
            \tSe le da un descuento dependiendo de la cantidad que compro, el descuento seria = %.0f
            \tEl total de su compra con el descuento seria = %.0f
            """, precioEscritorio, precio_a_pagar, precioDescuento, precioFinal);
}
}
