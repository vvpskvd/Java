package RETOS_JAVA; //IGNORAR ESTO

public class numerosImparesWHILE
{ public static void main(String[] args) {
     var contador = 0;

     while (contador <= 20 ) {
         if (contador % 2 != 0) {
             System.out.println(contador);
         }
         contador++;
     }
}
}
