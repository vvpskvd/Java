import java.util.*;

public class ejercicio2_DOWHILE
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    var num = 0;
    int i = 1;

    System.out.print("Ingrese el numero N : ");
    num = Integer.parseInt(x.nextLine());

    do {

        int cuadrado = 0;
        int j = 1;

        do{
            cuadrado += i;
            j++;
        } while (j <= i);

        System.out.println("Número " + i + ", cuadrado " + cuadrado) ;
        i++;

    } while (i <= num);
}
}
