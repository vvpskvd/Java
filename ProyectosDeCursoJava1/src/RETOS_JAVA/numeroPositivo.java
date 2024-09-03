package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class numeroPositivo
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese un numero cual sea : ");
    var num = Integer.parseInt(x.nextLine());

    if (num > 0 ) {
        System.out.println("SU NUMERO ES POSITIVO.");
    } else if (num < 0) {
        System.out.println("SU NUMERO ES NEGATIVO.");
    } else {
        System.out.println("SU NUMERO ES 0 EXACTO.");
    }
}
}
