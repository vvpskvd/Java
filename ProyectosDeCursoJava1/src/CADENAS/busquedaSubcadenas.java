package CADENAS;

public class busquedaSubcadenas {
    public static void main(String[] args) {
        //BUSCAR LA SUBCADENA DE UNA CADENA (EL NUMERO INICIAL CON "indexOf".)
        var cadena = "HOLA MUNDO";

        //buscamos la cadena de "HOLA"
        var cadena1 = cadena.indexOf("HOLA");
        System.out.println(cadena1);

        //buscamos la cadena de "MUNDO"
        var cadena2 = cadena.indexOf("MUNDO");
        System.out.println(cadena2);

        //Si la subcadena no se encuentra devolvera -1
        var cadena3 = cadena.indexOf("hola");
        System.out.println(cadena3);
    }
}
