public class ejercicio5_FOR_WHILE
{ public static void main(String[] args) {
    String dato = "*****";

    for (var i = 0 ; i <= 5 ; i++) {
        var imprimir = dato.substring(0, i);
        System.out.println(imprimir);
    }
}
}