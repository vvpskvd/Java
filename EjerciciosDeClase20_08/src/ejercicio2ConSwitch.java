import javax.swing.*;

public class ejercicio2ConSwitch {
    public static void main(String[] args) {
        int pizza;
        int major;
        int topps;
        double totalPizza;

        pizza = Integer.parseInt(JOptionPane.showInputDialog(null, "PRECIOS DE PORCIONES DE PIZZA \n" +
                "4 PORCIONES = $25.000 \n" +
                "8 PORCIONES = $30.000 \n" +
                "12 PORCIONES = $35.000 \n" +
                "Cuantas porciones desea comprar su pizza? 4 / 8 / 12"));

        major = Integer.parseInt(JOptionPane.showInputDialog(null,  "¿Desea añadir toppings? \n" +
                "1 - SI quiero añadir Toppings. \n" +
                "2 - NO quiero añadir Toppings."));

        switch (pizza)
        {
            case 4:
                switch (major) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Por cada topping añadido se cobrara $500 pesos extra a su pedido.");
                        topps = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos toppings desea añadir?"));
                        totalPizza = 25000 + (topps * 500);
                        JOptionPane.showMessageDialog(null, "Su precio total es : " + totalPizza);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Su precio total es : " + 25000);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
                        break;
                }
            break;

            case 8:
                switch (major) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Por cada topping añadido se cobrara $500 pesos extra a su pedido.");
                        topps = Integer.parseInt(JOptionPane.showInputDialog(null,  "¿Cuantos toppings desea añadir?"));
                        totalPizza = 30000 + (topps * 500);
                        JOptionPane.showMessageDialog(null, "Su precio total es : " + totalPizza);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Su precio total es : " + 30000);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
                        break;
                }
            break;

            case 12:
                switch (major) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Por cada topping añadido se cobrara $500 pesos extra a su pedido.");
                        topps = Integer.parseInt(JOptionPane.showInputDialog(null,  "¿Cuantos toppings desea añadir?"));
                        totalPizza = 35000 + (topps * 500);
                        JOptionPane.showMessageDialog(null, "Su precio total es : " + totalPizza);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Su precio total es : " + 35000);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
                        break;
                }
            break;
            default:
                JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
            break;
        }
    }
}