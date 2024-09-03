package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class sistemaEnvios
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    final var nacional = 10.0;
    final var internacional= 20.0;
    var major = 0;
    var costo = 0.0;

    do {
        System.out.print("Cual es su destino, ¿nacional \\ internacional? : ");
        var destino = x.nextLine();

        System.out.print("\n¿Cuanto pesa su paquete actualmente?\n(DIGITELO EN KILOGRAMOS): ");
        var peso = Double.parseDouble(x.nextLine());

        if (destino.equals("nacional") || destino.equals("NACIONAL")) {
            costo = nacional * peso;
        } else if (destino.equals("internacional") || destino.equals("INTERNACIONAL")){
            costo = internacional * peso;
        } else {
            destino = "DATO INVALIDO";
            costo = 0.0;
            peso = 0.0;
        }

        System.out.printf("""
                \nSu paquete a destino %s.
                De peso total a = %.0f
                Costaria un total de = $%.0f USD.
                """, destino, peso, costo);


        System.out.print("\n¿Quiere ingresar otro paquete?\nSI \\ NO: ");
        var dato = x.nextLine();
        major = (dato.equals("SI") || dato.equals("si")) ? 0 : 1 ;

    } while(major != 1);
}
}
