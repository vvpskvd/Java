package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class valorMesSWITCH
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("Digite que mes es actualmente (entre 1 y 12) : ");
    var mes = Integer.parseInt(x.nextLine());

    switch (mes) {
        case 1, 2, 12:
            System.out.println("Actualmente es = Invierno.");
            break;
        case 3, 4, 5:
            System.out.println("Actualmente es = Primavera.");
            break;
        case 6, 7, 8:
            System.out.println("Actualmente es = Verano.");
            break;
        case 9, 10, 11:
            System.out.println("Actualmente es = Otoño.");
            break;
        default:
            System.out.println("MES INEXISTENTE.");
            break;
    }
}
}
