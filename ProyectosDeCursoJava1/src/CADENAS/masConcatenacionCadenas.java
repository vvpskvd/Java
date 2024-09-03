package CADENAS;

public class masConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas.
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadenaFinal = cadena1 + " " + cadena2;
        System.out.println(cadenaFinal);
        
        //2° Metodo
        cadenaFinal = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadenaFinal usando concat = " + cadenaFinal);

        //3° Metodo
        var constructorCadenas = new StringBuilder(); //PARA MUCHA CANTIDAD DE CADENAS.
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("Usando StringBuilder = " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("Usando stringBuffer = " + resultado);
    }
}
