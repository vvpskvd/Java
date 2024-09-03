public class Casting {
    public static void main(String[] args) {
        double numeroDouble = 9.78;
        int numeroInt = 4;

        double suma = (double)numeroInt + numeroDouble;
        System.out.println(suma);

        //USANDO OTRO MODO
        String numeroString = "1524";
        int numero1 = Integer.parseInt(numeroString);
        float numero2 = Float.parseFloat(numeroString);
        double numero3 = Double.parseDouble(numeroString);
        System.out.println("El numero final es = " + numero1);
        System.out.println("El numero final es = " + numero2);
        System.out.println("El numero final es = " + numero3);
    }
}
