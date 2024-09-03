package CADENAS;

import javax.swing.*;

public class cadenasConcatenacion_y_Length {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, """
                Buenos dias esto es una cadena en java, simple y rapida
                aveces buenos dias y otras buenas noches
                amen amen
                ahora pa cerrar presiona OK
                """);

        //para recuperar caracteres en una cadena de caracteres
        var cadena1 = "DANIEL AREVALO";

        //recuperar el primer caracter de HOLA MUNDO
        for (int i = 0; i < cadena1.length(); i++) {
            var caracteresUno_Uno = cadena1.charAt(i);
            System.out.println(caracteresUno_Uno);
        }
        System.out.println("El total de caracteres en la cadena es : " + cadena1.length());
    }
}
