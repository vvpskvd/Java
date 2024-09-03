package RETOS_JAVA; //IGNORAR ESTO.
import java.util.*;

public class creacioPassword_y_Validacion
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    var password = "";
    var salir = false;

    do {
        System.out.print("Ingrese una contraseña para guardarla : ");
        password = x.nextLine();

        if (password.length() >=6 ) {
            System.out.println("Su contraseña es valida, guardada exitosamente.");
            salir = true;
        } else {
            System.out.println("Su contraseña no se puede guardar, requiere minimo 6 caracteres.");
        }

    } while(!salir);
}
}
