import java.util.*;
public class ejercicio2_FOR
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    var num = 0;
    int i, j;

    System.out.print("Introduce un numero N: ");
    num = Integer.parseInt(x.nextLine());

    for (i = 1; i <= num; i++) {
        var cuadrado = 0;
        var numeroImpar = 1;

        for (j = 0; j < i; j++) {
            cuadrado += numeroImpar;
            numeroImpar += 2;
        }

        System.out.println("Numero: " + i + ", Cuadrado: " + cuadrado);
    }

}
}