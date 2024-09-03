import java.util.*;

public class ejercicio6_FOR_WHILE
{ public static void main(String[] args) {
    var major = 0;
    var totalDeCompras = 0;
    float totalValorDeCompras = 0;
    var cantidad = 0;
    String facturaVentaImprimir = "";

    Scanner x = new Scanner(System.in);
    StringBuilder xx = new StringBuilder();

    do {
        //CODIGO DE COMPRA, EL VALOR Y CANTIDAD
        System.out.print("""
                
                \t\tINGRESE EL CODIGO DEL PRODUCTO
                (RECUERDE QUE SOLAMENTE ACEPTAMOS CODIGOS DE 2 DIGITOS)
                ==>>\s""");
        var codigoProducto = Integer.parseInt(x.nextLine());

        System.out.print("""
                
                \t\t\tINGRESE EL VALOR DEL PRODUCTO
                ==>> $\s""");
        var valorProducto = Float.parseFloat(x.nextLine());

        System.out.printf("""
                
                \t\tINGRESE CUANTOS LLEVARA DEL PRODUCTO CODIGO %d
                ==>>\s""", codigoProducto);
        cantidad = Integer.parseInt(x.nextLine());


        //VALIDAR EL CODIGO DE COMPRA
        if (codigoProducto <= 99 && codigoProducto > 0 && valorProducto > 0 && cantidad > 0) {
            xx.append("CODIGO #").append(codigoProducto).append("\t\t|\t\t").append("COP$").append(valorProducto).append("\t|\t").append(cantidad).append(" producto/s").append("\n");
            facturaVentaImprimir = xx.toString();

            totalDeCompras++;

            totalValorDeCompras += valorProducto * cantidad;

            System.out.printf("""
                    
                    PRODUCTO AÑADIDO EXITOSAMENTE, ACTUALMENTE TIENE = %d COMPRA/S.
                    
                    ¿DESEA AGREGAR OTRO PRODUCTO?
                    \tSI PARA CONTINUAR.
                    \tNO PARA SALIR.
                    ==>>\s""", totalDeCompras);
            var continuarComprando = x.nextLine();

            if (continuarComprando.equals ("no") || continuarComprando.equals("NO") || continuarComprando.equals("No")) {
                major = 0;
            }
            else {
                major = 1;
            }

        }
        else {
            System.out.print("""
                
                NO SE ACEPTAN CODIGOS INVALIDOS MENORES A 0 / MAYORES A 99
                Y TAMPOCO SE ACEPTAN VALORES NEGATIVOS EN EL PRECIO DEL PRODUCTO Y/O CANTIDAD, REINTENTE NUEVAMENTE.
                """);
            major = 1;
        }

    } while (major != 0);

    //FACTURA
    System.out.printf("""
                      FACTURA DE VENTA
            ____________________________________________________
            %s____________________________________________________
            """, facturaVentaImprimir);
    System.out.println("EL TOTAL DE SU MERCADO ES : " + totalValorDeCompras);
    System.out.println("COMPRO " + totalDeCompras + " PRODUCTOS EN TOTAL.");
}
}