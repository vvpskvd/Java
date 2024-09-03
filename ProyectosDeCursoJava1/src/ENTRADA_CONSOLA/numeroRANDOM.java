package ENTRADA_CONSOLA; //IGNORAR ESTO
import java.util.*;

public class numeroRANDOM
{
    public static void main(String[] args) {
        Random x = new Random();

        //UN NUMERO DE 1 A 11
        int numero1a9 = x.nextInt(11) + 1;

        //Al llegar a un numero mayor que 10 se para.
        while (numero1a9 <= 10) {
            numero1a9 = x.nextInt(11) + 1;
            System.out.println("numero random de 1 a 10 = " + numero1a9);
        }
        
        //Generar un numero entre 0.0 y 1.0
        var flotante = x.nextFloat();
        System.out.println("flotante = " + flotante);
    }
}
