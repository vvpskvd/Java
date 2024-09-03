package RETOS_JAVA; //IGNORAR ESTo
import java.util.*;

public class sistemaCalificaciones
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese una calificacion entre 0 a 10 : ");
    double calific = Double.parseDouble(x.nextLine());

    var resultado = (calific >= 9 && calific <= 10) ? "A":
                    (calific >= 8 && calific < 9) ? "B" :
                    (calific >= 7 && calific < 8) ? "C" :
                    (calific >= 6 && calific < 7) ? "D" :
                    (calific >= 0 && calific < 6) ? "F" : "Calificacion Incorrecta";

    System.out.println("Su calificacion " + calific + " es de grado: " + resultado);
}
}
