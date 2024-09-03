package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;
public class ticketVentaReto
{ public static void main(String[] args) {
    double total = 0;
    String construcfinal = "";

    Scanner x = new Scanner(System.in);
    StringBuilder construc = new StringBuilder();

    System.out.print("¿Cuantos productos ha comprado hoy? : ");
    double dato = Double.parseDouble(x.nextLine());

    for (var i = 1; i <= dato; i++) {
        System.out.print("Ingrese Producto " + i + " : ");
        double suma = Double.parseDouble(x.nextLine());
        total += suma;
        construc.append("| Producto ").append(i).append(" = ").append("\t\t").append(suma).append("| \n");
        construc.append("|-------------------------|").append("\n");
        construcfinal = construc.toString();
    }

    System.out.print("¿Posee algun descuento? : ");
    String desc = x.nextLine();
    if(desc.equals("SI") || desc.equals("si")) {
        System.out.print("¿De cuanto es el descuento? : ");
        double cuantoDesc = Double.parseDouble(x.nextLine());

        var descTotal = total * (cuantoDesc/100); //calculo el descuento que le dieron
        var totalDesc = total - descTotal; //Calculo el total - el descuento
        var impuestos = totalDesc * (0.19); //IMPUESTOS AL 19%
        var totalImp = totalDesc + impuestos; //Cuanto fue el impuesto
        System.out.println("_____FACTURA DE VENTA_____");
        System.out.print(construcfinal);
        System.out.println("Su total de hoy es : $" + totalDesc + " sin impuestos y " + cuantoDesc + "% de descuento.");
        System.out.println("Su total de hoy es : $" + totalImp + " con impuestos y " + cuantoDesc + "% de descuento.");
    }
    else {
        var impuestos = total * (0.19); //IMPUESTOS AL 19%
        var totalImp = total + impuestos;
        System.out.println("_____FACTURA DE VENTA_____");
        System.out.print(construcfinal);
        System.out.println("Su total de hoy es : $" + total + " sin impuestos.");
        System.out.println("Su total de hoy es : $" + totalImp + " con impuestos.");
    }
}
}
