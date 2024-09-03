package RETOS_JAVA; //IGNORAR ESTO

import java.util.*;
public class loginReto
{ public static void main(String[] args) {
    var i = 1;
    final var usuario = "Daniel A";
    final var contra = "uwumeplzz123";

    Scanner x = new Scanner(System.in);

    while (i != 0) {
        System.out.print("Digite el usuario para ingresar : ");
        var usuariocheck = x.nextLine();
        System.out.print("Digite su contraseña para ingresar : ");
        var contracheck = x.nextLine();

        if (usuariocheck.equals(usuario) && contracheck.equals(contra)) {
            System.out.println("Bienvenido " + usuario);
            i = 0;
        } else {
            System.out.println("Contraseña y/o Usuario incorrecto/s, reintente nuevamente.");
        }
    }
}
}