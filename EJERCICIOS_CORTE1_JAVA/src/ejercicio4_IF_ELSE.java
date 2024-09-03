import java.util.*;

class ejercicio4_IF_ELSE
{ public static void main(String[] args) {
    /*
    Calcule el numero del medio entre 3 numeros previamente leidos.
     */
    Scanner x = new Scanner(System.in);

    System.out.print("Digite el numero 1 : ");
    var dato1 = Integer.parseInt(x.nextLine());

    System.out.print("Digite el numero 2 : ");
    var dato2 = Integer.parseInt(x.nextLine());

    System.out.print("Digite el numero 3 : ");
    var dato3 = Integer.parseInt(x.nextLine());

    //DATO 1 COMPARACION
    if (dato1 > dato2 && dato1 < dato3) {
        System.out.println("EL PRIMER DATO = "+ dato1 + " ES EL NUMERO DE EN MEDIO.");
    }
    else if (dato1 < dato2 && dato1 > dato3) {
        System.out.println("EL PRIMER DATO = "+ dato1 + " ES EL NUMERO DE EN MEDIO.");
    }
    //DATO 2 COMPARACION
    else if (dato2 > dato1 && dato2 < dato3) {
        System.out.println("EL SEGUNDO DATO = "+ dato2 + " ES EL NUMERO DE EN MEDIO.");
    }
    else if (dato2 < dato1 && dato2 > dato3) {
        System.out.println("EL SEGUNDO DATO = "+ dato2 + " ES EL NUMERO DE EN MEDIO.");
    }
    //DATO 3 COMPARACION
    else if (dato3 > dato1 && dato3 < dato2){
        System.out.println("EL TERCER DATO = "+ dato3 + " ES EL NUMERO DE EN MEDIO.");
    }
    else if (dato3 < dato1 && dato3 > dato2){
        System.out.println("EL TERCER DATO = "+ dato3 + " ES EL NUMERO DE EN MEDIO.");
    }
}
}