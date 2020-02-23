/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

/**
 *
 * @author Mvrivera
 */
public class Cliente extends Usuario {
    private String membrecia;
    public Cliente() {
    }

    public Cliente( String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha) {
       super(tipo, usuario, contra, nombre, pais, correo, ubicacion, fecha);
        this.membrecia = membrecia;
    }

    public String getMembrecia() {
        return membrecia;
    }

    public void setMembrecia(String membrecia) {
        this.membrecia = membrecia;
    }

    @Override
    public String toString() {
        return "Cliente{" +super.toString()+ "membrecia=" + membrecia + '}';
    }

    
  
    
    
    
    
}
