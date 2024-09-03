import java.util.*;

public class ejercicio12_IF_ELSE
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    /*
    EN UN JUEGO DE PREGUNTAS QUE SE RESPONDEN "SI" O "NO" GANA QUIEN RESPONDA CORRECTAMENTE LAS 3 PREGUNTAS
    SI SE RESPONDE MAL CUALQUIERA DE ELLAS YA NO SE PREGUNTA LA SIGUIENTE Y TERMINA EL JUEGO. LAS PREGUNTAS SON:
    A. ¿SIMON BOLIVAR LIBERTO A COLOMBIA?
    B. ¿CAMILO TORRES FUE UN GUERRILLERO?
    C. ¿EL BINOMIO DE ORO ES UN GRUPO DE MUSICA VALLENATA?

   P:D = TODAS LAS RESPUESTAS SERAN SI.
     */

    System.out.print("""
            Bienvenido a el cuestionario general, se le daran 3 preguntas y tiene que contestar con SI \\ NO
            Comenzemos...
            """);

    System.out.print("A. ¿SIMON BOLIVAR LIBERTO A COLOMBIA? ==>> ");
    var pregunta1 = x.nextLine();

    if (pregunta1.equals("SI") || pregunta1.equals("si")) {

        System.out.print("B. ¿CAMILO TORRES FUE UN GUERRILLERO? ==>> ");
        var pregunta2 = x.nextLine();

        if (pregunta2.equals("SI") || pregunta2.equals("si")) {

            System.out.print("C. ¿EL BINOMIO DE ORO ES UN GRUPO DE MUSICA VALLENATA? ==>> ");
            var pregunta3 = x.nextLine();

            if (pregunta3.equals("SI") || pregunta3.equals("si")) {
                System.out.print("FELICIDADES, RESPONDISTE LAS 3 PREGUNTAS CORRECTAMENTE.");
            }
            else {
                System.out.println("INCORRECTO.");
                System.exit(0);
            }

        }
        else {
            System.out.println("INCORRECTO.");
            System.exit(0);
        }

    }
    else {
        System.out.println("INCORRECTO.");
        System.exit(0);
    }

}
}
