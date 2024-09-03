package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class menuIterativoWHILE
{ public static void main(String[] args) {
    var salir = false;

    Scanner x = new Scanner(System.in);

    while(!salir) {
        System.out.print("""
            \t\t\tBIENVENIDO AL MENU
            Selecciona alguna opcion a continuacion:
            \t1 - Crear cuenta.
            \t2 - Eliminar cuenta.
            \t3 - Salir.
            ==>>\s""");
        var dato = Integer.parseInt(x.nextLine());

        switch(dato) {
            case 1 -> System.out.println("Creando tu Cuenta...\n");
            case 2 -> System.out.println("Eliminando tu Cuenta\n");
            case 3 -> {
                System.out.println("Saliendo...\n");
                salir = true;
            }
            default -> System.out.println("OPCION NO VALIDA.\n");
        }
    }

}
}
