import java.util.*;

public class ejercicio10_FOR_WHILE
{ public static void main(String[] args) {
    /*
    Hacer un algoritmo que encuentre la suma de los valores mayor y menor entre
    un grupo de datos positivos
     */
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de números : ");
    int cantidad = Integer.parseInt(x.nextLine());


    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;

    for (int i = 0; i < cantidad; i++) {
        try {

            System.out.print("Ingrese el numero " + (i + 1) + " : ");
            int numero = Integer.parseInt(x.nextLine());

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        } catch (Exception error) {
            System.out.println("Error : " + error.getMessage() + ".... Pasando al siguiente numero....");
        }
    }

    System.out.println("El valor más grande es : " + mayor);
    System.out.println("El valor más pequeño es : " + menor);
    System.out.println("La suma de esos dos valores seria : " + (mayor+menor) );
}
}