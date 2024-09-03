//Library SCANNER
import java.util.Scanner;

//Class Main to the exercise NumerosDe3
public class NumerosDe3 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);

        System.out.print("Ingrese Numero 1:");
        float num1 = x.nextInt();
        System.out.print("Ingrese Numero 2:");
        float num2 = x.nextInt();
        System.out.print("Ingrese Numero 3:");
        float num3 = x.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero 1 es mayor que los demas numeros.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero 2 es mayor que los demas numeros.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero 3 es mayor que los demas numeros.");
        }
    }
}
