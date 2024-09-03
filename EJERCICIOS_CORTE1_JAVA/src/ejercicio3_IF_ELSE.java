import java.util.*;

public class ejercicio3_IF_ELSE
{ public static void main(String[] args) {
    /*
    Un empleado de una fabrica trabaja en 2 turnos, diurno y nocturno.
    Se desea calcular el jornal diario de acuerdo con los siguientes criterios:
    ---> La tarifa de las horas diurnas es de 2 euros.
    ---> La tarifa de las horas nocturnas es de 3 euros.
    ---> En caso de ser domingo, las tarifas son de 4 euros por el turno diurno y 6 euros
    por el turno nocturno. Los dias de las semana se numeran de 1 en adelante:
    1) Lunes.
    2) Martes.
    3) Miercoles.
    4) Jueves.
    5) Viernes.
    6) Sabado.
    7) Domingo.
     */
        var diurno = 2;
        var nocturno = 3;
        var totalHoras = 0.0;

        Scanner x = new Scanner(System.in);

        System.out.print("Ingrese de que turno es actualmente \nDiurno o Nocturno:");
        var turno = x.nextLine();

        System.out.print("¿Que dia es hoy?" +
                "\n\t(1)LUNES\n\t(2)MARTES\n\t(3)MIERCOLES\n\t(4)JUEVES\n\t(5)VIERNES\n\t(6)SABADO\n\t(7)DOMINGO\n===>>> ");
        var dia = Integer.parseInt(x.nextLine());

        System.out.print("¿Cuantas horas trabaja actualmente : ");
        var horas = Integer.parseInt(x.nextLine());

        if (turno.equals("Diurno") || turno.equals("diurno") || turno.equals("DIURNO")) {
            switch (dia) {
                case 1, 2, 3, 4, 5, 6: //LUNES A SABADO
                    totalHoras = horas * diurno;
                    System.out.println("De sus " + horas + " horas diurnas. Se le pagara : $" + totalHoras + " euros.");
                    break;
                case 7: //DOMINGO
                    diurno = 4;
                    totalHoras = horas * diurno;
                    System.out.println("De sus " + horas + " horas diurnas del domingo. Se le pagara : $" + totalHoras + " euros.");
                    break;
                default:
                    System.out.println("OPCION INVALIDA.");
                    break;
            }
        }
        else if (turno.equals("Nocturno") || turno.equals("nocturno") || turno.equals("NOCTURNO")) {
            switch (dia) {
                case 1, 2, 3, 4, 5, 6: //LUNES A SABADO
                    totalHoras = horas * nocturno;
                    System.out.println("De sus " + horas + " horas nocturnas. Se le pagara : $" + totalHoras + " euros.");
                    break;
                case 7: //DOMINGO
                    nocturno = 6;
                    totalHoras = horas * nocturno;
                    System.out.println("De sus " + horas + " horas nocturnas del domingo. Se le pagara : $" + totalHoras + " euros.");
                    break;
                default:
                    System.out.println("OPCION INVALIDA, NO EXISTE ESE DIA.");
                    break;
            }
        }
        else {
            System.out.println("OPCION INVALIDA, NO EXISTE ESE HORARIO.");
        }
        x.close(); //cerrar consola para buenas practicas
}
}