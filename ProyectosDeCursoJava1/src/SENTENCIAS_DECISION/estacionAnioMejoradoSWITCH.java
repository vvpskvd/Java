package SENTENCIAS_DECISION; //IGNORAR ESTO
import java.util.*;

public class estacionAnioMejoradoSWITCH
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("¿Que mes es actualmente? (digitelo desde 1 hasta 12) : ");
    var mes = Integer.parseInt(x.nextLine());

    var resultado = switch(mes) {
      case 1,2,12 -> "Invierno";
      case 3,4,5 -> "Primavera";
      case 6,7,8 -> "verano";
      case 9,10,11 -> "Otoño";
      default -> "Estacion Invalida / Desconocida";
    };

    System.out.println("La estacion actual del mes es " + resultado);
}
}
