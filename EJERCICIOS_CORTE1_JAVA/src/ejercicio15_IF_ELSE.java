import javax.swing.*;
public class ejercicio15_IF_ELSE
{ public static void main(String[] args) {
    final var IVA = 0.19;
    var IVA_y_Costo = 0;
    var descuento = 0;
    var total = 0;
    var totalPagar = 0;
    /*
    Un proveedor de computadores ofrece descuento del 10% si la maquina adquirida cuesta 1 000 000 o mas.
    Ademas, independientemente, ofrece el 5% de descuento si la marca es abaco. Determinar cuanto pagara. con IVA incluido.
    Un cliente cualquiera por la compra de un PC.
     */
    var costo = Integer.parseInt(JOptionPane.showInputDialog(null,
            "¿Cual es el precio del PC que desea? : "));

    var marca = JOptionPane.showInputDialog(null,
            "¿Cual es la marca del PC que ud desea?");

    if (costo > 1000000) {
        IVA_y_Costo = (int)(costo * IVA); //Se saca primero el iva
        total = costo + IVA_y_Costo; //Se añade el IVA al costo
        descuento = (int) (total * 0.10); //Se calcula cuanto sera el 10% del total (IVA + costo)
        totalPagar = total - descuento;

        if(marca.equals("Abaco")) {
            var descuento2 = (int)(totalPagar * 0.05);
            totalPagar = totalPagar - descuento2;
            JOptionPane.showMessageDialog(null,
                    "Su total a pagar seria :(mas IVA del 19%) $" + total + "\nPero con el 15% de descuento seria : $" + totalPagar);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Su total a pagar seria :(mas IVA del 19%) $" + total + "\nPero con el 10% de descuento seria : $" + totalPagar);
        }
    }
}
}
