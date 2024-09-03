import java.util.*;
public class ejercicio1_FOR
{ public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);

        var edad = 0.0;
        var edadFinal = 0.0;
        var edadCalculo = 0.0;
        int major;

        for(major = 1 ; edadCalculo <= 45 ;major++){
            System.out.print("Ingrese una edad :");
            edad = x.nextDouble();

            edadFinal += edad;
            edadCalculo = edadFinal / major;
        }

        System.out.println("Ingreso " + (major-1) + " edades.");
        System.out.println("Su promedio final fue de : " + edadCalculo);
}
}
