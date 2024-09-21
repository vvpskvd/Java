import static java.lang.System.*;
import java.util.Scanner;

public class ejercicio5
{ public static void main(String[] args) {
    /*
    Elabora un programa en java que calcule, usando un menu, si un numero ingresado es impar, par o primo.
     */
    boolean esPrimo = true;
    Scanner x = new Scanner(in);

    out.print("INGRESE UN NUMERO CUALSEA = ");
    var num = Integer.parseInt(x.nextLine());

    out.printf("""
            DESEA VALIDAR EL NUMERO %d COMO UN =
            1 - Par.
            2 - Impar.
            3 - Primo.
            ==>\s""", num);
    var calculo = Integer.parseInt(x.nextLine());

    switch(calculo) {
        case 1 -> {
            if (num % 2 == 0 ) {
                out.println("El numero " + num + " es par.");
            } else {
                out.println("El numero " + num + " NO es par.");
            }
        }
        case 2 -> {
            if (num % 2 != 0 ) {
                out.println("El numero " + num + " es impar.");
            } else {
                out.println("El numero " + num + " NO es impar.");
            }
        }
        case 3 -> {
            if(num < 2) {
                esPrimo = false;
            } else{
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if(esPrimo) {
                out.println("El numero " + num + " es primo.");
            } else {
                out.println("El numero " + num + " NO es primo.");
            }
        }
        default -> out.println("NUMERO NO VALIDO");
    }
}
}
