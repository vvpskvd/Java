package OPERADORES; //IGNORAR ESTO

public class operadoresAritmeticos
{
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        float resultado = 0;

        //sumar
        resultado = a + b;
        System.out.println("resultado = " + resultado);

        //resta
        resultado = a - b;
        System.out.println("resultado = " + resultado);

        //multiplicar
        resultado = a * b;
        System.out.println("resultado = " + resultado);

        //dividir
        resultado = (float) a / b;
        System.out.println("resultado = " + resultado);

        //residuo
        resultado = a % b;
        System.out.println("resultado = " + resultado);
    }
}
