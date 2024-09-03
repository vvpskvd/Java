package SENTENCIAS_DECISION; //IGNORAR ESTO
import java.util.*;

public class diasSemanaSwitch
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese el dia actual : ");
    var dia = x.nextLine();

    switch(dia) {
        case "lunes", "LUNES", "Lunes":
            System.out.println("El dia actual es lunes.");
            break;
        case "martes", "MARTES", "Martes":
            System.out.println("El dia actual es martes.");
            break;
        case "miercoles", "MIERCOLES", "Miercoles":
            System.out.println("El dia actual es miercoles.");
            break;
        case "jueves", "JUEVES", "Jueves":
            System.out.println("El dia actual es jueves.");
            break;
        case "viernes", "VIERNES", "Viernes":
            System.out.println("El dia actual es viernes.");
            break;
        case "sabado", "SABADO", "Sabado":
            System.out.println("El dia actual es sabado.");
            break;
        case "domingo", "DOMINGO", "Domingo":
            System.out.println("El dia actual es domingo.");
            break;
        default:
            System.out.println("DIA INVALIDO.");
        break;

    }
}
}
