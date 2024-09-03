package ENTRADA_CONSOLA; //IGNORAR ESTO
import java.util.*;

public class simularDado
{
    public static void main(String[] args) {
        Random x = new Random();

        for (var i = 0 ; i<3 ; i++){
            var dado = x.nextInt(6) + 1;
            System.out.println("dado " + (i+1) + " = " + dado);
        }
    }
}
