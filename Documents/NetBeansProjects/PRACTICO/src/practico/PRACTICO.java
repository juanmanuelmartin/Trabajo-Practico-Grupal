package practico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PRACTICO {


    public static void main(String[] args) {
        ventanaLogin vL = new ventanaLogin();
        
        vL.orco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        } );
        vL.caballero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        } );
        vL.arquero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        } );
        vL.mago.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
            
        } );
        
        
        
//---------------------------------------------------------------------------------------
        
        PiedraPapelTijeras ppt = new PiedraPapelTijeras();
        Ventana ventana = new Ventana();

        ventana.botonpapel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int elecPc = ppt.eleccionPc();
                int elecUs = ppt.eleccionUsuario("papel");
                int ganador = ppt.ganador(elecUs, elecPc);
                if(ganador == 1){
                    
                }if(ganador == 0){
                    
                }
            }
            
        } );
        ventana.botonpiedra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int elecPc = ppt.eleccionPc();
                int elecUs = ppt.eleccionUsuario("piedra");
                int ganador = ppt.ganador(elecUs, elecPc);
                if(ganador == 1){
                    
                }if(ganador == 0){
                    
                }
            }
            
        } );
        ventana.botontijeras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int elecPc = ppt.eleccionPc();
                int elecUs = ppt.eleccionUsuario("tijeras");
                int ganador = ppt.ganador(elecUs, elecPc);
                if(ganador == 1){
                    
                }if(ganador == 0){
                    
                }
            }
            
        } );
        ventana.setVisible(true);
    }
    
}
