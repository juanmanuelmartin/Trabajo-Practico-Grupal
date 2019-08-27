/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico;

/**
 *
 * @author juanp
 */
public class Orco extends Personajes{
    
    private int salud;
    private int ataque;
    private int defensa;
    private int contulti;

    public Orco(int salud, int ataque, int defensa, String nombre, int xp) {
        super(nombre, xp);
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    

    public String getSalud() {
            return "" + salud;
    }

    public boolean estaSaludable() {
            if (salud > 0) {
                    return true;
            } else {
                    return false;
            }
    }

    public void atacar(Caballero o) {
            System.out.println(nombre + " ataca!");
            int daño = ataque;
            o.recibirDaño(daño);
            xp += 10;
            contulti += 10;
    }

    public void recibirDaño(int daño) {
            int golpe = daño + defensa;
            salud -= golpe;
            System.out.println(nombre + " recibe " + golpe + " de daño.");
    }
    public int ultim(Caballero o) {
            boolean ultidis;  
            int dañoulti = 0;
            if(contulti==100){
            System.out.println("Habilidad especial  del orco dsiponible");
            ultidis = true;
            }else{
            ultidis = false;
            System.out.println("Habilidad especial del orco en preparación");
            }
            if(ultidis){
            System.out.println("El " + nombre + " ha utilizado su habilidad especial");
            dañoulti = 400;
          }
            return dañoulti;
    }
 public void recibirUltiOrco(int daño) {
            int golpe = o.dañoulti + defensa;
            salud -= golpe;
            System.out.println(nombre + " recibe " + golpe + " de daño causado por la habilidad especial .");
    }
 public void recibirUltiCaballero(int daño) {
            int golpe = c.dañoulti + defensa;
            salud -= golpe;
            System.out.println(nombre + " recibe " + golpe + " de daño causado por la habilidad especial .");
    }
 public void recibirUltiMago(int daño) {
            int golpe = m.dañoulti + defensa;
            salud -= golpe;
            System.out.println(nombre + " recibe " + golpe + " de daño causado por la habilidad especial .");
    }
    public String toString() {
            return nombre + " tiene " + xp + " puntos de experiencia.";
    }
}

