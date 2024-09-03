package RETOS_JAVA; //IGNORAR ESTo
import java.util.*;

public class calculadoraSwitch
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    var salir = false;
    var num1 = 0.0;
    var num2 = 0.0;

    do {
        var resultado = 0.0;
        System.out.print("""
                
                \t\t\tCALCULADORA
                Ingrese que operacion desea efectuar
                \t1 - Sumar.
                \t2 - Restar.
                \t3 - Multiplicar.
                \t4 - Dividir.
                \t5 - Salir de la aplicacion.
                ==>>\s""");
        var opcionSeleccionada = Integer.parseInt(x.nextLine());

        switch (opcionSeleccionada) {
            case 1 ->
            { //SUMA
                System.out.print("Ingrese el numero 1 : ");
                num1 = Double.parseDouble(x.nextLine());

                System.out.print("Ingrese el numero 2 : ");
                num2 = Double.parseDouble(x.nextLine());
                resultado = num1+num2;
                System.out.println("Su resultado es : " + resultado);
            }
            case 2 ->
            { //RESTA
                System.out.print("Ingrese el numero 1 : ");
                num1 = Double.parseDouble(x.nextLine());

                System.out.print("Ingrese el numero 2 : ");
                num2 = Double.parseDouble(x.nextLine());
                resultado = num1-num2;
                System.out.println("Su resultado es : " + resultado);
            }
            case 3 ->
            { //MULTIPLICACION
                System.out.print("Ingrese el numero 1 : ");
                num1 = Double.parseDouble(x.nextLine());

                System.out.print("Ingrese el numero 2 : ");
                num2 = Double.parseDouble(x.nextLine());
                resultado = num1*num2;
                System.out.println("Su resultado es : " + resultado);
            }
            case 4 ->
            { //DIVISION
                System.out.print("Ingrese el numero 1 : ");
                num1 = Double.parseDouble(x.nextLine());

                System.out.print("Ingrese el numero 2 : ");
                num2 = Double.parseDouble(x.nextLine());
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Su resultado es : " + resultado);
                } else {
                    System.out.println("Error : Division por cero... Reintente Nuevamente...");
                }
            }
            case 5 ->
            { //SALIR
             System.out.println("Saliendo de CALCULADORA");
             salir = true;
            }
            default -> System.out.println("Opcion Invalida, Reintente Nuevamente...");
        }
    } while (!salir) ;
}
}