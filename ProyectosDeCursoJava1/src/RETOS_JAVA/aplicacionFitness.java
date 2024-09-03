package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class aplicacionFitness
{ public static void main(String[] args) {
    final var META_PASOS_DIARIOS = 10000;
    final var CALORIAS_POR_PASO = 0.04;

    Scanner x = new Scanner(System.in);

    //Datos
    System.out.print("DIGITE SU NOMBRE COMPLETO : ");
    var nombre = x.nextLine();

    System.out.print("¿CUANTOS PASOS HA REALIZADO HOY? : ");
    var pasosDiarios = Double.parseDouble(x.nextLine());

    //Calculo de calorias y pasos
    var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

    var resultado = (pasosDiarios >= META_PASOS_DIARIOS) ? "Alcanzaste la meta de 10.000 pasos diarios." : "NO alcanzaste la meta.";

    System.out.printf("""
            \tHola, %s. Hoy realizaste %.0f pasos.
            \tFelicitaciones %s; Quemaste %.0f kcal.
            \t%s
            ____________________________________________
            Recuerda que la meta de pasos diarios es : %d
            """, nombre, pasosDiarios, nombre, caloriasQuemadas, resultado, META_PASOS_DIARIOS);
}
}
