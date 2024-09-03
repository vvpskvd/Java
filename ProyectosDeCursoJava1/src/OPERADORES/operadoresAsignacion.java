package OPERADORES; //IGNORAR ESTO

public class operadoresAsignacion
{
    public static void main(String[] args) {
        var miNumero1 = 5;
        var miNumero2 = 10;
        var miNumero3 = 20;
        var miNumero4 = 15;
        var miNumero5 = 30;

        //Asignacion
        // +=
        miNumero1 += 5;
        System.out.println("miNumero1 = " + miNumero1); //debe ser 10 xq 5+5 = 10

        // -=
        miNumero2 -= 10;
        System.out.println("miNumero2 = " + miNumero2); //debe ser 0 xq 10-10 = 0

        // *=
        miNumero3 *= 2;
        System.out.println("miNumero3 = " + miNumero3); //debe ser 40 xq 20*2 = 40

        // /=
        miNumero4 /= 5;
        System.out.println("miNumero4 = " + miNumero4); //debe ser 3 xq 15/5 = 3
    }
}
