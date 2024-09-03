package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class cajeroAutomatico
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    var salir = false;
    var cuenta = 1000.0;

    while (!salir) {
        System.out.print("""
                
                \t\t\tBIENVENIDO AL CAJERO AUTOMATICO
                Ingrese una opcion a realizar operacion
                \t1 - Depostiar Saldo.
                \t2 - Retirar Saldo.
                \t3 - Constular Saldo.
                \t4 - Salir.
                ===>>>\s""");
        var menu = Integer.parseInt(x.nextLine());

        switch(menu) {
            case 1 ->
            {
                System.out.print("¿Cuanto quiere depositar? = ");
                var deposito = Double.parseDouble(x.nextLine());
                cuenta += deposito;
                System.out.println("Su nuevo Saldo es : " + cuenta);
            }
            case 2 ->
            {
                System.out.print("¿Cuanto quiere retirar? = ");
                var retiro = Double.parseDouble(x.nextLine());
                if (retiro <= cuenta) {
                    cuenta -= retiro;
                    System.out.println("Su nuevo Saldo es : " + cuenta);
                } else {
                    System.out.println("No puede retirar esa cantidad, su cuenta no posee ese dinero.");
                }
            }
            case 3 -> System.out.println("Su saldo actual es " + cuenta);

            case 4 -> {
                System.out.println("Saliendo del Cajero....");
                salir = true;
            }
            default -> System.out.println("Opcion Invalida, Reintente Nuevamente...");

        }
    }
}
}