import java.util.*;

public class ejercicio7_IF_ELSE
{ public static void main(String[] args) {
    /*
    HACER UN ALGORITMO QUE ENTRE 4 DATOS Y DETERMINE CUAL ES MAYOR.
     */
    Scanner x = new Scanner(System.in);

    System.out.print("DIGITE EL 1° DATO : ");
    var dato1 = Integer.parseInt(x.nextLine());
    System.out.print("DIGITE EL 2° DATO : ");
    var dato2 = Integer.parseInt(x.nextLine());
    System.out.print("DIGITE EL 3° DATO : ");
    var dato3 = Integer.parseInt(x.nextLine());
    System.out.print("DIGITE EL 4° DATO : ");
    var dato4 = Integer.parseInt(x.nextLine());

    if (dato1 > dato2 && dato1 > dato3 && dato1 > dato4) {
        System.out.println("El numero 1 es el mayor que todos.");
    } else if (dato2 > dato1 && dato2 > dato3 && dato2 > dato4) {
        System.out.println("El numero 2 es el mayor que todos.");
    } else if (dato3 > dato1 && dato3 > dato2 && dato3 > dato4) {
        System.out.println("El numero 3 es el mayor que todos.");
    } else {
        System.out.println("El numero 4 es el mayor que todos.");
    }

}
}
