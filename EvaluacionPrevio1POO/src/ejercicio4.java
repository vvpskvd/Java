import static java.lang.System.*;
import java.util.Scanner;

public class ejercicio4
{ public static void main(String[] args) {
    var numMayor = (float)Integer.MIN_VALUE;
    var numMenor = (float)Integer.MAX_VALUE;
    var estudiantesPasados = 0;
    var estudiantesReprobados = 0;
    /*
    Por cada uno de n estudiantes se tiene la nota obtenida de unaa materia, hacer un programa en Java que obtenga:
    -> La nota minima.
    -> La nota maxima.
    -> Cuantos perdieron la asignatura.
    -> Cuantos ganaron la asignatura.


    LA NOTA MINIMA PARA PASAR SERA 3.
     */
    Scanner x = new Scanner(in);

    out.print("¿Cuantos estudiantes desea ingresar? = ");
    var cantidadEstudiantes = Integer.parseInt(x.nextLine());

    for (int i = 0; i < cantidadEstudiantes; i++) {

        out.print("Ingrese la calificacion del estudiante #" + (i+1) + " = ");
        var calificacion = Float.parseFloat(x.nextLine());

        if(calificacion <= 5) {
            if (calificacion >= 3) {
                estudiantesPasados++;
            } else {
                estudiantesReprobados++;
            }

            if (calificacion > numMayor) {
                numMayor = calificacion;
            }

            if (calificacion < numMenor) {
                numMenor = calificacion;
            }
        } else {
            out.println("Su calificacion no sera tomada porque sobrepasar el 5 que es la nota maxima que permite la universidad.");
        }
    }

    out.printf("""
            La calificacion menor es = %.1f;
            La calificacion mayor es = %.1f;
            Los estudiantes que reprobaron la materia son = %d estudiante/s.
            Los estudiantes que pasaron la materia son = %d estudiante/s.
            """, numMenor, numMayor, estudiantesReprobados, estudiantesPasados);
}
}