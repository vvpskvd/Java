package ENTRADA_CONSOLA; //IGNORAR ESTO

public class formateoCadenas
{
    public static void main(String[] args) {
        var nombre = "Juan";
        var edad = 30;
        var salario = 25000.355;

        // |1| - string.format
        var mensaje = String.format("\nNombre : %s \nEdad : %d \nSalario : %.1f",
                nombre, edad, salario);
        System.out.println("** Mensaje formateado ***" + mensaje);

        System.out.println("--------------------------------");
        //Metodo printf
        System.out.println("** Mensaje formateado 2 ***");
        System.out.printf("Nombre : %s \nEdad : %d \nSalario . %.1f \n", nombre, edad, salario);

        // |2| - Formateo con con un text block
        var numEmpleado = 12;

        /*El %04d es para que si el numero de empleado que es 12
            no tiene 4 digitos añadir ceros a la izquierda hasta que cumpla 4 digitos */
        mensaje = """
                \nDetalle de la Persona con un text block normal:\s
                ------------------------------------------------
                \tNombre       : %s
                \tNo. Empleado : %04d
                \tEdad         : %d años
                \tSalario      : $%.1f COP
                """.formatted(nombre, numEmpleado, edad, salario);
        System.out.println(mensaje);

        // |3| - Formateo pero con printf como un text block
        System.out.printf("""
                \nDetalle de la Persona con printf:\s
                -----------------------------------
                \tNombre       : %s
                \tNo. Empleado : %04d
                \tEdad         : %d años
                \tSalario      : $%.1f COP
                """, nombre, numEmpleado, edad, salario);
    }
}
