import java.util.*;

public class ejercicio2_FOR_WHILE
{public static void main(String[] args) {
    /*
    Realice un algoritmo que permita visualizar los multiplos de 4
    comprendidos entre 4 y n.
     */
    String resultadoFinal = "";
    Scanner x = new Scanner(System.in);
    StringBuilder xx = new StringBuilder();

    System.out.print("HASTA QUE NUMERO DESEA VER LOS MULTIPLOS DE 4 : ");
    var dato = Integer.parseInt(x.nextLine());

    for (var i = 4 ; i<=dato ; i+=4) {
        xx.append(i).append(" ");
         resultadoFinal = xx.toString();
    }
    System.out.println(resultadoFinal);
}
}
