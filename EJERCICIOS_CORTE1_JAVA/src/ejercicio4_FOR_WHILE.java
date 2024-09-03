import java.util.*;

public class ejercicio4_FOR_WHILE
{ public static void main(String[] args) {
    /*
    Una empresa de construccion ofrece casas bajo las siguientes condiciones:
    -->> Si los ingresos del comprador son menores o iguales a $ 1 000 000, la cuota inicial sera del 15% del costo de la casa.
    Y el resto se distribuira uniformemente en pagos mensuales a 10 años.

    -->> Si los ingresos son mayores a $ 1 000 000, la cuota inicial sera del 30% del costo de la casa, y el resto se distribuira
    uniformemente en cuotas mensuales a 7 años.
     */
    var major = 0;
    double calculo;
    double calculo2;
    var meses = 0.0;
    Scanner x = new Scanner (System.in);

    do {

        System.out.print("Ingrese el costo de la casa a calcular : $");
        var costo = Float.parseFloat(x.nextLine());

        if (costo <= 1000000) {
            calculo = costo * 0.15; //CUOTA INICIAL
            calculo2 = costo * 0.85; // PRECIO TOTAL DE 10 AÑOS
            meses = calculo2 / 120; // PRECIO DE CADA MES
            System.out.printf("""
                    El costo total de su casa sera a 15 por ciento de cuota inicial siendo = $%.0f COP
                    Ademas el resto del 85 por ciento sera distribuido en 10 años a = $%.0f COP
                    Y cada mes debera pagar = $%.0f COP
                    """, calculo, calculo2, meses);
        } else {
            calculo = costo * 0.30; // CUOTA INICIAL
            calculo2 = costo * 0.70; // PRECIO TOTAL DE 7 AÑOS
            meses = calculo2 / 84; // PRECIO DE CADA MES
            System.out.printf("""
                    El costo total de su casa sera a 30 por ciento de cuota inicial siendo = $%.0f COP
                    Ademas el resto del 70 por ciento sera distribuido en 7 años a = $%.0f COP
                    Y cada mes debera pagar = $%.0f COP
                    """, calculo, calculo2, meses);
        }

        //loop para ver si continua o no.
        System.out.print("""
                Desea ingresar otro costo de casa a calcular?
                \tIngrese SI para continuar.
                \tIngrese NO para salir.
                ==>>""");

        var pregunta = x.nextLine();

        if (pregunta.equals("si") || pregunta.equals("SI")) {
            major = 1;
        } else {
            major = 0;
        }

    } while(major != 0);
}
}
