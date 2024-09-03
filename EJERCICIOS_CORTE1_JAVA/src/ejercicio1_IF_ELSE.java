import java.util.*;

public class ejercicio1_IF_ELSE
{ public static void main(String[] args) {
    /*
    ELABORAR UN ALGORITMO QUE ENTRE EL NOMBRE DE UN EMPLEADO, SU SALARIO BASICO POR HORA Y EL NUMERO DE
    HORAS TRABAJADAS EN EL MES, Y QUE ADEMAS ESCRIBA SU NOMBRE Y SALARIO MENSIAL SI ESTE ES MAYOR DE $850 000, DE LO
    CONTRARIO, QUE ESCRIBA SOLO EL NOMBRE.
    */
    Scanner x = new Scanner(System.in);
    StringBuilder x2 = new StringBuilder();

    System.out.print("Ingrese su nombre completo : ");
    var nombre = x.nextLine();
    System.out.print("Ingrese su Salario por Hora : ");
    var salario = Integer.parseInt(x.nextLine());
    System.out.print("Ingrese cuantas horas trabaja al mes : ");
    var horas = Integer.parseInt(x.nextLine());

    if(salario>850000) {
        x2.append("Datos del Empleado :").append("\n\t Nombre : ").append(nombre.trim()).append("\n\t Salario : COP$ ").append(salario).append("\n\t Horas : ").append(horas);
        var resultado = x2.toString();
        System.out.println(resultado);
    }
    else {
        x2.append("Datos del Empleado : \n").append("\t Nombre : ").append(nombre.trim());
        var resultado = x2.toString();
        System.out.println(resultado);
    }
}
}