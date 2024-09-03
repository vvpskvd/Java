import java.util.*;

public class ejercicio17_FOR_WHILE
{ public static void main(String[] args) {
    /*
    ELABORAR UN ALGORITMO QUE DADO, UN VALOR DE X OBTENGA EL VALOR DE E MEDIANTE LA SUMA DE LAS SERIE A CONTINUACION.
     */
    var terminoFinal = 0.0;
    var calculo = 0.0;
    var factorial = 1.0;
    Scanner x = new Scanner(System.in);

    System.out.println("""
            algoritmo de X =
            
                         X^2    X^3    X^4
            E = 1 + X + ---- + ---- + ----
                         2!     3!     4°
            
            SI EL VALOR DE X ES MENOR A 0 SE CALCULARA CON ESTE ALGORITMO =
            
                 1
            E = ----
                 E
            
            """);

    System.out.print("Ingrese valor de X : ");
    var X = Float.parseFloat(x.nextLine());

    if (X <= 0) {

        terminoFinal = Math.abs(X);
        System.out.println("El resultado es " + terminoFinal);

    }
    else {

        calculo = 1 + X;
        for (var i = 2 ; i <= 4 ; i++) {
            factorial *= i;
            calculo += ((Math.pow(X, i)) / factorial);
        }
        System.out.println(calculo);

    }
}
}