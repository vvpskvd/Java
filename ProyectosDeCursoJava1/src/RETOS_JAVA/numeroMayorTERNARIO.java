package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class numeroMayorTERNARIO
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese numero 1 : ");
    var dato1 = Integer.parseInt(x.nextLine());

    System.out.print("Ingrese numero 2 : ");
    var dato2 = Integer.parseInt(x.nextLine());

    var resultado = (dato1 > dato2) ? "El numero " + dato1 + " es mayor que el numero " + dato2 : "El numero " + dato2 + " es mayor que el " + dato1;
    System.out.println(resultado);

}
}
