package SENTENCIAS_DECISION; //IGNORAR ESTO.
import java.util.*;

public class operadorTernarioIFELSECORTO
{public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    //Determinar si un numero es par o no.
    System.out.print("INGRESA UN NUMERO\nEVALUARE SI ES PAR O NO : ");
    var dato = Integer.parseInt(x.nextLine());

    var resultado = (dato % 2 == 0) ? "Numero par" : "Numero impar";
    System.out.println(resultado);


    //Calcular si es mayor de edad.
    System.out.print("Ingrese su edad actual : ");
    var edad = Integer.parseInt(x.nextLine());

    resultado = (edad >= 18) ? "Es mayor de edad." : "Es menor de edad";
    System.out.println(resultado);

    //Calcular si un numero es mayor, menor o cero (anidado).
    System.out.print("Ingrese un numero cualquiera : ");
    var numero = Integer.parseInt(x.nextLine());

    resultado = (numero > 0) ? "Su numero es positivo" : (numero < 0) ? "Su numero es negativo" : "Su numero es 0.";
    System.out.println(resultado);

}
}
