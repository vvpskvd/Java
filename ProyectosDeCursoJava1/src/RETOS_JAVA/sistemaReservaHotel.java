package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class sistemaReservaHotel
{ public static void main(String[] args) {
    final var cuartoSinVistaMar = 150.50;
    final var cuartoConVistaMar = 190.50;

     Scanner x = new Scanner(System.in);

    System.out.print("Ingrese su nombre completo : ");
    var nombre = x.nextLine();

    System.out.print("¿Cuantos dias se alojara en el hotel : ");
    var dias = Integer.parseInt(x.nextLine());

    System.out.print("¿Desea cuarto con vista al mar? : ");
    var cuartoMar = x.nextLine();

    var resultado = (cuartoMar.equals("si") || cuartoMar.equals("SI")) ? cuartoConVistaMar * dias : cuartoSinVistaMar * dias;

    System.out.printf("""
            \t\t---FACTURA HOTEL---
            \tNombre : %s.
            \tSe hospedara %d dias.
            \tSu cuarto sera con vista al mar : %s.
            \tEl total de su estadia es : $%.2f USD
            """, nombre.trim(), dias, cuartoMar, resultado);
}
}
