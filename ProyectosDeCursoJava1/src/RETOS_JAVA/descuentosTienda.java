package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class descuentosTienda
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    var totalDescuento = 0.0;
    var totalPagar = 0.0;

    System.out.print("INGRESE EL MONTO TOTAL DE SU COMPRA : ");
    var totalCompra = Double.parseDouble(x.nextLine());

    System.out.print("INGRESE \"SI\" O \"NO\" SI ES O NO MIEMBRO : ");
    var esMiembro = x.nextLine();

    if (totalCompra > 1000 && (esMiembro.equals("SI") || esMiembro.equals("si"))) {
        totalDescuento = totalCompra * 0.10;
        totalPagar = totalCompra - totalDescuento;
        System.out.printf("""
                \n\tSI CUMPLE LOS REQUISITOS PARA DESCUENTO DEL 10 POR CIENTO.
                \tSU TOTAL SIN DESCUENTO ES : %.0f
                \tSU DESCUENTO ES DE : $%.0f
                \tEL TOTAL DE SU COMPRA CON DESCUENTO ES : $%.0f
                """, totalCompra, totalDescuento, totalPagar);
    }
    else if (esMiembro.equals("SI") || esMiembro.equals("si")) {
        totalDescuento = totalCompra * 0.05;
        totalPagar = totalCompra - totalDescuento;
        System.out.printf("""
                \n\tSI CUMPLE LOS REQUISITOS PARA DESCUENTO DEL 5 POR CIENTO.
                \tSU TOTAL SIN DESCUENTO ES : %.0f
                \tSU DESCUENTO ES DE : $%.0f
                \tEL TOTAL DE SU COMPRA CON DESCUENTO ES : $%.0f
                """, totalCompra, totalDescuento, totalPagar);
    }
    else {
        System.out.printf("""
                \n\tNO CUMPLE NINGUN REQUISITO.
                \tEL TOTAL DE SU COMPRA ES : $%.0f
                """, totalCompra);
    }
}
}
