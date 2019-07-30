/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author JUAN
 */
class Revista extends Publicacion{
    private int numero;

    public Revista() {
        this.numero = 0;
    }

    public Revista(int numero, int codigo, String titulo, int año) {
        super(codigo, titulo, año);
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Revista{"+ super.toString() + "numero=" + numero + '}';
    }


    
    
    
}
