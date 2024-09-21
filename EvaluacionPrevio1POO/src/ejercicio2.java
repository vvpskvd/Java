import static java.lang.System.*;
import java.util.Scanner;

public class ejercicio2
{ public static void main(String[] args) {
    /*
    Una persona realiza una compra por N valor en un establecimiento, tiene las siguientes formas de pago.

                 Forma de Pago                      Porcentaje de descuento
        Contado                             Tiene un descuento del 20%
        Credito a 15 dias                   Tiene un incremento del 10% por financiacion
        Credito a 30 dias                   tiene un incremento del 15% por financiacion

     Realizar un algoritmo en Java que permita determinar el valor por pagar para el cliente segun la forma de pago seleccionada
     Se le debe indicar el porcentaje de descuento y el valor descontado, el porcentaje de financiacion y el valor de incremento por financiamiento.
     Ademas del neto que ga de pagar por su compra
     */
    Scanner x = new Scanner(in);

    out.print("""
            ¿Como desea pagar el producto?
            -> Opcion 1 : Contado.
            -> Opcion 2 : Credito a 15 dias.
            -> Opcion 3 : Credito a 30 dias.
            ==>>\s""");
    var formaPago = Integer.parseInt(x.nextLine());

    out.print("¿Cuanto es el total que va a pagar? = ");
    var precio_a_Calcular = Double.parseDouble(x.nextLine());

    x.close();

    if(precio_a_Calcular > 0) {
        if (formaPago == 1) {
            out.println("\nUD SELECCIONO LA OPCION 1 = CONTADO.");
            var descuento = (precio_a_Calcular * 0.20);
            var descuentoTotal = precio_a_Calcular - descuento;
            out.printf("""
                    -----------------------------------------------------------
                    Su producto de = $%.2f Pesos Colombianos.
                    Tiene descuento de = $%.2f Pesos Colombianos.
                    Y su total del producto quedaria a = $%.2f Pesos Colombianos.
                    \n""", precio_a_Calcular, descuento, descuentoTotal);
        }
        else if (formaPago == 2) {
            out.println("\nUD SELECCIONO LA OPCION 2 = CREDITO A 15 DIAS.");
            var incremento = (precio_a_Calcular * 0.10);
            var incrementoTotal = precio_a_Calcular + incremento;
            out.printf("""
                    -----------------------------------------------------------
                    Su producto de = $%.2f Pesos Colombianos.
                    Tiene un incremento del 10 por ciento de = $%.2f Pesos Colombianos.
                    Y su total del producto quedaria a = $%.2f Pesos Colombianos.
                    \n""", precio_a_Calcular, incremento, incrementoTotal);
        }
        else if (formaPago == 3) {
            out.println("\nUD SELECCIONO LA OPCION 3 = CREDITO A 30 DIAS.");
            var incremento = (precio_a_Calcular * 0.15);
            var incrementoTotal = precio_a_Calcular + incremento;
            out.printf("""
                    -----------------------------------------------------------
                    Su producto de = $%.2f Pesos Colombianos.
                    Tiene un incremento del 15 por ciento de = $%.2f Pesos Colombianos.
                    Y su total del producto quedaria a = $%.2f Pesos Colombianos.
                    \n""", precio_a_Calcular, incremento, incrementoTotal);
        }
        else {
            out.println("La opcion seleccionada no es valida, reintente nuevamente...");
        }
    }
    else {
        out.println("Precio incalculable, menor a 0, reintente nuevamente...");
    }
}
}