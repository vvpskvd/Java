import java.util.Scanner;

public class IMC
{
    /*
    1). Metodos para calcular el IMC y la clasificacion segun el OMS.
     */
    public static double calculoIMC (double peso, double altura) {
        return (peso / Math.pow(altura, 2));
    }

    public static double promedioCalculo(double totalPersonas, double IMC_TotalPromedio,Scanner scanner) {
        for (int i = 0; i < totalPersonas; i++) {
            System.out.print("Persona #" + (i+1) + ", Ingrese su Peso actual en Kilogramos = ");
            var peso = Double.parseDouble(scanner.nextLine());
            System.out.print("Persona #" + (i+1) + ", Ingrese su altura en metros = ");
            var altura = Double.parseDouble(scanner.nextLine());

            var IMC = calculoIMC(peso, altura);
            IMC_TotalPromedio += IMC;
        }
        return IMC_TotalPromedio/totalPersonas;
    }

    public static String clasificacion (double promedioFinal) {
        if (promedioFinal < 18.5) {
            return "Bajo Peso";
        } else if (promedioFinal > 18.5 && promedioFinal < 24.9){
            return "Normal";
        } else if (promedioFinal > 24.9 && promedioFinal < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public static void main(String[] args) {
        double IMC_TotalPromedio = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantas personas desea ingresar = ");
        var totalPersonas = Integer.parseInt(scanner.nextLine());

        var promedioFinal = promedioCalculo(totalPersonas, IMC_TotalPromedio, scanner);
        var clasificacionPersonas = clasificacion(promedioFinal);
        System.out.printf("""
                    Su promedio entre las %d persona/s
                    Es de %.2f como total de IMC
                    La clasificacion del IMC de esas %d personas es %s
                    """, totalPersonas, promedioFinal, totalPersonas, clasificacionPersonas);

    }
}
