package practico;

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
                    return false;
            } else {
                    return true;
            }
    }

    public void atacar(Caballero c,Ventana v) {
            v.texto.setText(nombre + " ataca!");
            int daño = ataque;
            c.recibirDaño(daño);
            c.Strecibitdaño(daño, v);
            xp += 10;
            contulti += 10;
    }

    public void recibirDaño(int daño) {
            int golpe = daño + defensa;
            salud -= golpe;
    }
    public void Strecibitdaño(int daño,Ventana v){
        v.texto.setText(nombre + " le queda " + salud + " de salud.");
    }
    public int ultim(Caballero c,Ventana v) {
                boolean ultidis;  
                int dañoulti = 0;
                if(contulti==100){
                v.texto.setText("Habilidad especial  del orco dsiponible");
                ultidis = true;
                }else{
                ultidis = false;
                v.texto.setText("Habilidad especial del orco en preparación");
                }
                if(ultidis){
                v.texto.setText("El " + nombre + " ha utilizado su habilidad especial");
                dañoulti = 500;
              }
                return dañoulti;
    }
    public void recibirUltidelOrco(int dañoulti,Ventana v) {
               int golpe = dañoulti + defensa;
               salud -= golpe;
               v.texto.setText(nombre + " recibe " + golpe + " de daño causado por la habilidad especial .");
       }
       public String toString() {
               return nombre + " tiene " + xp + " puntos de experiencia.";
    }
}