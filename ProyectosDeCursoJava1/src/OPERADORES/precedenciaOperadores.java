package OPERADORES; //IGNORAR ESTO

public class precedenciaOperadores
{ public static void main(String[] args) {
    var a = 12 / 3 + 2 * 3 - 1;
    //el orden que seguiria es:
    // 12 / 3 = 4
    // 2 * 3 = 6
    // 4 + 6 = 10
    // 10 - 1 = 9
    System.out.println("a = " + a);
}
}
