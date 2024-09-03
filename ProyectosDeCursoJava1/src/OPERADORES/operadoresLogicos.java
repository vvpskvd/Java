package OPERADORES; //IGNORAR ESTO

public class operadoresLogicos
{public static void main(String[] args) {
    /*EL OPERADOR AND (&&) REGRESA TRUE SI LOS DOS SON VERDADEROS, CONTRARIO SI UNO NO ES VERDADERO
    EL OPERADOR OR (||) REGRESA TRUE SI SOLO UNO DE LOS DOS ES VERDADERO, TAMBIEN ES VERDADERO SI LOS DOS SON VERDADEROS
    EL OPERADOR NOT (!) REGRESA EL CONTRARIO DE UNA LOGICA (SI TENEMOS UN TRUE REGRESA UN FALSE)*/

        //OPERADOR AND
    boolean a = true, b = false;
    var resultado = a && b;
    System.out.println("resultado = " + resultado);

        //OPERADOR OR
    boolean c = false, d = true;
    resultado = c || d;
    System.out.println("resultado = " + resultado);

        //OPERADOR NOT
    int e = 2, f = 3;
    resultado = !(e == f);
    System.out.println("resultado = " + resultado);
}
}
