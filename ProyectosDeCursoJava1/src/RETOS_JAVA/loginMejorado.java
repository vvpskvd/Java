package RETOS_JAVA; //IGNORAR ESTo
import java.util.*;

public class loginMejorado
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    final String usuario = "papichulo";
    final String password = "1234ContraseñaSegura";

    System.out.print("Ingrese usuario : ");
    var user = x.nextLine();

    System.out.print("Ingrese contraseña : ");
    var contra = x.nextLine();

    var resultado = (user.equals(usuario) && contra.equals(password)) ? "Bienvenido al sistema." :
                    (user.equals(usuario)) ? "Contraseña Incorrecta." :
                    (contra.equals(password)) ? "Usuario Incorrecto." : "Usuario y Contraseña Incorrectos.";

    System.out.println(resultado);
}
}
