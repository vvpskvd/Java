package CICLOS; //IGNORAR ESTO

public class palabraBreak_y_Continue
{ public static void main(String[] args) {
    //IMPRIMIR SOLO EL 1° NUMERO PAR.
    for (var num = 1 ; num <= 10 ; num++) {
        if (num % 2 == 0) {
            System.out.println(num);
            break;
        }
    }

    //EJEMPLO, IMPRIMIR NUMEROS PARES SIN NUMEROS IMPARES
    for (var num = 1 ; num <= 10 ; num++) {
        if( num % 2 == 1) {
            continue; //ACA DEVUELVE A ESTAR ARRIBA A ITERAR HASTA QUE SEA UN NUM PAR
        }
        System.out.print(num + " "); //CUANDO SEA PAR AHI SI IMPRIME
    }

    System.out.println(" ");

    //SI QUIERO IMPRIMIR SOLO VALORES ENTRE 10 Y 10 HASTA EL 100
    for (var num = 1 ; num <= 100 ; num++) {
        if (num % 10 != 0) {
            continue;
        }
        System.out.print(num + " ");
    }
}
}
