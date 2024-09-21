import java.util.*;
import static java.lang.Math.*;

public class ejercicio15_FOR_WHILE
{  public static void main(String[] args) {
    /*
    Hacer un algoritmo que entre dos valores a y b, encuentre a^b mediante sumas unicamente.
     */
    var sumaTotal = 0;
    Scanner x = new Scanner(System.in);

    System.out.print("¿Cual numero desea ver el cuadrado? : ");
    var num = Integer.parseInt(x.nextLine());

    System.out.print("¿A cuanto desea elevar el primer numero? : ");
    var pot = Integer.parseInt(x.nextLine());

    var potencia = (int)(pow(num, pot));

    while(potencia > sumaTotal) {
            sumaTotal+=num;
    }

    System.out.println(sumaTotal);
}
}
