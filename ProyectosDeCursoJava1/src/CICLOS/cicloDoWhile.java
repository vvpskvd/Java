package CICLOS; //IGNORAR ESTO

public class cicloDoWhile
{ public static void main(String[] args) {
    var contador = 10;
    System.out.println("NUMEROS INVERSOS CON DO WHILE");

    do{
        System.out.println(contador);
        contador--;
    }while (contador >= 1);

    //-------------------------------------------------------
    System.out.println("NUMEROS INVERSOS CON WHILE");

    var contador2 = 10;

    while (contador2 > 0){
        System.out.println(contador2);
        contador2--;
    }
}
}
