package CADENAS;

public class reemplazarCadenas {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("Cadena Original : " + cadena);

        //Se reemplazara "Mundo" con "a Todos"
        var nuevaCadena = cadena.replace("Mundo", "a Todos");
        System.out.println("Nueva Cadena : " + nuevaCadena);

        //Se reemplaza "Hola" con "Adios"
        nuevaCadena = nuevaCadena.replace("Hola", "Adios");
        System.out.println("Ultima nueva Cadena : " + nuevaCadena);
    }
}
