/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico;

/**
 *
 * @author JUAN
 */
public class Caballero extends Personajes{
    
    private int salud;
    private int ataque;
    private int defensa;
    private int contulti;
    private boolean ultidis;

    public Caballero(int salud, int ataque, int defensa, String nombre, int xp) {
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

    public void atacar(Orco o) {
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
    public boolean ultic() {
            boolean ultidis;  
            if(contulti==100){
            System.out.println("Habilidad especial  del caballero dsiponible");
            ultidis = true;
            }else{
            ultidis = false;
            System.out.println("Habilidad especial del caballero en preparación");
            }
            return ultidis; }
    public int ultiu(Orco o){
            int dañoulti = 0;
            if(ultidis){
            System.out.println("El " + nombre + " ha utilizado su habilidad especial");
            dañoulti =380;
          }return dañoulti;
    }
    
    
    
    public void recibirUltiOrco(int daño) {
            int golpe = o.dañoulti + defensa;
            salud -= golpe;
            System.out.println(nombre + " recibe " + golpe + " de daño causado por la habilidad especial .");
    }
    

    @Override
    public String toString() {
            return nombre + " tiene " + xp + " puntos de experiencia.";
    }
}
