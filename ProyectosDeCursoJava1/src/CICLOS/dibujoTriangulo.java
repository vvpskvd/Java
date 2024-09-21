package CICLOS; //IGNORARESTO
import java.util.*;

public class dibujoTriangulo
{ public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    StringBuilder xx = new StringBuilder();
    var resultado = "";

    System.out.print("¿De cuantas filas desea el triangulo? : ");
    var totalFilas = Integer.parseInt(x.nextLine());

    for(var fila = 1 ; fila<=totalFilas ; fila++)
    {
        var espacios = " ".repeat(totalFilas - fila);
        var asteriscos = "*".repeat(2 * fila - 1);
        xx.append(espacios).append(asteriscos).append(espacios).append("\n");
        resultado =xx.toString();
    }

    System.out.print(resultado);
}
}