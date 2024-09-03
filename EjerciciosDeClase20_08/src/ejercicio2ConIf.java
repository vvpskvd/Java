import javax.swing.*;

public class ejercicio2ConIf {
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

        if (pizza == 4)
        {
            if (major == 1) {
                JOptionPane.showMessageDialog(null, "Por cada topping añadido se cobrara $500 pesos extra a su pedido.");
                topps = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos toppings desea añadir?"));
                totalPizza = 25000 + (topps * 500);
                JOptionPane.showMessageDialog(null, "Su precio total es : " + totalPizza);
            } else if (major == 2) {
                JOptionPane.showMessageDialog(null, "Su precio total es : " + 25000);
            }  else {
            JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
            }
        }

        else if (pizza == 8)
        {
            if (major == 1) {
                JOptionPane.showMessageDialog(null, "Por cada topping añadido se cobrara $500 pesos extra a su pedido.");
                topps = Integer.parseInt(JOptionPane.showInputDialog(null,  "¿Cuantos toppings desea añadir?"));
                totalPizza = 30000 + (topps * 500);
                JOptionPane.showMessageDialog(null, "Su precio total es : " + totalPizza);
            } else if (major == 2) {
                JOptionPane.showMessageDialog(null, "Su precio total es : " + 30000);
            } else {
                JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
            }
        }

        else if (pizza == 12){
            if (major == 1) {
                JOptionPane.showMessageDialog(null, "Por cada topping añadido se cobrara $500 pesos extra a su pedido.");
                topps = Integer.parseInt(JOptionPane.showInputDialog(null,  "¿Cuantos toppings desea añadir?"));
                totalPizza = 35000 + (topps * 500);
                JOptionPane.showMessageDialog(null, "Su precio total es : " + totalPizza);
            } else if (major == 2) {
                JOptionPane.showMessageDialog(null, "Su precio total es : " + 35000);
            } else {
                JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
            }
        }

        else {
            JOptionPane.showMessageDialog(null, "NUMERO NO VALIDO.");
        }
    }
}