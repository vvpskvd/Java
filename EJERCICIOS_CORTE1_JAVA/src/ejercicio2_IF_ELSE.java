import java.util.*;

public class ejercicio2_IF_ELSE
{ public static void main(String[] args){
    /*
    Diseñe un algoritmo que lea 3 numeros e imprima
    cual de ellos es o no la suma de los otros dos.
     */
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese Dato 1: ");
    var dato1 = Integer.parseInt(x.nextLine());

    System.out.print("Ingrese Dato 2: ");
    var dato2 = Integer.parseInt(x.nextLine());

    System.out.print("Ingrese Dato 3: ");
    var dato3 = Integer.parseInt(x.nextLine());

    var suma1 = dato2+dato3;
    var suma2 = dato1+dato3;
    var suma3 = dato1+dato2;

    if (suma1 == dato1) {
        System.out.println("La suma de " + dato2 + " y " + dato3 + " es " + dato1);
    }
    else if (suma2 == dato2) {
        System.out.println("La suma de " + dato1 + " y " + dato3 + " es " + dato2);
    }
    else if (suma3 == dato3) {
        System.out.println("La suma de " + dato1 + " y " + dato2 + " es " + dato3);
    } else {
        System.out.println("Ninguna suma es igual a ningun numero.");
    }
}
}