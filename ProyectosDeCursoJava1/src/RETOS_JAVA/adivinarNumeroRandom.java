package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class adivinarNumeroRandom
{ public static void main(String[] args) {
    Random x = new Random();
    Scanner xx = new Scanner(System.in);

    var validarNumero = 0;
    var cantidadIntentos = 0;
    var numeroSecreto = x.nextInt(10) + 1;

    System.out.println("EL NUMERO SECRETO ES " + numeroSecreto + "\n");
    System.out.println("SOLO TIENES 10 INTENTOS.");

        while (validarNumero != numeroSecreto && cantidadIntentos < 10) {
            System.out.print("Ingrese el numero que creas que es correcto : ");
            validarNumero = Integer.parseInt(xx.nextLine());

            if (validarNumero < numeroSecreto) {
                System.out.println("El numero secreto es mayor.");
            }
            else  if (validarNumero > numeroSecreto) {
                System.out.println("El numero secreto es menor.");
            } else {

            }

            cantidadIntentos++;
        }
    if (validarNumero == numeroSecreto) {
        System.out.println("FELICIDADES, ADIVINASTE EL NUMERO SECRETO, LO HICISTE EN " + cantidadIntentos + " INTENTO/S.");
    }
    else {
        System.out.println("NO ALCANZASTE A ADIVINAR EL NUMERO SECRETO, SE AGOTARON TUS INTENTOS.");
    }
}
}