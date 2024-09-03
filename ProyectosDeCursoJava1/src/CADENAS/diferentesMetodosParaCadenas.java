package CADENAS;

public class diferentesMetodosParaCadenas {
    public static void main(String[] args) {
        var cadena = "Hola mundo!";

        //Obtener el largo de una cadena.
        var longitudCadena = cadena.length();
        System.out.println("La longitud total es : " + longitudCadena);

        //Reemplazar caracteres.
        var reemplazoCadena = cadena.replace('o', 'a');
        System.out.println("DEBERIA DECIR \"Hala Munda!\"");
        System.out.println("Resultado final : " + reemplazoCadena);

        //Convertir a mayusculas
        var mayusCadena = cadena.toUpperCase();
        System.out.println("La cadena en mayusculas es : " + mayusCadena);

        //Convertir a minusculas
        System.out.println("La cadena en minusculas es : " + cadena.toLowerCase());

        //Eliminar espacios al inicio y al final.
        var cadenaEspaciada = " DANIEL AREVALO ";
        System.out.println(cadenaEspaciada);
        System.out.println("Eliminar espacios al inicio y final es : " + cadenaEspaciada.trim());
    }
}
