package SENTENCIAS_DECISION; //IGNORAR ESTO
import java.util.*;

public class usoIF
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.print("Ingrese su edad actual : ");
    var edad = Integer.parseInt(x.nextLine());

    if(edad >= 18) {
        System.out.println("UD ES MAYOR DE EDAD.");
    } else if (edad > 0){
        System.out.println("UD ES MENOR DE EDAD.");
    } else {
        System.out.println("EDAD INVALIDA.");
    }
}
}
