//Library SCANNER
import java.util.Scanner;

public class calculoTriangulo {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);

        System.out.print("Ingrese el lado #1 = ");
        int lado_1 = x.nextInt();
        System.out.print("Ingrese el lado #2 = ");
        int lado_2 = x.nextInt();
        System.out.print("Ingrese el lado #3 = ");
        int lado_3 = x.nextInt();

        if (lado_1 == lado_2 && lado_1 == lado_3) {
            System.out.println("Su triangulo es equilatero, osea todos sus lados son iguales.");
        }
        else if (lado_2 == lado_1 || lado_2 == lado_3 || lado_3 == lado_1) {
            System.out.println("Su triangulo es Isoceles, osea tiene un lado diferente y dos iguales.");
        }
        else {
            System.out.println("Todos sus lados son diferentes.");
        }
    }
}
