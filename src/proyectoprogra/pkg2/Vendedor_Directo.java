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
public class Vendedor_Directo  extends Membrecias {
    private ArrayList<Autos> autos=new ArrayList();
    private String publicidad;
    private int negociaciones;

    public Vendedor_Directo() {
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

    public int getNegociaciones() {
        return negociaciones;
    }

    public void setNegociaciones(int negociaciones) {
        this.negociaciones = negociaciones;
    }

    @Override
    public String toString() {
        return "Vendedor_Directo{" + "autos=" + autos + ", publicidad=" + publicidad + ", negociaciones=" + negociaciones + '}';
    }
     
}
