import java.util.*;

public class ejercicio18_FOR_WHILE
{ public static void main(String[] args) {
    /*
    ELABORAR UN ALGORITMO QUE CALCULE PARA X = 0.1, 0.2 ..... 0.9
    EL VALOR DE LA SERIE=

          X      2X^2    2X^2    2X^2
        ----- + ----- + ----- + ----- + .....
          2       3       4       5

     POR CADA VALOR DE X LA SUMA SE CALCULA HASTA QUE EL TERMINO GENERADO
     GENERADO SEA MENOR O IGUAL A UN VALOR T DADO.
     */
    double suma = 0;
    double termino;
    int n = 1;
    Scanner scan = new Scanner(System.in);

    System.out.print("Ingrese el valor de tolerancia: ");
    double tolerancia = Double.parseDouble(scan.nextLine());

    for (double x = 0.1; x <= 0.9; x += 0.1) {

        do {

            termino = (n * Math.pow(x, n)) / (n + 1);
            suma += termino;
            n++;

        } while (termino > tolerancia);

        System.out.printf("Para x = %.1f, la suma de la serie es: %.5f%n", x, suma);
    }

}
}

