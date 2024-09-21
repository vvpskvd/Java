import java.util.*;
public class Calculadora
{
    public static void main(String[] args)
    {
        var operacion = 0.0;
        Scanner x = new Scanner(System.in);

        while (true) {
            mostrarMenu(); //Llama al menu.
            try {
                var opcion = Integer.parseInt(x.nextLine());
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingresa valor para operando 1 : ");
                    var operando1 = Double.parseDouble(x.nextLine());
                    System.out.print("Ingresa valor para operando 1 : ");
                    var operando2 = Double.parseDouble(x.nextLine());

                    switch (opcion) {
                        case 1 -> {
                            operacion = operando1 + operando2;
                            System.out.println("Su resultado de suma es : " + operacion);
                        }
                        case 2 -> {
                            operacion = operando1 - operando2;
                            System.out.println("Su resultado de resta es : " + operacion);
                        }
                        case 3 -> {
                            operacion = operando1 * operando2;
                            System.out.println("Su resultado de multiplicacion es : " + operacion);
                        }
                        case 4 -> {
                            operacion = operando1 / operando2;
                            System.out.println("Su resultado de division es : " + operacion);
                        }
                        default -> System.out.println("DATO NO VALIDO  O INEXISTENTE: " + opcion);
                    }//FIN SWITCH

                } else if (opcion == 5) {
                    System.out.println("Gracias por usar nuestra calculadora, hasta pronto.....");
                    System.exit(0);
                } else {
                    System.out.println("REINTENTE NUEVAMENTE, OPCION NO VALIDA.");
                }//FIN IF-ELSE

            }//FIN TRY
            catch (Exception error) {
                System.out.println("Error : " + error.getMessage() + "\nReintente nuevamente...."); //Procesa la excepcion de algun string o dato no valido para operar
            }
        }//FIN WHILE
    }

    private static void mostrarMenu() {
        System.out.println("\n\n****APLICACION CALCULADORA****");
        System.out.print("""
                    1. Suma.
                    2. Resta.
                    3. Multiplicacion.
                    4. Division.
                    5. Salir.
                    ===>>\s""");
    }
}