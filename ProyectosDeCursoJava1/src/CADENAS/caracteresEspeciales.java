package CADENAS;

public class caracteresEspeciales {
    public static void main(String[] args) {
        // el \n para salto de linea.
        var cadena1 = "HOLA\nMUNDO";
        System.out.println("cadena1 = " + cadena1);

        // el \t para tabula la linea.
        var cadena2 = "HOLA\tMUNDO";
        System.out.println("cadena2 = " + cadena2);

        // el \" añade comillas dobles.
        var cadena3 ="\"HOLA MUNDO\"";
        System.out.println("cadena3 = " + cadena3);

        // el \' añade comillas simples.
        var cadena4 ="\'HOLA MUNDO\'";
        System.out.println("cadena4 = " + cadena4);

        // el \\ añade una diagonal invertida
        var cadena5 = "\\ HOLA \\ MUNDO \\";
        System.out.println("cadena = " + cadena5);
    }
}
