package RETOS_JAVA; //IGNORAR ESTO
import java.util.*;

public class calculoArea_y_Perimetro
{ public static void main(String[] args) {
    Scanner x = new Scanner(System.in);

    System.out.println("Ingrese la base del rectangulo : ");
    var base = Double.parseDouble(x.nextLine());

    System.out.println("Ingrese la altura del rectangulo : ");
    var altura = Double.parseDouble(x.nextLine());

    var totalArea = base * altura;
    var totalPerimetro = 2 * (base + altura);

    System.out.printf("""
            El area total es : %.0f
            El perimetro total es : %.0f
            """, totalArea, totalPerimetro);
}
}
