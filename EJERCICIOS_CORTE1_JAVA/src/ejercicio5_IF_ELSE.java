import java.util.*;

public class ejercicio5_IF_ELSE
{ public static void main(String[] args) {
    /*
    Determine si un numero de 4 digitos ingresado por el usuario es palindromo (capicua).
    Un numero es capicua cuando se lee igual de izquierda a derecha que: por ejemplo, 1771.
     */
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese un numero SOLAMENTE DE 4 DIGITOS: ");
    var dato = x.nextLine();

    var string1 = dato.substring(0, 1); //aca lee el 1° digito
    var string2 = dato.substring(1, 2); //aca lee el 2° digito
    var string3 = dato.substring(2, 3); //aca lee el 3° digito
    var string4 = dato.substring(3, 4); //aca lee el 4° digito

    if (string1.equals(string4) && string2.equals(string3)) {
        System.out.println("CAPICUA");
    }
    else {
        System.out.println("NO CAPICUA");
    }
}
}
