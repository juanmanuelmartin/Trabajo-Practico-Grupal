/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirigida.a.eventos;

/**
 *
 * @author JUAN
 */
public class Usuario{
    private String Usuario;
    private String Password;
    
    public Usuario() {
        Usuario = "";
        Password = "";
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
