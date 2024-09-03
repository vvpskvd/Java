package RETOS_JAVA; //IGNORAR ESTO
import javax.swing.*;

public class sistemaEmpleados
{
    public static void main(String[] args)
    {
        var nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo");
        var edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad actual"));
        var salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su salario actual"));
        var jefe = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "¿Es jefe de departamento (TRUE = SI \\ FALSE = NO?"));

        JOptionPane.showMessageDialog(null, "Su nombre completo es " + nombre +"\n" +
                "Su edad es " + edad + "\n" +
                "Su salario es $" + salario + "\n" +
                "¿Ud es jefe de departamento? : " + jefe);
    }
}
