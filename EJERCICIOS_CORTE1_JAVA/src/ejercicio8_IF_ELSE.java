import java.util.*;
import static java.lang.Math.*;

public class ejercicio8_IF_ELSE
{ public static void main(String[] args) {
     /*
     DADOS 3 VALORES POSITIVOS, DETERMINAR SI ESTOS FORMAN UN TRIANGULO, SI LO HACEN DECIR SI EL TRIANGULO ES
     EQUILATERO, ISOCELES, O ESCALENO; Y OBTENER EL AREA.
      */
    Scanner x = new Scanner(System.in);

    System.out.print("DIGITE EL 1° LADO : ");
    double dato1 = Double.parseDouble(x.nextLine());
    System.out.print("DIGITE EL 2° LADO : ");
    double dato2 = Double.parseDouble(x.nextLine());
    System.out.print("DIGITE EL 3° LADO : ");
    double dato3 = Double.parseDouble(x.nextLine());

    var resultadoEs_o_No_Triangulo = (dato1+dato2 > dato3) ? "Es triangulo." :
                                     (dato2+dato3 > dato1) ? "Es triangulo." :
                                     (dato1+dato3 > dato2) ? "Es triangulo." : "No es triangulo.";

    var resultadoTipoTriangulo = (dato1 == dato2 && dato2 == dato3) ? "Es Equilatero." :
                                 (dato1 == dato2 || dato2 == dato3) ? "Es Isoceles." : "Es escaleno.";


    //SE USARA LA FORMULA DE HERON PARA EL AREA.
            //SE SACARA PRIMERO EL SEMIPERIMETRO
            //Semiperimetro = s
    double s = (dato1+dato2+dato3) / 2;
            //SE SACA AHORA EL AREA.
    var areaTriangulo = sqrt( s * (s-dato1) * (s-dato2) * (s - dato3) );

    System.out.printf("""
            EL area del triangulo es = %.0f
            SI es o NO es triangulo = %s
            Y el tipo de triangulo si es que puede formar un triangulo = %s
            """, areaTriangulo, resultadoEs_o_No_Triangulo, resultadoTipoTriangulo);
}
}
