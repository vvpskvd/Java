import javax.swing.*;

public class ejercicio1ConIf {
    public static void main(String[] args) {
        double totalSalary;
        double sumSalary;
        double salary;
        int major;

        JOptionPane.showMessageDialog(null, "¿Cual es su salario actualmente?");
        salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Digitelo en numeros enteros o decimales"));

        major = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos años lleva actualmente en esta empresa, digite el numero a continuacion segun los parametros. \n"
                + "1 - Menos de un año. \n"
                + "2 - Entre 1 a 3 años. \n"
                + "3 - Entre 3 a 5 años. \n"
                + "4 - Mas de 5 años. "));

        if (major == 1)
        {
            JOptionPane.showMessageDialog(null, "Su salario total seria : " + salary);
        }
        else if (major == 2)
        {
            totalSalary = (salary * 5) / 100;
            JOptionPane.showMessageDialog(null, "El empleado laborando entre 1 a 3 años tiene bonificacion del 5% a su salario. Su bonificacion es " + totalSalary);
            sumSalary = totalSalary + salary;
            JOptionPane.showMessageDialog(null, "Su salario en total seria : " + sumSalary);
        }
        else if (major == 3)
        {
            totalSalary = (salary * 10) / 100;
            JOptionPane.showMessageDialog(null, "El empleado laborando entre 1 a 3 años tiene bonificacion del 5% a su salario. Su bonificacion es " + totalSalary);
            sumSalary = totalSalary + salary;
            JOptionPane.showMessageDialog(null, "Su salario en total seria : " + sumSalary);
        }
        else if (major == 4)
        {
            totalSalary = (salary * 15) / 100;
            JOptionPane.showMessageDialog(null, "El empleado laborando entre 1 a 3 años tiene bonificacion del 5% a su salario. Su bonificacion es " + totalSalary);
            sumSalary = totalSalary + salary;
            JOptionPane.showMessageDialog(null, "Su salario en total seria : " + sumSalary);
        } else {
            JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO EN OPCIONES.");
        }
    }
}