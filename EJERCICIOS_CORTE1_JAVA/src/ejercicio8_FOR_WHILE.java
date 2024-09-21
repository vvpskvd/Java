import static java.lang.Math.*;
import static java.lang.System.*;
import java.util.*;

public class ejercicio8_FOR_WHILE
{ public static void main(String[] args) {
    /*
    Encontrar la raiz cuadrada, el cubo y el cuadrado de un grupo de numeros positivos
     */
    Scanner x = new Scanner(System.in);
    StringBuilder concatenar = new StringBuilder();

    out.print("¿Cuantos numeros quiere calcularle el cubo, la raiz cuadrada, y el cuadrado? = ");
    var dato = Integer.parseInt(x.nextLine());

    for (int i = 0; i < dato; i++) {
        out.print("Dato #" + (i + 1) + " = ");
        var num = Integer.parseInt(x.nextLine());
        if (num > 0) {
            var potenciaCuadrada = pow(num, 2);
            var raizCuadrada = sqrt(num);
            var potenciaCubica = pow(num, 3);
            concatenar.append("\nEl numero ").append(num).append("\n")
                    .append("Tiene como potencia Cuadrada : ").append(potenciaCuadrada).append("\n")
                    .append("Tiene como potencia Cubica : ").append(potenciaCubica).append("\n")
                    .append("Tiene como raiz Cuadrada : ").append(raizCuadrada).append("\n")
                    .append("--------------------------------------------");
        } else {
            out.print("NUMERO NEGATIVO NO ACEPTADO, PASANDO...");
        }
    }
    var resultado = concatenar.toString();
    out.println(resultado);
}
}
