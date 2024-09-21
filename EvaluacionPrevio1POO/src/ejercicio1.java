import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int repeticion = 0;
        char S;
        double sumaAltura = 0, sumaPeso = 0;

        do {
            System.out.print("Introduzca la altura (Mt): ");
            double altura = input.nextDouble();
            sumaAltura += altura;

            System.out.print("Introduzca el peso (Kg): ");
            double peso = input.nextDouble();
            sumaPeso += peso;

            repeticion++;

            System.out.println("¿Desea ingresar otra persona? (S) Si: ");
            S = input.next().charAt(0);

        } while (S == 'S' || S == 's');

        double promedioAltura = sumaAltura / repeticion;
        double promedioPeso = sumaPeso / repeticion;

        double imc = promedioPeso / (promedioAltura * promedioAltura);

        System.out.println("El promedio de IMC del grupo es: " + imc);

        if (imc < 18.5) {
            System.out.println("El grupo tiene bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("El grupo tiene un peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("El grupo tiene sobrepeso");
        } else if (imc >= 30.0) {
            System.out.println("¡El grupo tiene obesidad!");
        } else {
            System.out.println("Error al calcular");
        }

        input.close();
    }
}