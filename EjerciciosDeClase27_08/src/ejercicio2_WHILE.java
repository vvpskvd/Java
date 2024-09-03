import java.util.*;

public class ejercicio2_WHILE
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    var n = 0;
    int i = 1;

    System.out.print("Ingrese el numero N : ");
    n = Integer.parseInt(x.nextLine());

    while (i <= n) {

        int cuadrado = 0;
        int j = 1;

        while (j <= i) {
            cuadrado += i;
            j++;
        }

        System.out.println("Número " + i + ", cuadrado " + cuadrado) ;
        i++;
    }
}
}
