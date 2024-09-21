import javax.swing.*;
public class ejercicio17_IF_ELSE
{ public static void main(String[] args) {
    /*
    Se tienen los rasgos de una persona.
    Hacer un algoritmo que determine si la persona es :
    - Hindo alto.
    - Latino mediano.
    - Latino.
    - Germano bajo.
    - Germano menor de 30 años.
    - Latino bajo menor de 30 años.
     */

    var estatura = Integer.parseInt(JOptionPane.showInputDialog(null,
            "¿Que estatura tiene actualmente?\n1 - Alto\n2 - Mediano\n3 - Bajo"));
    var nacionalidad = Integer.parseInt(JOptionPane.showInputDialog(null,
            "¿Que nacionalidad tiene?\n1 - Latino\n2 - Germano\n3 - Hindu"));
    var edad = Integer.parseInt(JOptionPane.showInputDialog(null,
            "¿Que edad tiene?"));

    var resultadoEstatura = switch(estatura) {
        case 1 -> "ALTO";
        case 2 -> "MEDIANO";
        case 3 -> "BAJO";
        default -> "ESTATURA NO VALIDA.";
    };
    var resultadoNacionalidad = switch(nacionalidad) {
        case 1 -> "LATINO";
        case 2 -> "GERMANO";
        case 3 -> "HINDU";
        default -> "ESTATURA NO VALIDA.";
    };

    var resultado = (resultadoNacionalidad.equals("HINDU") && resultadoEstatura.equals("ALTO")) ? "Ud es Hindu y de estatura Alta." :
                    (resultadoNacionalidad.equals("LATINO") && resultadoEstatura.equals("MEDIANO")) ? "Ud es Latino de estatura Mediana." :
                    (resultadoNacionalidad.equals("GERMANO") && resultadoEstatura.equals("BAJO")) ? "Ud es Germano de estatura Baja.":
                    (resultadoNacionalidad.equals("GERMANO") && edad < 30 ) ? "Ud es germano de menos de 30 años":
                    (resultadoNacionalidad.equals("LATINO") && resultadoEstatura.equals("BAJO") && edad < 40 ) ? "Ud es Latino menor de 40 años y de estatura Baja.": "No entra en ningun parametro.";

    JOptionPane.showMessageDialog(null,
            resultado);
}
}
