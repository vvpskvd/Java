package SENTENCIAS_DECISION; //IGNORAR ESTO
import java.util.*;

public class pizzaConSwitchMejorado
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int major;
    var totalDia = 0;

    do {
        System.out.print("""
                \nQUE TAMAÑO DE PIZZA QUIERE PARA SU PIZZA :
                \t1 - Pequeña son 4 porciones = $40 USD.
                \t2 - Medio Pequeña son 6 porciones = $60 USD.
                \t3 - Mediana son 8 porciones = $80 USD.
                \t4 - Grande son 10 porciones = $100 USD.
                \t5 - ExtraGrande son 12 porciones = $120 USD.
                
                \t0 - Para salir del sistema.
                ===>>\s""");

        var tamanoPizza = Integer.parseInt(x.nextLine());

        var precioPizza = switch (tamanoPizza) {
            case 1 -> 40;
            case 2 -> 60;
            case 3 -> 80;
            case 4 -> 10;
            case 5 -> 120;
            default -> 0;
        };

        totalDia += precioPizza;

        major = (precioPizza == 0) ? 1 :  0;

        System.out.println("Su precio final de la pizza es : $" + precioPizza + " USD");

    } while (major != 1);

    System.out.println("Todo lo reunido en el dia es : $" + totalDia + " USD");
}
}
