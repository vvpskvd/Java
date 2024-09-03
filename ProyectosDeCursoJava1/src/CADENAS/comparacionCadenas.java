package CADENAS;

public class comparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "java";
        var cadena2 = "java";
        //comparamos las dos cadenas (referencia en RAM)
        System.out.print("La cadena1 es igual a la cadena2? :");
        System.out.println(cadena1.equals(cadena2));
    }
}
