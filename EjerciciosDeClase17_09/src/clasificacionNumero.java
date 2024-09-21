import java.util.Scanner;

public class clasificacionNumero
{
    /*
    2). De acuerdo a X numero ingresado que clasifique si es numero par, impar o primo.
     */
    public static boolean par (double num) {
        return num % 2 == 0;
    }
    public static boolean impar (double num) {
        return num % 2 != 0;
    }

    public static boolean primo (double num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero = ");
        var num = Double.parseDouble(scanner.nextLine());

        System.out.printf("""
                El numero %.0f
                Es par = %s
                Es impar = %s
                Es primo = %s
                """, num, par(num), impar(num), primo(num));
    }
}