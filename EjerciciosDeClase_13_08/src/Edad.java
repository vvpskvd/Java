//Library SCANNER
import java.util.Scanner;

//Class MAIN to exercise EDAD
public class Edad {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);

        System.out.print("Ingrese la edad:");
        int edad = x.nextInt();

        if (edad >= 18 ) {
            System.out.println("Ud es mayor de edad.");
        } else {
            System.out.println("Ud no es mayor de edad.");
        }
    }
}
