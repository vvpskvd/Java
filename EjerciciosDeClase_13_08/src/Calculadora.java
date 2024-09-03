//Library SCANNER
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);

        boolean major = true;

        while (major) {

            System.out.print("¿Que operacion desea hacer en la CALCUDADORA DE JAVA : \n 1 - SUMA \n 2 - RESTA \n 3 - MULTIPLICACION \n 4 - DIVISION \n 5 - POTENCIA \n 6 - RAIZ \n 7 - LOGARITMO \n 8 - SALIR \n ==> ");
            int num = x.nextInt();

            switch (num) {
                //SUMA
                case 1:
                    System.out.println("Cuantos numeros desea ingresar? : ");
                    int major2 = x.nextInt();
                    float num_final_sum = 0;

                    for (int i = 1 ; i <= major2 ; i++) {
                        System.out.println("Numero " + i + " : ");
                        float num2 = x.nextFloat();
                        num_final_sum += num2;
                    }

                    System.out.println("Resultado de la suma : " + num_final_sum);
                break;

                //RESTA
                case 2:
                    System.out.println("Cuantos numeros desea ingresar? : ");
                    int major3 = x.nextInt();

                    if (major3 > 0) {
                        System.out.println("Numero 1 : ");
                        float num_final_rest = x.nextFloat();

                        for (int i = 2; i <= major3; i++) {
                            System.out.println("Numero " + i + " : ");
                            float num2 = x.nextFloat();
                            num_final_rest -= num2;
                        }

                        System.out.println("Resultado de la resta: " + num_final_rest);
                    } else {

                        float num_final_rest = 0;
                        for (int i = 1; i <= major3; i++) {
                            System.out.println("Numero " + i + " : ");
                            float num2 = x.nextFloat();
                            num_final_rest -= num2;
                        }

                        System.out.println("Resultado de la resta: " + num_final_rest);
                    }
                break;

                //MULTIPLICACION
                case 3:
                    System.out.println("Cuantos numeros desea ingresar? : ");
                    int major4 = x.nextInt();
                    float num_final_mult = 1;

                    for (int i = 1 ; i <= major4 ; i++) {
                        System.out.println("Numero " + i + " : ");
                        float num2 = x.nextFloat();
                        num_final_mult *= num2;
                    }

                    System.out.println("Resultado de la multiplicacion : " + num_final_mult);
                break;

                //DIVISION
                case 4:
                    System.out.println("Cuantos numeros desea ingresar? : ");
                    int major5 = x.nextInt();

                    if (major5 > 0) {
                        System.out.println("Numero 1 : ");
                        float num_final_div = x.nextFloat();

                        for (int i = 2; i <= major5; i++) {
                            System.out.println("Numero " + i + " : ");
                            float num2 = x.nextFloat();

                            if (num2 != 0) {
                                num_final_div /= num2;
                            } else {
                                System.out.println("Division por 0 no permitida. Se pasara al siguiente numero...");
                            }
                        }

                        System.out.println("Resultado de la division: " + num_final_div);
                    } else {
                        System.out.println("Debe ingresar al menos un número.");
                    }
                 break;

                //POTENCIA
                case 5:
                    System.out.println("Que numero desea potenciar :");
                    float num_a_elevar = x.nextFloat();
                    System.out.println("A que numero elevar? :");
                    float num_final_poten = x.nextFloat();
                    float num_pot = 1;

                    for (int i = 1; i <= num_final_poten; i++) {
                        num_pot *= num_a_elevar;
                    }
                    System.out.println("El resultado de la potencia es :" + num_pot);
                break;

                //RAIZ
                case 6:
                    System.out.println("Ingresa el numero a elevar a raiz cuadrada :");
                    float num_raiz = x.nextFloat();
                    System.out.println("El resultado de la raiz cuadrada es : " + Math.sqrt(num_raiz));
                break;

                //LOGARITMO
                case 7:
                    System.out.println("Ingresa el numero a elevar a logaritmo de 10 :");
                    float num_log = x.nextFloat();
                    System.out.println("El resultado de " + num_log + " al logaritmo de 10 es : " + Math.log10(num_log));
                break;

                //SALIR
                case 8:
                    major = false;
                break;
            }
        }
    }
}