import java.util.Scanner;

public class ejercicio7_FOR_WHILE
{ public static void main(String[] args) {
    /*
    Elaborar un algoritmo que encuentre la desviacion tipica de un grupo de datos positivos
     */
    Scanner x = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de datos:");
    int n = x.nextInt();
    double[] datos = new double[n];

    System.out.println("Ingrese los datos:");
    for (int i = 0; i < n; i++) {
        datos[i] = x.nextDouble();
    }

    double media = calcularMedia(datos);
    double desviacionTipica = calcularDesviacionTipica(datos, media);

    System.out.println("La desviación típica es: " + desviacionTipica);
}

public static double calcularMedia(double[] datos) {
    double suma = 0;
    for (double dato : datos) {
        suma += dato;
    }
    return suma / datos.length;
}

public static double calcularDesviacionTipica(double[] datos, double media) {
    double suma = 0;
    for (double dato : datos) {
        suma += Math.pow(dato - media, 2);
    }
    double varianza = suma / datos.length;
    return Math.sqrt(varianza);
}
}