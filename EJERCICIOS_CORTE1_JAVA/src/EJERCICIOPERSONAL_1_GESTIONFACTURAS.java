import static java.lang.System.*;
import java.util.*;

public class EJERCICIOPERSONAL_1_GESTIONFACTURAS
{ public static void main(String[] args) {
    /*
    Crear un programara para la gestion de facturas de una empresa que se dedica a la
    venta de azucar por kilos.

    En cada factura se ingresara el codigo del producto vendido. Ademas se ingresara la cantidad de kilos vendida
    y el total a pagar por kilos.

    De 5 facturas introducidas se pedira:
    - Facturacion total, cantidad de kilos vendias y cuantas facturas fueron emitidas por mas de $1000
     */
    var precioTotalFacturas = 0;
    String codigoFactura;
    String nombreFactura;
    Scanner x = new Scanner(System.in);
    StringBuilder factura = new StringBuilder();

    final var PRECIO_AZUCAR_POR_KILO = 200;
    var i = 0;

    out.print("¿Cuantas facturas desea agregar? = ");
    var totalFacturas = Integer.parseInt(x.nextLine());

    while (i < totalFacturas) {
        try {

            //CODIGO DE LA FACTURA
            out.print("Ingrese el codigo de la factura " + (i + 1) + " = ");
            var codigo = x.nextLine();

            //SI ES MAYOR A 3 DIGITOS NO LA VALIDA; DEBE SER 3 DIGITOS O MENOS
            if(codigo.length() < 4) {

                StringBuilder xx = new StringBuilder();

                //CODIGO DE FACTURA DE SOLO 3 DIGITOS
                var totalDeCaracteresCodigo = codigo.length();
                while (totalDeCaracteresCodigo < 3) {
                    xx.insert(0, '0');
                    totalDeCaracteresCodigo++;
                }
                xx.append(codigo);
                codigoFactura = xx.toString();


                    //NOMBRE DE LA FACTURA.
                    out.print("Ingrese las SIGLAS de la empresa para la factura " + (i + 1) + " = ");
                    var nombre = x.nextLine().trim().toUpperCase();

                    //SI ES DE 5 SIGLAS SE PASA, SI NO SE DEVUELVE.
                    if (nombre.length() < 6) {

                        StringBuilder arreglarNombre = new StringBuilder();

                        //ARREGLAMOS EL NOMBRE PARA QUE DE SOLO 5 DIGITOS DE SIGLAS
                        var totaldeCaracteresNombre = nombre.length();
                        while (totaldeCaracteresNombre < 5) {
                            arreglarNombre.insert(0, ' ');
                            totaldeCaracteresNombre++;
                        }
                        arreglarNombre.append(nombre);
                        nombreFactura = arreglarNombre.toString();

                        //CANTIDAD DE KILOS QUE COMPRO X EMPRESA
                        out.print("Ingrese cuantos kilos compro la factura " + (i + 1) + " = ");
                        var cantidadKilos = Integer.parseInt(x.nextLine());

                        //PRECIO DE TODOS
                        var precio = cantidadKilos * PRECIO_AZUCAR_POR_KILO;
                        precioTotalFacturas += precio;

                        //FINAL DE CONCATENACION PARA AÑADIR TODOS LOS DATOS.
                        factura.append("FACTURA #").append(i + 1).append("\t|\t").append(codigoFactura).append("\t|\t")
                                .append(nombreFactura).append("\t\t|\t")
                                .append(cantidadKilos).append("\t\t|\t")
                                .append(precio).append("\n");
                        i++;
                    }
                    else {
                        out.println("Nombre no valido, reintente nuevamente....");
                    }
            }
            else {
                out.println("Codigo no valido, reintente nuevamente....");
            } //FIN DE REVISAR SI EL CODIGO PASA LOS 3 DIGITOS.

        }
        catch (Exception error) {
            out.println("Valor erroneo, reintente nuevamente....");
        } //REVISION DE ERRORES AL PONER DATOS
    }

    var facturaCompleta = factura.toString();
    out.printf("""
            ------------------------ FACTURA ------------------------
            %s
            ---------------------------------------------------------
            \t\t\t\t\t\t\t\t\t\t TOTAL  \t|  %d
            \t\t\t\t\t\t\t\t\t\t FACTURAS | %d
            """, facturaCompleta, precioTotalFacturas, totalFacturas);
}
}