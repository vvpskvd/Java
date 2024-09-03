package CADENAS;

public class inmutabilidadCadenas {
    public static void main(String[] args) {
        //inmutabilidad de Cadenas
        var cadena1 = "hola";
        System.out.println("Cadena 1 = " + cadena1);
        var cadena2 = cadena1;

        cadena1 = "adios";
        System.out.println("Cadena 1 modificada = " + cadena1);
        System.out.println("Cadena 1 vieja pero ahora en la cadena 2 = " + cadena2);
    }
}
