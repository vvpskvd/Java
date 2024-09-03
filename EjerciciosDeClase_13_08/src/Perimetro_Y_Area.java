//Library SCANNER
import java.util.Scanner;

//Main class to PERIMETRO Y AREA
public class Perimetro_Y_Area {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("INGRESE EL NUMERO DE UN EJERCICIO A CALCULAR = (TRIANGULOS = 1 / CUADRADOS = 2 / RECTANGULOS = 3 ) : ");
        int major = x.nextInt();

        switch (major) {
            //TRIANGULOS
            case 1:
                System.out.print("Que operacion desea hacer en un TRIANGULO (AREA = 1 // PERIMETRO = 2) : ");
                int major2 = x.nextInt();
                switch (major2) {
                    //AREA DE TRIANGULO
                    case 1:
                        System.out.print("Ingresa la base a calcular TRIANGULO : ");
                        float base = x.nextFloat();
                        System.out.print("Ingresa la altura a calcular para TRIANGULO : ");
                        float altura = x.nextFloat();

                        float ar_triangulo = (base * altura) / 2;
                        System.out.println("El area final del triangulo es : " + ar_triangulo);
                        break;
                    //PERIMETRO DE TRIANGULO
                    case 2:
                        System.out.print("Ingresa la medida del lado 1 del TRIANGULO : ");
                        float lado1 = x.nextFloat();
                        System.out.print("Ingresa la medida del lado 2 del TRIANGULO : ");
                        float lado2 = x.nextFloat();
                        System.out.print("Ingresa la medida del lado 3 del TRIANGULO : ");
                        float lado3 = x.nextFloat();

                        float per_triangulo = lado1 + lado2 + lado3;
                        System.out.println("El perimetro final del triangulo es : " + per_triangulo);
                        break;
                }
                break;
            //CUADRADOS
            case 2:
                System.out.print("Que operacion desea hacer en un CUADRADO (AREA = 1 // PERIMETRO = 2) : ");
                int major3 = x.nextInt();
                switch (major3) {
                    //AREA
                    case 1:
                        System.out.print("Ingrese lado 1 :");
                        float lado_area_cuadro1 = x.nextFloat();
                        System.out.print("Ingrese lado 2 :");
                        float lado_area_cuadro2 = x.nextFloat();
                        float area_final_cuadrado = lado_area_cuadro1 * lado_area_cuadro2;
                        System.out.println("El area total es : " + area_final_cuadrado);
                        break;
                    //PERIMETRO
                    case 2:
                        System.out.print("Ingrese lado 1 :");
                        float lado1 = x.nextFloat();
                        System.out.print("Ingrese lado 2 :");
                        float lado2 = x.nextFloat();
                        System.out.print("Ingrese lado 3 :");
                        float lado3 = x.nextFloat();
                        System.out.print("Ingrese lado 4 :");
                        float lado4 = x.nextFloat();
                        float per_cuadrado = lado1 + lado2 + lado3 + lado4;
                        System.out.println("El perimetro total es : " + per_cuadrado);
                        break;
                }
                break;
            //RECTANGULOS
            case 3:
                System.out.print("Que operacion desea hacer en un RECTANGULO (AREA = 1 // PERIMETRO 2) : ");
                int major4 = x.nextInt();
                switch (major4) {
                    //AREA
                    case 1:
                        System.out.print("Ingrese Largo : ");
                        float largo_rec = x.nextFloat();
                        System.out.print("Ingrese Ancho : ");
                        float ancho_rec = x.nextFloat();
                        float area_tot = largo_rec * ancho_rec;
                        System.out.print("El area total es : " + area_tot);
                        break;
                    //PERIMETRO
                    case 2:
                        System.out.print("Ingrese Largo :");
                        float largo_rec_per = x.nextFloat();
                        System.out.print("Ingrese Ancho :");
                        float ancho_rec_per = x.nextFloat();
                        float per_total = largo_rec_per * ancho_rec_per;
                        System.out.print("El perimetro total es : " + per_total);
                        break;
                }
                break;
        }
    }
}
