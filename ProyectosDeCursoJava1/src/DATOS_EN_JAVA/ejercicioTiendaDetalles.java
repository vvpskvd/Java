package DATOS_EN_JAVA;

import java.util.Scanner;


public class ejercicioTiendaDetalles {
    public static void main(String[] args) {
        String nombreDelProducto = "Malteada de Chele";
        int precio = 5000;
        int cantidadDisponible = 35;
        boolean isDisponible = true;
        System.out.println(nombreDelProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(isDisponible);

        System.out.println("//////////////////////////////");

        //Nuevos datos
        nombreDelProducto = "Malteada de Chele Achocolatada";
        precio = 10000;
        cantidadDisponible = 0;
        isDisponible = false;
        System.out.println(nombreDelProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(isDisponible);
        Scanner x = new Scanner(System.in);
        System.out.println("EDAD = ");
        var edad = x.nextFloat();
        if (edad >= 18) {
            System.out.println("ud es mayor de edad");
        } else {
            System.out.println("ud no es mayor de edad");
        }

    }
}
