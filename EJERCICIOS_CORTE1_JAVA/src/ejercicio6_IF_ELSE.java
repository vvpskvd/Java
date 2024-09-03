import java.util.*;

public class ejercicio6_IF_ELSE
{ public static void main(String[] args) {
    /*
    DADOS LOS VALORES A, B, Y C QUE SON LOS PARAEMTROS DE UNA ECUACION DE 2° GRADO
    ELABORAR UN ALGORITMO PARA HALLAR LAS POSIBLES SOLUCIONES DE DICHA ECUACION.
     */
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese dato A : ");
    var datoA = Double.parseDouble(x.nextLine());

    System.out.print("Ingrese dato B : ");
    var datoB = Double.parseDouble(x.nextLine());

    System.out.print("Ingrese dato C : ");
    var datoC = Double.parseDouble(x.nextLine());

    var discriminante = Math.pow(datoB, 2) - (4 * datoA * datoC);

    if (discriminante > 0) {
        var raiz1 = (-datoB + Math.sqrt(discriminante) / (2 * datoA));
        var raiz2 = (-datoB - Math.sqrt(discriminante) / (2 * datoA));

        System.out.println("raiz final 1 = " + raiz1);
        System.out.println("raiz final 2 = " + raiz2);
    }
    else if (discriminante == 0) {
        var raiz = -datoB / (2 * datoA);
        System.out.println("raiz final= " + raiz);
    }
    else {
        System.out.println("La ecuacion no tiene soluciones.");
    }
}
}
