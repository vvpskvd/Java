import java.util.Scanner;

public class bancoEjercicio
{
    /*
    3). Crear métodos que permitan consignar, retirar y transferir para un banco.
    */
    double saldo;

    public static double consignar (double saldo, double dinero) {
        return saldo + dinero;
    }
    public static double retirar (double saldo, double dinero) {
        if(dinero > saldo) {
            System.out.println("Saldo insuficiente para retirar...\nReintente nuevamente.");
            return saldo;
        } else {
            return saldo - dinero;
        }
    }
    public static double transferir (double saldo, double dinero) {
        if (dinero > saldo) {
            System.out.println("No puede enviar tal cantidad a la cuenta...\n Reintente nuevamente");
            return saldo;
        } else {
            return saldo - dinero;
        }
    }

    public static void main(String[] args) {
        var major = 1;

        bancoEjercicio x = new bancoEjercicio();
        Scanner scanner = new Scanner(System.in);

        while (major != 0) {
            System.out.print("""
                    \n\t\t\tBienvenido al cajero
                    Ingrese que desea hacer :
                    \t 1 - Consignar.
                    \t 2 - Retirar.
                    \t 3 - Transferir.
                    \t 4 - Salir.
                    ==>>\s""");
            var resultado = Integer.parseInt(scanner.nextLine());

            switch (resultado) {
                case 1 -> { //CONSIGNAR
                    System.out.print("Ingrese cuanto va a consignar = ");
                    double dinero = Double.parseDouble(scanner.nextLine());
                    var salida = consignar(x.saldo, dinero);

                    System.out.println("Su saldo actual es = " + salida);
                    x.saldo = salida;
                }
                case 2 -> { //RETIRAR
                    System.out.print("Ingrese cuanto va a retirar = ");
                    double dinero = Double.parseDouble(scanner.nextLine());
                    var salida = retirar(x.saldo, dinero);

                    System.out.println("Su saldo actual es  = " + salida);
                    x.saldo = salida;
                }
                case 3 -> { //TRANSFERIR
                    System.out.println("Ingrese el numero de cuenta al que va a enviar = ");
                    var cuenta = scanner.nextLine();
                    System.out.print("Ingrese cuanto va a Transferir a otra cuenta = ");
                    double dinero = Double.parseDouble(scanner.nextLine());
                    var salida = transferir(x.saldo, dinero);

                    System.out.println("Envio $" + dinero + " A la cuenta " + cuenta);
                    System.out.println("Su saldo es = " + salida);
                    x.saldo = salida;
                }
                case 4 -> {
                    System.out.print("Gracias por usar nuestro cajero, hasta luego...");
                    major = 0;
                }
                default -> System.out.println("Opcion invalida... Reintente nuevamente...");
            }
        }
    }
}