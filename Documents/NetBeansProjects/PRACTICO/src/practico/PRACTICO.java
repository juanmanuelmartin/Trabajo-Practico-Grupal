package practico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PRACTICO {


    public static void main(String[] args) {
        VentanaLoginn vL = new VentanaLoginn();     
//---------------------------------------------------------------------------------------
        
        PiedraPapelTijeras ppt = new PiedraPapelTijeras();
        Ventana ventana = new Ventana();
        Orco orco = new Orco(1000,100,150,"alfred",0);
        Caballero caballero = new Caballero(800,120,130,"coca",0);
        batalla b = new batalla();

        ventana.botonpapel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int elecPc = ppt.eleccionPc();
                int elecUs = ppt.eleccionUsuario("papel");
                int ganador = ppt.ganador(elecUs, elecPc);
                if(ganador == 1){
                    b.pelea1(caballero, orco,ventana);
                }if(ganador == 0){
                    b.pelea2(orco, caballero,ventana);
                }else{
                    ventana.texto.setText("han empatado en la eleccion");
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
                    b.pelea1(caballero, orco,ventana);
                }if(ganador == 0){
                    b.pelea2(orco, caballero,ventana);
                }else{
                    ventana.texto.setText("han empatado en la eleccion");
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
                    b.pelea1(caballero, orco,ventana);
                }if(ganador == 0){
                    b.pelea2(orco, caballero,ventana);
                }else{
                    ventana.texto.setText("han empatado en la eleccion");
                }
            }
            
        } );
        ventana.setVisible(true);
    }
    
}
