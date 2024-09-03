package RETOS_JAVA; //IGNORAR ESTO

public class retoSumar5primerosNumeros
{ public static void main(String[] args) {
    var valorMaximo = 5;
    var acumuladorSUma = 0;
    var numero = 1;

    do {
        System.out.println(acumuladorSUma + " + " + numero);
        acumuladorSUma += numero;
        System.out.println("es igual a = " + acumuladorSUma + "\n");
        numero++;
    } while(numero <= valorMaximo);

    System.out.println("La suma de los primeros " + valorMaximo +" numeros es : " + acumuladorSUma);
}
}
