package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class rangoReto
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese el rango inicial:");
    var numRango1 = x.nextInt();

    System.out.print("Ingrese el rango final:");
    var numRango2 = x.nextInt();

    System.out.print("Ingrese un numero cual sea: ");
    var num = x.nextInt();

    if (num > numRango1 && num < numRango2) {
        System.out.println("Su numero se encuentra dentro del rango " + numRango1 + " y " + numRango2);
    } else {
        System.out.println("Su numero NO se encuentra dentro del rango " + numRango1 + " y " + numRango2);
    }
}
}
