package dirigida.a.eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.ClienteChat;

public class DirigidaAEventos {

    public static void main(String[] args) {
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        JCheckBox checkbox = new JCheckBox();
        Object[] message = {
            "Usuario:", username,
            "Contraseña:", password,
            checkbox
        };

        checkbox.setText("Recordame");
        int option = JOptionPane.showConfirmDialog(null, message, "Ingrese Datos", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().equals("juani") && password.getText().equals("elchapo")) {
                System.out.println("Datos Correctos");
                MiVentana ventana = new MiVentana();
            } if(checkbox.isSelected() == true) {
                System.out.println("Datos Correctos");
                MiVentana ventana = new MiVentana(); 
            }else{
                System.out.println("Datos Incorrectos");
            }
            } else {
                System.out.println("Ingreso cancelado");
            }

            }
    
}
