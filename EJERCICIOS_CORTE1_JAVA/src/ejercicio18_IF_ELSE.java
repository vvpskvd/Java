import javax.swing.*;
public class ejercicio18_IF_ELSE
{ public static void main(String[] args) {
    final var PRECIO_POR_METRO_CUBICO = 20000;
    var totalCompra = 0;
    var totalDescuento = 0;
    /*
    Calcular el precio que se debe pagar por la compra de madera. Los datos de entrada son la cantidad de metros cubicos
    Y el tipo de madera (A, B, C). Si la cantidad por comprar es superior a 30 metros cubicos, se aplica el siguiente esquema de descuento:
    - Tipo A = 4%
    - Tipo B = 8%
    - Tipo C = 10%
     */
    var metrosCubicos = Integer.parseInt(JOptionPane.showInputDialog(null,
            "¿CUANTOS METROS CUBICOS VA A COMPRAR?"));

    var tipoMadera = JOptionPane.showInputDialog(null,
            "¿QUE TIPO DE MADERA VA A COMPRAR?");

    if (metrosCubicos > 30 ) {
        if (tipoMadera.equals("A")) {
            totalCompra = PRECIO_POR_METRO_CUBICO * metrosCubicos;
            totalDescuento = (int)(totalCompra - (totalCompra * 0.04));
            JOptionPane.showMessageDialog(null,
                    "Usted comprara " + metrosCubicos + " metros cubicos de madera, tipo " + tipoMadera
                            + "\nSu total seria = $" + totalCompra + "\nPero se le aplicara un descuento del 4%, quedando a = $" + totalDescuento);
        }
        else if (tipoMadera.equals("B")) {
            totalCompra = PRECIO_POR_METRO_CUBICO * metrosCubicos;
            totalDescuento = (int)(totalCompra - (totalCompra * 0.08));
            JOptionPane.showMessageDialog(null,
                    "Usted comprara " + metrosCubicos + " metros cubicos de madera, tipo " + tipoMadera
                            + "\nSu total seria = $" + totalCompra + "\nPero se le aplicara un descuento del 8%, quedando a = $" + totalDescuento);
        }
        else {
            totalCompra = PRECIO_POR_METRO_CUBICO * metrosCubicos;
            totalDescuento = (int)(totalCompra - (totalCompra * 0.10));
            JOptionPane.showMessageDialog(null,
                    "Usted comprara " + metrosCubicos + " metros cubicos de madera, tipo " + tipoMadera
                            + "\nSu total seria = $" + totalCompra + "\nPero se le aplicara un descuento del 10%, quedando a = $" + totalDescuento);
        }
    }
    else {
        totalCompra = PRECIO_POR_METRO_CUBICO * metrosCubicos;
        JOptionPane.showMessageDialog(null,
                "Usted comprara " + metrosCubicos + " metros cubicos de madera, tipo " + tipoMadera
                        + "\nSu total seria = $" + totalCompra + "\nSin embargo no se le aplicara ningun descuento, ya que no compro mas de 30 metros cubicos.");
    }
}
}
