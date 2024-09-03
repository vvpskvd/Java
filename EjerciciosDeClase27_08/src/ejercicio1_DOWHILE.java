import java.util.*;

public class ejercicio1_DOWHILE
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        var edad = 0.0;
        var major = 0;
        var edadFinal = 0.0;
        var edadCalculo = 0.0;

        do  {
            System.out.print("Ingrese una edad :");
            edad = x.nextDouble();

            edadFinal += edad;
            major++;

            edadCalculo = edadFinal / major;
        } while (edadCalculo <= 45);

        System.out.println("Ingreso " + major + " edades.");
        System.out.println("Su promedio final fue de : " + edadCalculo);
    }
}
