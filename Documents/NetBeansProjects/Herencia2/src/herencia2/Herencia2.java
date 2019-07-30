
package herencia2;


public class Herencia2 {


    public static void main(String[] args) {
        Libro l = new Libro(false,234,"hola",2002);
        Revista r = new Revista(4,385318,"Matrix",2015);
        
        l.setCodigo(39804268);
        l.setAño(2019);
        System.out.println(l.toString());
        l.setPrestar(true);
        l.Prestado();
        
        r.setCodigo(23456789);
        System.out.println(r.toString());
        
    }

}
