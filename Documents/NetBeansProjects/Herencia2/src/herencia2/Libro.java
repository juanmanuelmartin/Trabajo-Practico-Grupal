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
class Libro extends Publicacion{
    private boolean prestar;

    public Libro() {
        prestar = false;
    }

    public Libro(boolean prestar, int codigo, String titulo, int año) {
        super(codigo, titulo, año);
        this.prestar = prestar;
    }

    public void setPrestar(boolean prestar) {
        this.prestar = prestar;
    }

    public boolean getPrestar() {
        return prestar;
    }

     public void Prestado(){
        if(prestar == true){
            System.out.println("Este libro fue prestado");
        }else{
            System.out.println("Este libro no fue prestado, esta nuevito");
        }
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString() + "prestar=" + prestar + '}';
    }
    
}
