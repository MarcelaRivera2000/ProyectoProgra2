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
    private String publicidad;

    public Subastador() {
        super();
    }

    public Subastador(String publicidad) {
        this.publicidad = publicidad;
    }

    public ArrayList<Autos> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Autos> autos) {
        this.autos = autos;
    }

    public String getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(String publicidad) {
        this.publicidad = publicidad;
    }

    @Override
    public String toString() {
        return "Subastador{" + "autos=" + autos + ", publicidad=" + publicidad + '}';
    }
    
    
}
