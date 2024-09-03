package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class ejercicioEntradaFeria
{ public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

    System.out.print("INGRESA TU EDAD ACTUAL : ");
    var edad = Integer.parseInt(x.nextLine());

    System.out.print("TIENES PANICO A LA OSCURIDAD\n\t(INGRESA SI / NO) :");
    var oscuridad = x.nextLine();

    if ((oscuridad.equals("no") || oscuridad.equals("NO")) && edad > 10) {
        System.out.println("FELICIDADES, PUEDES ENTRAR.");
    } else {
        System.out.println("NO ESTA PERMITIDO INGRESAR CON TU EDAD O PANICO A LA OSCURIDAD.");
    }
}
}
