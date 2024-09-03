import java.util.*;

public class ejercicio1_WHILE
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    var edad = 0.0;
    var major = 0;
    var edadFinal = 0.0;
    var edadCalculo = 0.0;

    while (edadCalculo <= 45) {
        System.out.print("Ingrese una edad :");
        edad = Double.parseDouble(x.nextLine());

        edadFinal += edad;
        major++;

        edadCalculo = edadFinal / major;
    }

    System.out.println("Ingreso " + major + " edades.");
    System.out.println("Su promedio final fue de : " + edadCalculo);
}
}