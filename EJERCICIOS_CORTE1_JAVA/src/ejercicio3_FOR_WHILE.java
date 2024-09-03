import java.util.*;

public class ejercicio3_FOR_WHILE
{ public static void main(String[] args) {
    boolean tieneRaiz = false;
    Scanner x = new Scanner (System.in);

    System.out.print("Ingrese un numero : ");
    var num = Integer.parseInt(x.nextLine());

    for (int i = 1; i <= num; i++) {
        if (i * i == num) {
            tieneRaiz = true;
            break;
        }
    }

    if (tieneRaiz) {
        System.out.println("El numero " + num + " SI tiene una raíz cuadrada exacta.");
    } else {
        System.out.println("El numero " + num + " NO tiene una raíz cuadrada exacta.");
    }
}
}