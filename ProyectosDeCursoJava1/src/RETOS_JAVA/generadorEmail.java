package RETOS_JAVA; //IGNORAR ESTO
import javax.swing.*;

public class generadorEmail {
    public static void main(String[] args) {
        var nombreEmail = JOptionPane.showInputDialog(null, "Digite su nombre completo");
        nombreEmail = nombreEmail.trim();
        nombreEmail = nombreEmail.replaceAll(" ", "");
        nombreEmail = nombreEmail.toLowerCase();

        var empresaEmail = JOptionPane.showInputDialog(null, "Digite la empresa de trabajo");
        empresaEmail = empresaEmail.trim();
        empresaEmail = empresaEmail.replaceAll(" ", "");
        empresaEmail = empresaEmail.toLowerCase();

        var dominioEmail = JOptionPane.showInputDialog(null, "Digite la el dominio a escojer de trabajo\nDOMINIOS DISPOBILES = COM \\ CO \\ GOV ");
        dominioEmail = dominioEmail.trim();
        dominioEmail = dominioEmail.replaceAll(" ", "");
        dominioEmail = dominioEmail.toLowerCase();

       var cadenaEmail = new StringBuilder();
       cadenaEmail.append(nombreEmail).append("@").append(empresaEmail).append(".").append(dominioEmail);
       JOptionPane.showMessageDialog(null, cadenaEmail);
    }
}
