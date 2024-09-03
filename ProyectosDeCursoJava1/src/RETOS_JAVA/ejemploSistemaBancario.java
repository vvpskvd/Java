package RETOS_JAVA; //IGNORAR ESTO.
import java.util.*;

public class ejemploSistemaBancario
{ public static void main(String[] args) {
    var dato = 1;
    Scanner x = new Scanner(System.in);

    do {
        System.out.print("""
                DESEA CONTINUAR DENTRO DEL SISTEMA?
                ===>\s""");
        var major = x.nextLine();

        if (major.equals("SI") || major.equals("si") || major.equals("Si")) {
            System.out.println("CONTINUANDO EN EL SISTEMA......");
        } else {
            System.out.println("SALIENDO DEL SISTEMA......");
            dato = 0;
        }

    } while (dato !=0);
}
}
