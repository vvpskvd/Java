import javax.swing.*;
public class ejercicio16_IF_ELSE
{ public static void main(String[] args) {
        /*
        Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que 3 son de igual peso y una diferente.
        Elaborar un algoritmo que determine cual es la esfera diferente y si es de mayor o menor peso.
         */

    var datoA = Integer.parseInt(JOptionPane.showInputDialog(null,
            "INGRESE LA ESFERA A "));
    var datoB = Integer.parseInt(JOptionPane.showInputDialog(null,
            "INGRESE LA ESFERA B "));
    var datoC = Integer.parseInt(JOptionPane.showInputDialog(null,
            "INGRESE LA ESFERA C "));
    var datoD = Integer.parseInt(JOptionPane.showInputDialog(null,
            "INGRESE LA ESFERA D "));

    //DATO A
    if (datoA > datoB && datoA > datoC && datoA > datoD) {
        JOptionPane.showMessageDialog(null,
                "El dato A es la de mayor peso.");
    }
    else if(datoA < datoB && datoA < datoC && datoA < datoD) {
        JOptionPane.showMessageDialog(null,
                "El dato A es la de menor peso.");
    }
    //DATO B
    else if (datoB > datoA && datoB > datoC && datoB > datoD) {
        JOptionPane.showMessageDialog(null,
                "El dato B es la de mayor peso.");
    }
    else if(datoB < datoA && datoB < datoC && datoB < datoD) {
        JOptionPane.showMessageDialog(null,
                "El dato B es la de menor peso.");
    }
    //DATO C
    if (datoC > datoB && datoC > datoA && datoC > datoD) {
        JOptionPane.showMessageDialog(null,
                "El dato C es la de mayor peso.");
    }
    else if(datoC < datoB && datoC < datoA && datoC < datoD) {
        JOptionPane.showMessageDialog(null,
                "El dato C es la de menor peso.");
    }
    //DATO D
    if (datoD > datoA && datoD > datoB && datoD > datoC) {
        JOptionPane.showMessageDialog(null,
                "El dato D es la de mayor peso.");
    }
    else if(datoD < datoA && datoD < datoB && datoD < datoC) {
        JOptionPane.showMessageDialog(null,
                "El dato D es la de menor peso.");
    }
}
}
