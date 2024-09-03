package ENTRADA_CONSOLA; //IGNORAR ESTO
import java.util.*;

public class leerTiposDatos {
    public static void main(String[] args) {
        var x = new Scanner(System.in);
        System.out.print("Ingresa tu edad : ");
        var edad = x.nextInt();
        System.out.println("edad = " + edad);

        x.nextLine(); //se usa para consumir el SPACE que dimos en nextInt();

        System.out.print("Ingrese su nombre : ");
        var nombre = x.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
