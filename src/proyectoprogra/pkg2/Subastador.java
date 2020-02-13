/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Subastador extends Membrecias{
    private ArrayList<Autos> autos=new ArrayList();
    private ArrayList<String> publicidad=new ArrayList();

    public Subastador() {
       
    }

    public Subastador(String tipo, String descripcion) {
        super(tipo, descripcion);
    }
    
    
    public Subastador(ArrayList publicidad) {
        this.publicidad = publicidad;
    }

    public ArrayList<Autos> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Autos> autos) {
        this.autos = autos;
    }

    public ArrayList getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(ArrayList publicidad) {
        this.publicidad = publicidad;
    }

    @Override
    public String toString() {
        return "Subastador{" + "autos=" + autos + ", publicidad=" + publicidad + '}';
    }
    
    
}
