package CADENAS;

public class temaSubcadenas {
    public static void main(String[] args) {
        //TEMA DE SUBCADENAS
        /*El indicine final es numero-1 en ese caso seria:
        HOLA MUNDO tiene 0 a 9 caracteres, el numero inicial si se pone, el numero final que en este caso es hasta "HOLA"
        asi que son 0 a 3 pero se coloca 4 para ir de 0 a 3, si se coloca 3 seria de 0 a 2.
        */

        var cadena = "hola mundo";
        System.out.println("Cadena = " + cadena);
        var subCadena = cadena.substring(0, 4);
        System.out.println("Subcadena de hola : " + subCadena);

        //GENERA LA CADENA DE MUNDO
        var subCadena2 = cadena.substring(5, 10);
        System.out.println("Subcadena de MUNDO : " + subCadena2);
    }
}
