package DATOS_EN_JAVA;

public class ejercicioVAR {
    public static void main(String[] args) {
        System.out.println("VARIABLES VAR");
        String nombre1 = "juan";
        System.out.println("Nombre1 : " + nombre1);

        var nombre2 = "carlos";
        System.out.println("Nombre2 : " + nombre2);

        var sueldo = 500.5F;
        System.out.println(sueldo);

        var nombre = "Daniel";
        var apellido = "Arevalo";

        var nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
    }
}
