import java.util.*;

public class ejercicio1_FOR_WHILE
{public static void main(String[] args) {
    /*
    Para n estudiantes de un colegio donde por cada uno de ellos se tiene su edad, determine
    cuantos pertenecen a cada uno de los siguientes rangos de edad:
    -->> Estudiantes menores de 5 años.
    -->> Estudiantes entre 5 y 7 años.
    -->> Estudiantes entre 7 y 10 años.
    -->> Estudiantes entre 10 y 12 años.
    -->> Estudiantes mayores de 12 años.
     */
    var edad_5 = 0;
    var edad_5_a_7 = 0;
    var edad_7_a_10 = 0;
    var edad_10_a_12 = 0;
    var edad_12 = 0;

    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese cuantos rings desea validar sus edades : ");
    var dato = Integer.parseInt(x.nextLine());

    for (var i = 1 ; i<=dato ; i++) {
        System.out.print("Ingrese la edad del niño #" + i + " : ");
        var edades = Integer.parseInt(x.nextLine());

        if (edades < 5) {
            edad_5++;
        }
        else if (edades >= 5 && edades <= 7){
            edad_5_a_7++;
        }
        else if (edades > 7 && edades <= 10){
            edad_7_a_10++;
        }
        else if (edades > 10 && edades <= 12){
            edad_10_a_12++;
        }
        else if (edades > 12){
            edad_12++;
        }
    }

    System.out.println("Hay " + edad_5 + " niño/s menores a 5 años.");
    System.out.println("Hay " + edad_5_a_7 + " niño/s de 5 a 7 años.");
    System.out.println("Hay " + edad_7_a_10 + " niño/s de 7 a 10 años.");
    System.out.println("Hay " + edad_10_a_12+ " niño/s de 10 a 12 años.");
    System.out.println("Hay " + edad_12+ " niño/s con mas de 12 años.");
}
}
