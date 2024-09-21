import java.util.Scanner;

public class Operaciones
{

public static int sumar(int a, int b) {
    return a + b;
}
public static int restar(int a, int b) {
    return a - b;
}
public static int multiplicar(int a, int b) {
    return a * b;
}
public static double dividir(int a, int b) {
    return (double) a / b;
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double resultado;

    System.out.print("Ingrese dato a = ");
    double numero1 = Double.parseDouble(scanner.nextLine());
    System.out.print("Ingrese dato a = ");
    double numero2 = Double.parseDouble(scanner.nextLine());

    resultado = sumar((int)numero1, (int)numero2);
    System.out.println("La suma es : " + resultado);
    resultado = restar((int)numero1, (int)numero2);
    System.out.println("La resta es : " + resultado);
    resultado = multiplicar((int)numero1, (int)numero2);
    System.out.println("La multiplicacion es : " + resultado);

    if(numero2 == 0) {
        System.out.println("OPERACION NO VALIDA.");
    } else {
        resultado = dividir((int)numero1, (int)numero2);
        System.out.println("La division es : " + resultado);
    }


}
}