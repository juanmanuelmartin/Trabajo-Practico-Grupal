package practico;

public class Orco extends Personajes{
    
    private int salud;
    private int ataque;
    private int defensa;

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
    }

    public void recibirDaño(int daño) {
            int golpe = daño + defensa;
            salud -= golpe;
            System.out.println(nombre + " recibe " + golpe + " de daño.");
    }

    @Override
    public String toString() {
            return nombre + " tiene " + xp + " puntos de experiencia.";
    }
}
