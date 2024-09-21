import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalEstudiantes = 0, totalHombres = 0, totalMujeres = 0, totalIngenieria = 0, mujeresIngenieria  = 0, sumaEdadIngenieria = 0, totalIngenieriaEstudiantes = 0;

        char continuar;

        do {
            System.out.print("\nIntroduzca la edad: ");
            int edad = input.nextInt();

            System.out.print("Introduzca el sexo (M/F): ");
            char sexo = input.next().charAt(0);
            if (sexo == 'M' || sexo == 'm') {
                totalHombres++;
            } else if (sexo == 'F' || sexo == 'f') {
                totalMujeres++;
            }

            System.out.print("Introduzca la carrera:\n1. Ingeniería\n2. Diseño de modas\n3. Logística\n4. Finanzas\n5. Diseño gráfico\n");
            int carrera = input.nextInt();
            if (carrera == 1) {
                totalIngenieriaEstudiantes++;
                sumaEdadIngenieria += edad;
                if (sexo == 'F' || sexo == 'f') {
                    mujeresIngenieria++;
                }
            }

            totalEstudiantes++;

            System.out.print("\n¿Desea ingresar otro estudiante?\n (S/N): ");
            continuar = input.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        double promedioEdadIngenieria = (totalIngenieriaEstudiantes > 0) ? (double) sumaEdadIngenieria / totalIngenieriaEstudiantes : 0;

        double porcentajeHombres = (totalEstudiantes > 0) ? (double) totalHombres / totalEstudiantes * 100 : 0;

        double porcentajeMujeresIngenieria = (totalIngenieriaEstudiantes > 0) ? (double) mujeresIngenieria / totalIngenieriaEstudiantes * 100 : 0;

        System.out.println("\nEl promedio de la edad de los estudiantes de Ingeniería: " + promedioEdadIngenieria);
        System.out.println("El porcentaje de los hombres en la universidad: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de las mujeres en Ingeniería: " + porcentajeMujeresIngenieria + "%");

        input.close();
    }
}