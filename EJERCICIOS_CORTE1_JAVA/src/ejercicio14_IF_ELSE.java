import javax.swing.*;
public class ejercicio14_IF_ELSE
{ public static void main(String[] args) {
    final var creditoPregrado = 50000;
    final var creditoPosgrado = 300000;
    var creditos = 0;
    var totalCreditos = 0;
    var descuento = 0;
    var totalPagar = 0;
    /*
    Cierta universidad tiene un programa para estimular a los estudiantes con buen rendimiento academico.

    Si el promedio es de 4.5 o mas, y el alumno es de pregrado, entonces cursara 28 creditos y se le hara un 25% de descuento.
    Si el promedio es mayor o igual a 4.0 pero menor que 4.5, y el alumno es de pregrado, entonces cursara 25 creditos y se le hara un 10% de descuento.
    Si el promedio es mayor que 3.5 y menor que 4.0, y el aulumno es de pregrado, cursara 20 creditos y no tendra ningun descuento
    Si el promedio es mayor o igual a 2.5 y menor que 3.5 y el alumno es de pregrado, cursara 15 creditos y no tendra descuento.
    Si el promedio es menor de 2.5, y el alumno es de pregrado, no podra matricularse.

    Si el promedio es mayor o igual a 4.5 y el alumno es de posgrado, cursara 20 creditos y se le hara un 20% de descuento.
    Si el promedio es menor de 4.5 y el alumno es de posgrado, cursara 10 creditos y no tendra descuento.
    Hacer un algoritmo que determine cuanto debe pagar un estudiante y cuantos creditos registra si el valor de cada credito es de 50 000
    para pregado y 300 00 para posgrado.
    */

    var promedio = Double.parseDouble(JOptionPane.showInputDialog(null,
            "BIENVENIDO A CALCULO DE CREDITOS POSGRADO \\ PREGRADO\nDIGITE SU PROMEDIO A CONTINUACION\n(PORFAVOR, SOLO EN DECIMALES.)"));
    String tipoGrado = JOptionPane.showInputDialog(null,
            "DIGITE SU GRADO QUE ACTUALMENTE CURSA\nPREGRADO \\ POSGRADO");

    //PREGRADO
    if (promedio >= 4.5 && (tipoGrado.equals("PREGRADO") || tipoGrado.equals("pregrado"))) {
        creditos = 28;
        totalCreditos = creditoPregrado * creditos;
        descuento = (int) (totalCreditos * 0.25);
        totalPagar = totalCreditos - descuento;

        JOptionPane.showMessageDialog(null,
                "Su total de creditos es $" + totalCreditos + "\nActualmente tiene promedio de 4.5  o mas.\nSe le dara un descuento del 25% dando como total $" + totalPagar);
    }
    else if (promedio >= 4.0 && promedio < 4.5 && (tipoGrado.equals("PREGRADO") || tipoGrado.equals("pregrado"))) {
        creditos = 25;
        totalCreditos = creditoPregrado * creditos;
        descuento = (int) (totalCreditos * 0.10);
        totalPagar = totalCreditos - descuento;

        JOptionPane.showMessageDialog(null,
                "Su total de creditos es $" + totalCreditos + "\nActualmente tiene promedio entre 4.0 y 4.4\nSe le dara un descuento del 10% dando como total $" + totalPagar);
    }
    else if (promedio >= 3.5 && promedio < 4.0 && (tipoGrado.equals("PREGRADO") || tipoGrado.equals("pregrado"))) {
        creditos = 20;
        totalCreditos = creditoPregrado * creditos;
        JOptionPane.showMessageDialog(null,
                "Su total de creditos es $" + totalCreditos + "\nActualmente tiene promedio entre 3.5 y 3.9\nSin descuento.");
    }
    else if (promedio >= 2.5 && promedio < 3.5 && (tipoGrado.equals("PREGRADO") || tipoGrado.equals("pregrado"))) {
        creditos = 15;
        totalCreditos = creditoPregrado * creditos;
        JOptionPane.showMessageDialog(null,
                "Su total de creditos es $" + totalCreditos + "\nActualmente tiene promedio entre 2.5 y 3.4\nSin descuento.");
    }
    else if (promedio < 2.5 && (tipoGrado.equals("PREGRADO") || tipoGrado.equals("pregrado"))) {
        JOptionPane.showMessageDialog(null,
                "NO PODRA MATRICULARSE, INTENTE NUEVAMENTE EL PROXIMO SEMESTRE...");
    }

    //POSGRADO
    else if (promedio >= 4.5 && (tipoGrado.equals("POSGRADO") || tipoGrado.equals("posgrado"))) {
        creditos = 20;
        totalCreditos = creditoPosgrado * creditos;
        descuento = (int) (totalCreditos * 0.20);
        totalPagar = totalCreditos - descuento;

        JOptionPane.showMessageDialog(null,
                "Su total de creditos es $" + totalCreditos + "\nActualmente tiene promedio entre 4.5 o mas.\nSe le dara un descuento del 20% dando como total $" + totalPagar);
    }
    else if (promedio < 4.5 && (tipoGrado.equals("POSGRADO") || tipoGrado.equals("posgrado"))) {
        creditos = 10;
        totalCreditos = creditoPosgrado * creditos;

        JOptionPane.showMessageDialog(null,
                "Su total de creditos es $" + totalCreditos + "\nActualmente tiene promedio menor a 4.5\nSin descuento.");
    }
}
}