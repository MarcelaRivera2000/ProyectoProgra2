/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Administrador extends Usuario  implements Serializable{
    private ArrayList<Subasta> solicitudes=new ArrayList();
    
    public Administrador() {
        
    }

    public Administrador(String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha) {
        super(tipo, usuario, contra, nombre, pais, correo, ubicacion, fecha);
    }
    public ArrayList<Subasta> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Subasta> solicitudes) {
        this.solicitudes = solicitudes;
    }
    public void nuevaSolicitud(Subasta s) {
        solicitudes.add(s);
    }

    @Override
    public String toString() {
        return "Administrador{" + "solicitudes=" + solicitudes + '}';
    }

    
    
    
    
}
