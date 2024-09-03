package DATOS_EN_JAVA;

public class tiposCaracteres {
    public static void main(String[] args) {
        int entero = 999999999; //9999999999 es ya el maximo en int, despues es long
        System.out.println(entero);

        long largo = 999999999999999999L; //el maximo es 9999999999999999999L como tipo long, se usa L para declararlo para que sea mas largo el numero
        System.out.println(largo);

        float flotante = 99999999999999999999999999999999999999.9999999999F; //este es el maximo como flotante
        System.out.println(flotante);

        double doble = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.999999999999999999D;
        //Y SIGUE ASI PORQUE ES MUY LARGO, SE USA D PARA QUE SEA TIPO DOuBLE MAS LARGO
        System.out.println(doble);
    }
}
