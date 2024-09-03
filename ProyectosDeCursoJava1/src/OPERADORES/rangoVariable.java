package OPERADORES; //IGNORAR ESTO
import java.util.*;
public class rangoVariable
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("INGRESE UN DATO ENTERO : ");
    var dato = Integer.parseInt(x.nextLine());

    var resultado = (dato >= 1 && dato <= 10);
    System.out.println("resultado normal = " + resultado);

    resultado = !(dato >= 1 && dato <= 10);
    System.out.println("resultado inverso = " + resultado);
}
}
