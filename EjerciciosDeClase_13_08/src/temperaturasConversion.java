//Library SCANNER
import java.util.Scanner;

public class temperaturasConversion {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Que grados desea convertir \nCelsius a Fahrenheit = 1 \nFarenheit a Kelvin = 2 \nKelvin a Celsius = 3 \n===> ");
        int major = x.nextInt();
        switch (major) {
            case 1:
                System.out.print("Cual es la temperatura Celsius a convertir = ");
                float cel = x.nextFloat();
                float total_cel = ((cel * 9/5) + 32);
                System.out.println(cel + "°C convertidos a " + total_cel + "°F");
                break;
            case 2:
                System.out.print("Cual es la temperatura Fahrenheit a convertir = ");
                double far = x.nextFloat();
                double total_far = (((far - 32) * 5/9) + 273.15);
                System.out.println(far + "°F convertidos a " + total_far + "°K");
                break;
            case 3:
                System.out.print("Cual es la temperatura Fahrenheit a convertir = ");
                double kel = x.nextFloat();
                double total_kel = (kel - 273.15);
                System.out.println(kel + "°K convertidos a " + total_kel + "°C");
                break;
        }
    }
}
