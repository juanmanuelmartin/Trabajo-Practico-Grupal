
package dirigida.a.eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.ClienteChat;

public class MiVentana extends JFrame{
    
    public MiVentana(){
        //Iniciar ventana
        IniciarVentana();
        //Iniciar componentes
        IniciarComponentes();
        setVisible(true);
    }
    
    public void IniciarVentana(){
        setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        setResizable(false);
    }
    
    public void IniciarComponentes(){
        JTextArea area = new JTextArea();
        area.setBounds(10,10,460,320);
        
        JCheckBox checkbox = new JCheckBox();
        checkbox.setBounds(10, 340, 200, 20);
        checkbox.setText("Agregar al final");
        
        JTextField field = new JTextField();
        field.setBounds(10, 380, 450, 25);
        
        JButton  botonEnviar = new JButton();
        botonEnviar.setBounds(270, 410, 100, 30);
        botonEnviar.setText("Enviar");
        JButton botonBorrar = new JButton();
        botonBorrar.setBounds(380, 410, 100, 30);
        botonBorrar.setText("Borrar");
        
        ClienteChat cliente = new ClienteChat("192.168.61.11","2000",area);
        cliente.conectar();
        
        
        add(field);
        add(botonEnviar);
        add(botonBorrar);
        add(area);
        add(checkbox);
        
                   
        botonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(checkbox.isSelected()){
                    cliente.EnviarMensaje("juani", field.getText());
                    field.setText("");
                }else{
                    String texto = area.getText();
                    cliente.EnviarMensaje("juani", field.getText());
                    field.setText("");
                }
                
            }
            
        });
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int optionPane = JOptionPane
                .showConfirmDialog(rootPane,
                        "Estas Seguro",
                        "Cuidado",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if(optionPane == JOptionPane.YES_OPTION){
                    area.setText("");
                }
            }
    } );
    
    }
}

