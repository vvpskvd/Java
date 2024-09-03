package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class numerosParesFOR
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("INGRESE HASTA QUE NUMERO QUIERE VER LOS PARES : ");
    var numFinal = Integer.parseInt(x.nextLine());

    for(var i = 0 ; i<=numFinal ; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
}
}
