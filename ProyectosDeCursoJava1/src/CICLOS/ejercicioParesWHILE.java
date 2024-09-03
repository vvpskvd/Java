package CICLOS; //IGNORAR ESTO
import java.util.*;

public class ejercicioParesWHILE
{ public static void main(String[] args) {
    var i = 1;
    Scanner x = new Scanner(System.in);

    System.out.print("Hasta que numero desea ver : ");
    var numFinal = Integer.parseInt(x.nextLine());

    while (i<=numFinal) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
        i++;
    }
}
}
